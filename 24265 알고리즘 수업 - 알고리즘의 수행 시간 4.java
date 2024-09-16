import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    long count = calculateOperationCount(n);
    System.out.println(count);
    
    int polynomialDegree = getPolynomialDegree(n);
    System.out.println(polynomialDegree);
  }
  
  private static long calculateOperationCount(int n) {
    return (long) n * (n - 1) / 2;
  }
  
  private static int getPolynomialDegree(int n) {
    return 2;
  }
}
