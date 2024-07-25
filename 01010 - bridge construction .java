import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int T = sc.nextInt();
    
    for (int t = 0; t < T; t++) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      
      long result = countBridges(N, M);
      
      System.out.println(result);
    }
  }
  
  private static long countBridges(int N, int M) {
    long[][] dp = new long[N + 1][M + 1];
    
    for (int j = 0; j <= M; j++) {
      dp[0][j] = 1;
    }
    
    for (int n = 1; n <= N; n++) {
      for (int m = n; m <= M; m++) {
        dp[n][m] = dp[n][m - 1] + dp[n - 1][m - 1];
      }
    }
    
    return dp[N][M];
  }
}
