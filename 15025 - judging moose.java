import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        if (L == 0 && R == 0) {
            System.out.print("Not a moose");
        }
        else if (L == R) {
            System.out.print("Even " + (L + R));
        }
        else if (L != R) {
            if (L > R) {
                System.out.print("Odd " + (L + L));
            }
            else if (L < R) {
                System.out.print("Odd " + (R + R));
            }
        }
        
    }
}
