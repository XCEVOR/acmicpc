import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    sc.nextLine();
    
    for (int i = 0; i < N; i++) {
      String line = sc.nextLine();
      String capitalizedLine = capitalizeFirstLetter(line);
      System.out.println(capitalizedLine);
    }
  }
  
  private static String capitalizeFirstLetter(String line) {
    char firstChar = Character.toUpperCase(line.charAt(0));
    return firstChar + line.substring(1);
  }
}
