import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        long result = customOperator(A, B);
        
        System.out.println(result);
    }
    
    private static long customOperator(long A, long B) {
        return (A + B) * (A - B);
    }
}
