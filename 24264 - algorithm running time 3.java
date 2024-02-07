import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger n = sc.nextBigInteger();
        
        BigInteger result = n.multiply(n);
        
        System.out.println(result);
        System.out.println(2);
    }
}
