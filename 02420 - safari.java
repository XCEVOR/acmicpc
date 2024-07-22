import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Long N = sc.nextLong();
    Long M = sc.nextLong();
    
    Long difference = Math.abs(N - M);
    
    System.out.println(difference);
  }
}
