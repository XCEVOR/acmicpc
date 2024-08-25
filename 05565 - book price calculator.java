import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 첫 번째 입력: 책 10권의 총 가격을 입력
    int totalPrice = sc.nextInt();
    
    // 두 번째 입력부터: 읽을 수 있는 9권의 가격을 배열에 저장
    int[] knownPrices = new int[9];
    for (int i = 0; i < 9; i++) {
      knownPrices[i] = sc.nextInt();
    }
    
    // 읽을 수 없는 책의 가격을 계산하는 메서드 호출
    int missingPrice = findMissingBookPrice(totalPrice, knownPrices);
    
    // 결과 출력: 읽을 수 없는 책의 가격을 출력
    System.out.println(missingPrice);
  }
  
  /**
   * 책 10권의 총 가격과 9권의 가격 배열을 받아
   * 읽을 수 없는 책의 가격을 계산하는 함수
   * 
   * @param totalPrice 책 10권의 총 가격
   * @param knownPrices 읽을 수 있는 9권의 가격 배열
   * @return 읽을 수 없는 책의 가격
   */
  private static int findMissingBookPrice(int totalPrice, int[] knownPrices) {
    // 읽을 수 있는 9권의 책 가격을 합산
    int sumOfKnownPrices = 0;
    for (int price : knownPrices) {
      sumOfKnownPrices += price;
    }
    
    // 총 가격에서 읽을 수 있는 책들의 가격 합을 뺀 값이 읽을 수 없는 책의 가격
    return totalPrice - sumOfKnownPrices;
  }
}
