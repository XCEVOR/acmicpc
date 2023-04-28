import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int t = 0; t < testCase; t++) {
            int shuttle = sc.nextInt();
            int distance = sc.nextInt();
            
            int count = 0;
            
            for (int i = 0; i < shuttle; i++) {
                double v = sc.nextDouble();
                double f = sc.nextDouble();
                double c = sc.nextDouble();
                
                double distanceToGo = v * (f / c);
                if (distanceToGo - distance >= 0) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
        
    }
}
