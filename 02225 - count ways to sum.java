import java.util.Scanner;

public class Main {
    static final int MODULUS = 1_000_000_000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 입력 받기
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        // countWaysToSum 함수 호출 및 결과 출력
        int result = countWaysToSum(N, K);
        System.out.println(result);
    }
    
    // N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수를 계산하는 함수
    private static int countWaysToSum(int N, int K) {
        // dp 배열 초기화
        int[][] dp = new int[K + 1][N + 1];
        dp[0][0] = 1;  // 초기값 설정
        
        // 다이나믹 프로그래밍
        for (int i = 1; i <= K; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= j; k++) {
                    // 이전 단계에서 j-k를 만드는 경우의 수를 현재 단계에 더하고 MODULUS로 나눔
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % MODULUS;
                }
            }
        }
        
        // 최종 결과 반환
        return dp[K][N];
    }
}
