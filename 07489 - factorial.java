import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 수를 입력
        int t = sc.nextInt();
        
        // 각 테스트 케이스에 대해 반복
        for (int i = 0; i < t; i++) {
            // n 값을 입력
            int n = sc.nextInt();
            
            // n!을 계산하여 BigInteger 형태로 저장
            BigInteger fact = factorial(n);
            
            // n!의 최우측 0이 아닌 수를 구함
            int result = getRightmostNonZeroDigit(fact);
            
            // 결과를 출력
            System.out.println(result);
        }
    }
    
    // n!을 계산하는 메서드
    private static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        
        return fact;
    }
    
    // BigInteger 형태의 수에서 최우측 0이 아닌 수를 구하는 메서드
    private static int getRightmostNonZeroDigit(BigInteger num) {
        // 숫자의 가장 오른쪽에 있는 0을 모두 제거함
        while (num.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            num = num.divide(BigInteger.TEN);
        }
        
        // 가장 오른쪽에 있는 숫자 반환
        return num.mod(BigInteger.TEN).intValue();
    }
}
