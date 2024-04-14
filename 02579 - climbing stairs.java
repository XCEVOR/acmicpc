import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 계단의 개수 입력
        int n = sc.nextInt();
        // 계단의 점수를 저장할 배열 생성
        int[] stairs = new int[n + 1];
        
        // 각 계단의 점수 입력
        for (int i = 1; i <= n; i++) {
            stairs[i] = sc.nextInt();
        }
        
        // 다이나믹 프로그래밍을 위한 배열 생성
        int[] dp = new int[n + 1];
        
        // maxScore 함수 호출하여 결과 출력
        int result = maxScore(n, stairs, dp);
        System.out.println(result);
    }
    
    // 최대 점수를 계산하는 함수
    private static int maxScore(int n, int[] stairs, int[] dp) {
        // 첫 번째 계단의 점수를 dp 배열에 저장
        dp[1] = stairs[1];
        
        // 두 번째 계단까지의 최대 점수 계산
        if (n >= 2) {
            dp[2] = stairs[1] + stairs[2];
        }
        
        // 세 번째 계단부터는 다이나믹 프로그래밍을 통해 최대 점수 계산
        for (int i = 3; i <= n; i++) {
            // 현재 계단을 밟는 경우와 이전 계단을 밟지 않는 경우 중 큰 값을 선택하여 저장
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
        }
        
        // 마지막 계단까지의 최대 점수 반환
        return dp[n];
    }
}
