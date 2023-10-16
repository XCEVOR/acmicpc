import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n - 1; i++) {
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // First star
            System.out.print("*");
            
            if (i > 1) {
                // Spaces in the middle
                for (int j = 1; j <= 2 * (i - 2) + 1; j++) {
                    System.out.print(" ");
                }
                
                // Last star
                System.out.print("*");
            }
            
            System.out.println();  // Move to the next line
        }
        
        // Bottom line
        System.out.println("*".repeat(2 * n - 1));
    }
    
}
