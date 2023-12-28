import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String numA = sc.nextLine();
        String numB = sc.nextLine();
        
        BigInteger A = new BigInteger(numA);
        BigInteger B = new BigInteger(numB);
        
        BigInteger sum = A.add(B);
        BigInteger difference = A.subtract(B);
        BigInteger product = A.multiply(B);
        
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
    }
}
