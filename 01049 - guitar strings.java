import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 필요한 기타줄 개수 N과 브랜드의 개수 M을 입력
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    // 각 브랜드의 패키지 가격과 낱개 가격을 저장할 배열 선언
    int[] packagePrices = new int[M];
    int[] singlePrices = new int[M];
    
    // 각 브랜드의 패키지 가격과 낱개 가격을 입력받아 배열에 저장
    for (int i = 0; i < M; i++) {
      packagePrices[i] = sc.nextInt();
      singlePrices[i] = sc.nextInt();
    }
    
    // 최소 비용을 계산하는 메서드 호출
    int minCost = calculateMinCost(N, M, packagePrices, singlePrices);
    // 계산된 최소 비용을 출력
    System.out.println(minCost);
  }
  
  // 최소 비용을 계산하는 메서드
  private static int calculateMinCost(int N, int M, int[] packagePrices, int[] singlePrices) {
    // 패키지의 최소 가격과 낱개의 최소 가격을 초기화
    int minPackagePrice = Integer.MAX_VALUE;
    int minSinglePrice = Integer.MAX_VALUE;
    
    // 모든 브랜드의 패키지 가격과 낱개 가격을 비교하여 최소 가격을 찾음
    for (int i = 0; i < M; i++) {
      if (packagePrices[i] < minPackagePrice) {
        minPackagePrice = packagePrices[i]; // 패키지의 최소 가격 갱신
      }
      if (singlePrices[i] < minSinglePrice) {
        minSinglePrice = singlePrices[i]; // 낱개의 최소 가격 갱신
      }
    }
    
    // 패키지와 낱개를 혼합하여 살 때의 비용 계산
    int costUsingPackages = (N / 6) * minPackagePrice + (N % 6) * minSinglePrice;
    if (N % 6 != 0) {
      // 남은 줄을 패키지로 살 때와 낱개로 살 때 중 더 저렴한 비용 선택
      costUsingPackages = Math.min(costUsingPackages, ((N / 6) + 1) * minPackagePrice);
    }
    
    // 모든 줄을 낱개로 살 때의 비용 계산
    int costUsingSingles = N * minSinglePrice;
    
    // 두 경우 중 최소 비용을 반환
    return Math.min(costUsingPackages, costUsingSingles);
  }
}
