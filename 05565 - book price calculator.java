import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int totalPrice = sc.nextInt();
    
    int[] knownPrices = new int[9];
    for (int i = 0; i < 9; i++) {
      knownPrices[i] = sc.nextInt();
    }
    
    int missingPrice = findMissingBookPrice(totalPrice, knownPrices);
    
    System.out.println(missingPrice);
  }
  
  private static int findMissingBookPrice(int totalPrice, int[] knownPrices) {
    int sumOfKnownPrices = 0;
    for (int price : knownPrices) {
      sumOfKnownPrices += price;
    }
    return totalPrice - sumOfKnownPrices;
  }
}
