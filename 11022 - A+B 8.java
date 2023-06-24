import java.util.Scanner;
 
public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int testCase = sc.nextInt();
        
        for (int i = 1; i <= testCase; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int result = calcSum(A, B);
            
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " +  result);
        }
    }
    
    public static int calcSum(int A, int B) {
        return A + B;
    }
    
}
