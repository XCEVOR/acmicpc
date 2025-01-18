import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int caseNumber = 1;
    
    while (true) {
      // 사용자 입력 받기 (세 변의 길이)
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      
      // 종료 조건 확인
      if (isEndCondition(a, b, c)) {
        break;
      }
      
      // 케이스 번호 출력
      System.out.printf("Triangle #%d\n", caseNumber);
      // 입력된 값으로 삼각형 계산 처리
      processCase(a, b, c);
      
      caseNumber++;
    }
  }
  
  // 프로그램 종료 조건 확인 (모든 변이 0인 경우)
  private static boolean isEndCondition(double a, double b, double c) {
    return a == 0 && b == 0 && c == 0;
  }
  
  // 입력된 변의 길이에 따라 적절한 계산 수행
  private static void processCase(double a, double b, double c) {
    if (a == -1) { // a가 비어 있는 경우 계산
      calculateA(b, c);
    } else if (b == -1) { // b가 비어 있는 경우 계산
      calculateB(a, c);
    } else if (c == -1) { // c가 비어 있는 경우 계산
      calculateC(a, b);
    } else { // 모든 값이 주어진 경우 불가능 처리
      System.out.println("Impossible.\n");
    }
  }
  
  // a 계산 (b와 c로부터 계산)
  private static void calculateA(double b, double c) {
    if (b > 0 && c > 0 && b < c) { // 유효한 삼각형 조건 확인
      double aCalculated = Math.sqrt(c * c - b * b); // 피타고라스 정리 적용
      System.out.printf("a = %.3f\n\n", aCalculated);
    } else { // 삼각형 조건에 맞지 않으면 불가능 출력
      System.out.println("Impossible.\n");
    }
  }
  
  // b 계산 (a와 c로부터 계산)
  private static void calculateB(double a, double c) {
    if (a > 0 && c > 0 && a < c) { // 유효한 삼각형 조건 확인
      double bCalculated = Math.sqrt(c * c - a * a); // 피타고라스 정리 적용
      System.out.printf("b = %.3f\n\n", bCalculated);
    } else { // 삼각형 조건에 맞지 않으면 불가능 출력
      System.out.println("Impossible.\n");
    }
  }
  
  // c 계산 (a와 b로부터 계산)
  private static void calculateC(double a, double b) {
    if (a > 0 && b > 0) { // 유효한 삼각형 조건 확인
      double cCalculated = Math.sqrt(a * a + b * b); // 피타고라스 정리 적용
      System.out.printf("c = %.3f\n\n", cCalculated);
    } else { // 삼각형 조건에 맞지 않으면 불가능 출력
      System.out.println("Impossible.\n");
    }
  }
}



/*

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 
각 테스트 케이스는 한 줄로 이루어져 있고, 직각 삼각형의 세 변의 길이 a, b, c가 주어진다. 
a, b, c중 하나는 -1이며, -1은 알 수 없는 변의 길이이다. 다른 두 수는 10,000보다 작거나 같은 자연수이다.
입력의 마지막 줄에는 0이 세 개 주어진다.

출력
각 테스트 케이스에 대해서, 입력으로 주어진 길이로 직각 삼각형을 만들 수 있다면, "s = l"을 출력한다. 
s는 길이가 주어지지 않은 변의 이름이고, l은 길이이다. 
l은 소수점 셋째 자리까지 출력한다. 
삼각형을 만들 수 없는 경우에는 "Impossible."을 출력한다.

*/
