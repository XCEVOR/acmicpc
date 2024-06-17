import java.util.Scanner;

public class Main {
  // 결과를 나눌 값으로 9901을 상수로 정의
  static final int MOD = 9901;
  
  public static void main(String[] args) {
    // 사용자 입력을 받기 위한 Scanner 객체 생성
    Scanner sc = new Scanner(System.in);
    
    // 우리의 크기 N을 입력 받음
    int N = sc.nextInt();
    
    // 사자 배치 경우의 수를 계산하는 메서드 호출
    int result = solveLionPlacement(N);
    
    // 결과 출력
    System.out.println(result);
  }
  
  // 사자 배치 경우의 수를 구하는 메서드
  private static int solveLionPlacement(int N) {
    // 다이나믹 프로그래밍 배열 생성, 크기는 N+1 x 3
    int[][] dp = new int[N + 1][3];
    
    // 초기값 설정: 첫 번째 칸에 사자가 없는 경우
    dp[1][0] = 1;
    // 초기값 설정: 첫 번째 칸의 왼쪽에 사자가 있는 경우
    dp[1][1] = 1;
    // 초기값 설정: 첫 번째 칸의 오른쪽에 사자가 있는 경우
    dp[1][2] = 1;
    
    // 2번째 칸부터 N번째 칸까지 순회하며 경우의 수 계산
    for (int i = 2; i <= N; i++) {
      // i번째 칸에 사자가 없는 경우
      dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % MOD;
      // i번째 칸의 왼쪽에 사자가 있는 경우
      dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
      // i번째 칸의 오른쪽에 사자가 있는 경우
      dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
    }
    
    // 모든 경우의 수를 더하고 9901로 나눈 나머지 반환
    return (dp[N][0] + dp[N][1] + dp[N][2]) % MOD;
  }
}



/*

input
77

output
9304

*/
