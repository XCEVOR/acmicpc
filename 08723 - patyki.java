import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] input = br.readLine().split(" ");
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);
    int c = Integer.parseInt(input[2]);
    
    System.out.println(determineTriangleType(a, b, c));
  }
  
  private static int determineTriangleType(int a, int b, int c) {
    boolean isEquilateral = (a == b) && (b == c);
    
    boolean isRight = (a * a + b * b == c * c) ||
                      (a * a + c * c == b * b) ||
                      (b * b + c * c == a * a);
    
    if (isEquilateral) {
      return 2;
    } else if (isRight) {
      return 1;
    } else {
      return 0;
    }
  }
}
