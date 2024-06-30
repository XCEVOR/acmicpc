import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 도시의 개수 입력
    int N = sc.nextInt();
    // 인접한 도시를 연결하는 도로의 길이 입력
    long[] distances = new long[N-1];
    // 각 도시의 주유소 리터당 가격 입력
    long[] prices = new long[N];
    
    // 도로의 길이 입력 받기
    for (int i = 0; i < N - 1; i++) {
      distances[i] = sc.nextLong();
    }
    
    // 주유소 리터당 가격 입력 받기
    for (int i = 0; i < N; i++) {
      prices[i] = sc.nextLong();
    }
    
    // 최소 비용 계산
    long totalCost = calculateMinimumCost(N, distances, prices);
    
    // 결과 출력
    System.out.println(totalCost);
  }
  
  /**
   * 주어진 도시의 개수, 도로의 길이, 주유소 가격을 이용해
   * 제일 왼쪽 도시에서 제일 오른쪽 도시로 이동하는 최소 비용을 계산하는 메서드
   *
   * @param N 도시의 개수
   * @param distances 인접한 도시를 연결하는 도로의 길이 배열
   * @param prices 각 도시의 주유소 리터당 가격 배열
   * @return 최소 이동 비용
   */
  private static long calculateMinimumCost(int N, long[] distances, long[] prices) {
    long totalCost = 0; // 총 비용 초기화
    long minPrice = prices[0]; // 첫 번째 도시의 주유소 가격을 최소 가격으로 초기화
    
    // 각 도로를 순차적으로 이동하며 최소 비용 계산
    for (int i = 0; i < N - 1; i++) {
      // 현재 도시의 주유소 가격이 최소 가격보다 저렴하면 최소 가격 업데이트
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
      // 최소 가격에 현재 도로의 길이를 곱하여 해당 구간의 비용을 총 비용에 더함
      totalCost += minPrice * distances[i];
    }
    
    return totalCost; // 총 비용 반환
  }
}
