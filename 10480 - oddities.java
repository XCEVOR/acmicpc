import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            int testNum = sc.nextInt();
            if (testNum % 2 == 0) {
                System.out.println(testNum + " is even");
            }
            else {
                System.out.println(testNum + " is odd");
            }
        }

    }
}
