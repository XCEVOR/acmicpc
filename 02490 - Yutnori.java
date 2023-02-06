import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            int total_sum = 0;
            
            for (int j = 0; j < 4; j++) {
                total_sum += sc.nextInt();
            }
            
            if (total_sum == 3) {
                System.out.println("A");
            }
            else if (total_sum == 2) {
                System.out.println("B");
            }
            else if (total_sum == 1) {
                System.out.println("C");
            }
            else if (total_sum == 0) {
                System.out.println("D");
            }
            else if (total_sum == 4) {
                System.out.println("E");
            }
            
        }
        
    }
}
