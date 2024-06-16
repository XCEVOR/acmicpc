import java.util.Scanner;

public class Main {
  static final int MOD = 9901;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int result = solveLionPlacement(N);
    
    System.out.println(result);
  }
  
  private static int solveLionPlacement(int N) {
    int[][] dp = new int[N + 1][3];
    
    dp[1][0] = 1;
    dp[1][1] = 1;
    dp[1][2] = 1;
    
    for (int i = 2; i <= N; i++) {
      dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % MOD;
      dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
      dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
    }
    
    return (dp[N][0] + dp[N][1] + dp[N][2]) % MOD;
  }
}
