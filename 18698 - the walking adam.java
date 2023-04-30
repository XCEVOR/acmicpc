import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int t = 0; t < testCase; t++) {
            String[] steps = sc.next().split("");
            
            int count = 0;
            for (int i = 0; i < steps.length; i++) {
                if (steps[i].equals("D")) break;
                else count += 1;
            }
            
            System.out.println(count);
        }

    }
}
