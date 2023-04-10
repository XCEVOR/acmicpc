import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 1; i <= testCase; i++) {
            int first = sc.nextInt();
            String operator = sc.next();
            int second = sc.nextInt();
            String equal = sc.next();
            int result = sc.nextInt();
            
            if (operator.equals("+")) {
                if (first + second == result) {
                    System.out.println("Case " + i + ": YES");
                }
                else if (first + second != result) {
                    System.out.println("Case " + i + ": NO");
                }
            }
            else if (operator.equals("-")) {
                if (first - second == result) {
                    System.out.println("Case " + i + ": YES");
                }
                else if (first - second != result) {
                    System.out.println("Case " + i + ": NO");
                }
            }
        }

    }
}
