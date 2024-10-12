import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 무한 루프를 통해 여러 테스트 케이스를 처리
    while (true) {
      // 사용자로부터 정수 N을 입력
      int N = sc.nextInt();
      
      // 입력이 0이면 루프를 종료.
      if (N == 0) break;
      
      // countUniqueSquares 메서드를 호출하여 결과를 출력
      System.out.println(countUniqueSquares(N));
    }
    
    sc.close();
  }
  
  // 주어진 N에 대해 서로 다른 정사각형의 개수를 계산하는 메서드
  private static int countUniqueSquares(int N) {
    // 총 정사각형 개수를 저장할 변수 초기화
    int totalSquares = 0;
    
    // 1부터 N까지의 각 정사각형 크기에 대해 반복
    for (int k = 1; k <= N; k++) {
      // k 크기의 정사각형이 그리드 내에 들어갈 수 있는 개수 계산
      totalSquares += (N - k + 1) * (N - k + 1);
    }
    
    // 계산된 총 정사각형 개수를 반환
    return totalSquares;
  }
}
