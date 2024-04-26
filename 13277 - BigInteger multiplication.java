import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        BigInteger result = calculateMultiplication(A, B);

        System.out.println(result);
    }

    private static BigInteger calculateMultiplication(BigInteger A, BigInteger B) {
        return A.multiply(B);
    }
}
