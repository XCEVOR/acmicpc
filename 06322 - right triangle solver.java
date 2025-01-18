import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int caseNumber = 1;
    
    while (true) {
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      
      if (isEndCondition(a, b, c)) {
        break;
      }
      
      System.out.printf("Triangle #%d\n", caseNumber);
      processCase(a, b, c);
      caseNumber++;
    }
  }
  
  private static boolean isEndCondition(double a, double b, double c) {
    return a == 0 && b == 0 && c == 0;
  }
  
  private static void processCase(double a, double b, double c) {
    if (a == -1) {
      calculateA(b, c);
    } else if (b == -1) {
      calculateB(a, c);
    } else if (c == -1) {
      calculateC(a, b);
    } else {
      System.out.println("Impossible.\n");
    }
  }
  
  private static void calculateA(double b, double c) {
    if (b > 0 && c > 0 && b < c) {
      double aCalculated = Math.sqrt(c * c - b * b);
      System.out.printf("a = %.3f\n\n", aCalculated);
    } else {
      System.out.println("Impossible.\n");
    }
  }
  
  private static void calculateB(double a, double c) {
    if (a > 0 && c > 0 && a < c) {
      double bCalculated = Math.sqrt(c * c - a * a);
      System.out.printf("b = %.3f\n\n", bCalculated);
    } else {
      System.out.println("Impossible.\n");
    }
  }
  
  private static void calculateC(double a, double b) {
    if (a > 0 && b > 0) {
      double cCalculated = Math.sqrt(a * a + b * b);
      System.out.printf("c = %.3f\n\n", cCalculated);
    } else {
      System.out.println("Impossible.\n");
    }
  }
}
