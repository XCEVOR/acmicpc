import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 테스트 케이스의 수 T를 입력
    int T = sc.nextInt();
    
    // 각 테스트 케이스에 대해 반복
    for (int t = 0; t < T; t++) {
      // 서쪽 사이트의 수 N과 동쪽 사이트의 수 M을 입력
      int N = sc.nextInt();
      int M = sc.nextInt();
      
      // 주어진 N과 M에 대해 다리의 경우의 수를 계산
      long result = countBridges(N, M);
      
      // 결과 출력
      System.out.println(result);
    }
  }
  
  // 다리의 경우의 수를 계산하는 메서드
  private static long countBridges(int N, int M) {
    long[][] dp = new long[N + 1][M + 1];
    
    // 다리 0개를 지을 경우의 수는 1 (모든 경우에 대해)
    for (int j = 0; j <= M; j++) {
      dp[0][j] = 1;
    }
    
    // 다이나믹 프로그래밍을 이용하여 경우의 수 계산
    for (int n = 1; n <= N; n++) {
      for (int m = n; m <= M; m++) {
        // 현재 n개의 서쪽 사이트와 m개의 동쪽 사이트에서 가능한 경우의 수
        dp[n][m] = dp[n][m - 1] + dp[n - 1][m - 1];
        // dp[n][m - 1] : m번째 동쪽 사이트와 연결하지 않는 경우
        // dp[n - 1][m - 1] : m번째 동쪽 사이트와 연결하는 경우
      }
    }
    
    // N개의 서쪽 사이트와 M개의 동쪽 사이트를 연결하는 경우의 수 반환
    return dp[N][M];
  }
}



/*

입력
입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 그 다음 줄부터 각각의 테스트케이스에 대해 강의 서쪽과 동쪽에 있는 사이트의 개수 정수 N, M (0 < N ≤ M < 30)이 주어진다.

출력
각 테스트 케이스에 대해 주어진 조건하에 다리를 지을 수 있는 경우의 수를 출력한다.

*/
