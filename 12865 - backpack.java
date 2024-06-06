import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 물품의 수 N과 배낭의 최대 무게 K를 입력
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    // 물품의 무게와 가치를 저장할 배열 생성
    int[] weights = new int[N];
    int[] values = new int[N];
    
    // 각 물품의 무게와 가치를 입력받아 배열에 저장
    for (int i = 0; i < N; i++) {
      weights[i] = sc.nextInt();
      values[i] = sc.nextInt();
    }
    
    // 배낭 문제 해결 함수 호출하여 최대 가치를 계산
    int maxValue = solveKnapsack(N, K, weights, values);
    
    // 최대 가치를 출력
    System.out.println(maxValue);
  }
  
  // 배낭 문제를 해결하는 메서드
  private static int solveKnapsack(int N, int K, int[] weights, int[] values) {
    // DP 배열 선언 및 초기화, dp[i]는 무게 i까지 배낭에 담을 수 있는 최대 가치를 저장
    int[] dp = new int[K + 1];
    
    // 모든 물품에 대해 반복
    for (int i = 0; i < N; i++) {
      // 현재 물품의 무게와 가치
      int weight = weights[i];
      int value = values[i];
      
      // 현재 물품을 포함할 수 있는 경우, DP 배열을 업데이트
      // 여기서 K부터 weight까지 역순으로 순회하는 이유는 같은 물품이 중복해서 선택되는 것을 방지하기 위함
      for (int j = K; j >= weight; j--) {
        // 현재 무게 j에서의 최대 가치는 물품을 포함하지 않을 때와 포함할 때 중 더 큰 값으로 갱신
        dp[j] = Math.max(dp[j], dp[j - weight] + value);
      }
    }
    
    // 무게 K에서의 최대 가치를 반환
    return dp[K];
  }
}
