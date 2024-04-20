import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 인형의 개수 N과 선택할 인형의 개수 K 입력
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        // 인형을 선호하는 사람의 수를 저장할 배열 생성 및 입력
        int[] dolls = new int[N];
        for (int i = 0; i < N; i++) {
            dolls[i] = sc.nextInt();
        }
        
        // 최소 표준 편차를 구하는 메서드 호출
        double minStdDev = findMinStdDev(dolls, K);
        
        // 결과 출력
        System.out.printf("%.11f\n", minStdDev);
    }
    
    // 최소 표준 편차를 구하는 메서드
    private static double findMinStdDev(int[] dolls, int K) {
        // 초기 최소 표준 편차를 Double 형의 최대값으로 설정
        double minStdDev = Double.MAX_VALUE;
        
        // 연속된 K개의 위치에 대해 모든 가능한 경우를 확인
        for (int i = K; i <= dolls.length; i++) {
            for (int j = 0; j <= dolls.length - i; j++) {
                // 현재 위치에서 K개의 인형을 선택하여 평균과 표준 편차를 계산
                double m = mean(dolls, j, i);
                double ret = standardDeviation(dolls, m, j, i);
                // 최소 표준 편차 갱신
                minStdDev = Math.min(minStdDev, ret);
            }
        }
        
        // 최소 표준 편차 반환
        return minStdDev;
    }
    
    // 평균을 구하는 메서드
    private static double mean(int[] arr, int start, int K) {
        double sum = 0.0;
        // 선택된 인형들의 선호하는 사람의 수를 합산
        for (int i = 0; i < K; i++) {
            sum += arr[start + i];
        }
        
        // 평균 반환
        return sum / K;
    }
    
    // 표준 편차를 구하는 메서드
    private static double standardDeviation(int[] arr, double m, int start, int K) {
        double sum = 0.0;
        // 각 인형의 선호하는 사람의 수와 평균의 차이의 제곱을 합산
        for (int i = 0; i < K; i++) {
            sum += Math.pow(arr[start + i] - m, 2);
        }
        
        // 분산 계산 후 제곱근을 취하여 표준 편차 반환
        return Math.sqrt(sum / K);
    }
}
