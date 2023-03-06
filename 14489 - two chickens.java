import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int balance_a = sc.nextInt();
        int balance_b = sc.nextInt();
        int chicken = sc.nextInt();
        
        if (balance_a + balance_b >= 2 * chicken) {
            int result = (balance_a + balance_b) - (2 * chicken);
            System.out.print(result);
        }
        else {
            int result = balance_a + balance_b;
            System.out.print(result);
        }
        
    }
}
