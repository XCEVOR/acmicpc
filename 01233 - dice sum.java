import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();
        
        // 가장 빈도가 높은 주사위 합을 찾는 함수 호출
        int result = findMostFrequentDiceSum(S1, S2, S3);
        
        // 결과 출력
        System.out.println(result);
    }
    
    // 가장 빈도가 높은 주사위 합을 찾는 함수
    public static int findMostFrequentDiceSum(int S1, int S2, int S3) {
        // 주사위 합의 빈도수를 저장할 배열
        int[] diceSumFrequency = new int[S1 + S2 + S3 + 1];
        
        // 모든 주사위의 눈을 돌면서 합의 빈도수를 계산
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    // 주사위 합의 빈도수 증가
                    diceSumFrequency[i + j + k]++;
                }
            }
        }
        
        int maxFrequency = 0; // 가장 높은 빈도수
        int result = 0; // 결과값을 저장할 변수
        for (int sum = 3; sum <= S1 + S2 + S3; sum++) {
            if (diceSumFrequency[sum] > maxFrequency) {
                // 현재 합의 빈도수가 최댓값보다 크면
                maxFrequency = diceSumFrequency[sum]; // 최댓값 갱신
                result = sum; // 결과값 갱신
            }
        }
        
        // 가장 높은 빈도수를 가진 주사위 합 반환
        return result;
    }
}
