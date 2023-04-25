import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n * 5; i++) {
            if (i <= n * 4) {
                System.out.println("@".repeat(n));
            }
            else {
                System.out.println("@".repeat(n * 5));
            }
        }

    }
}
