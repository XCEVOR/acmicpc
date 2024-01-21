import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); // 테스트 케이스 개수 입력
        
        for (int i = 0; i < C; i++) {
            int N = sc.nextInt(); // 학생 수 입력
            int[] scores = new int[N]; // 점수 배열 선언
            
            for (int j = 0; j < N; j++) {
                scores[j] = sc.nextInt(); // 학생들의 점수 입력
            }
            
            double ratio = calculateRatio(scores); // 평균을 넘는 학생들의 비율 계산
            
            System.out.printf("%.3f%%\n", ratio); // 결과 출력
        }
    }
    
    // 평균을 넘는 학생들의 비율을 계산하는 메서드드
    private static double calculateRatio(int[] scores) {
        double average = calculateAverage(scores); // 평균 계산
        int count = 0;
        for (int score : scores) {
            if (score > average) {
                count++; // 평균을 넘는 학생 수 카운트
            }
        }
        return (double) count / scores.length * 100; // 비율 계산하여 반환
    }
    
    // 평균을 계산하는 메서드드
    private static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score; // 점수를 합계에 더함
        }
        return (double) sum / scores.length; // 평균 계산하여 반환
    }
    
}
