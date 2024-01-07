import java.util.Scanner;

public class Main {
    static final int MOD = 10007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력값 받기
        int N = sc.nextInt();
        
        // 오르막 수 개수 계산
        int result = countIncreasingNumbers(N);
        
        // 결과 출력
        System.out.println(result);
    }

    public static int countIncreasingNumbers(int N) {
        // dp[i][j]는 길이가 i이고 마지막 숫자가 j인 오르막 수의 개수를 나타냄
        int[][] dp = new int[N + 1][10];
        
        // 길이가 1인 경우, 모든 숫자는 오르막 수이므로 1로 초기화
        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1;
        }
        
        // 길이가 2 이상인 경우
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = j; k <= 9; k++) {
                    // dp 값 계산
                    dp[i][k] = (dp[i][k] + dp[i - 1][j]) % MOD;
                }
            }
        }
        
        // 결과값 계산
        int totalCount = 0;
        for (int i = 0; i <= 9; i++) {
            totalCount = (totalCount + dp[N][i]) % MOD;
        }
        
        return totalCount;
    }
}
