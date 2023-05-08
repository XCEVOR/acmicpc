import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int t = 0; t < testCase; t++) {
            
            int nMass = sc.nextInt();
            int totalSum = 0;
            for (int m = 0; m < nMass; m++) {
                totalSum += sc.nextInt();
            }
            
            if (totalSum == 0) {
                System.out.println("Equilibrium");
            }
            else if (totalSum > 0) {
                System.out.println("Right");
            }
            else if (totalSum < 0) {
                System.out.println("Left");
            }
            
        }
    }
}
