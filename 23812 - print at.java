import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n * 5; i++) {
            if (i <= n * 1) {
                System.out.println("@".repeat(n) + " ".repeat(n * 3) + "@".repeat(n));
            }
            else if (i <= n * 2) {
                System.out.println("@".repeat(n * 5));
            }
            else if (i <= n * 3) {
                System.out.println("@".repeat(n) + " ".repeat(n * 3) + "@".repeat(n));
            }
            else if (i <= n * 4) {
                System.out.println("@".repeat(n * 5));
            }
            else {
                System.out.println("@".repeat(n) + " ".repeat(n * 3) + "@".repeat(n));
            }
        }
 
    }
}
