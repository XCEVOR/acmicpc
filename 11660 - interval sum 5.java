import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 표의 크기 N과, 합을 구할 쿼리의 수 M 입력
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    // N×N 크기의 표를 입력받기 위해 배열 초기화
    // 1-based 인덱스를 사용하기 위해 N+1 크기의 배열로 선언
    int[][] arr = new int[N + 1][N + 1];
    
    // 표의 각 값들을 입력받고 arr 배열에 저장
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    
    // 누적합 배열을 계산
    int[][] prefixSum = calculatePrefixSum(N, arr);
    
    // StringBuilder를 사용하여 결과를 한번에 출력할 수 있도록 준비
    StringBuilder sb = new StringBuilder();
    
    // 각 쿼리에 대해 (x1, y1)부터 (x2, y2)까지의 합을 구하고 출력
    for (int i = 0; i < M; i++) {
      int x1 = sc.nextInt();  // 쿼리 시작 x1
      int y1 = sc.nextInt();  // 쿼리 시작 y1
      int x2 = sc.nextInt();  // 쿼리 끝 x2
      int y2 = sc.nextInt();  // 쿼리 끝 y2
      
      // getSum 함수로 (x1, y1)부터 (x2, y2)까지의 합 계산
      int result = getSum(x1, y1, x2, y2, prefixSum);
      
      // 결과를 StringBuilder에 추가 (출력 시 한번에 출력)
      sb.append(result).append("\n");
    }
    
    // 결과 출력
    System.out.print(sb.toString());
  }
  
  // 누적합 계산 메서드
  // 주어진 배열 arr를 이용하여 prefixSum 배열을 계산해서 반환
  private static int[][] calculatePrefixSum(int N, int[][] arr) {
    int[][] prefixSum = new int[N + 1][N + 1];
    
    // (1, 1)부터 (i, j)까지의 합을 구하는 방식으로 누적합 배열 계산
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        // 현재 위치까지의 합 = arr[i][j] + (왼쪽 + 위쪽) - (왼쪽 위 교차 영역)
        prefixSum[i][j] = arr[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
      }
    }
    return prefixSum;
  }
  
  // 특정 범위 (x1, y1)부터 (x2, y2)까지의 합을 구하는 메서드
  private static int getSum(int x1, int y1, int x2, int y2, int[][] prefixSum) {
    // 범위 합을 구하는 공식을 적용
    return prefixSum[x2][y2] - prefixSum[x1 - 1][y2] - prefixSum[x2][y1 - 1] + prefixSum[x1 - 1][y1 - 1];
  }
}
