import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // n과 m 입력
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // nCm 계산
        BigInteger result = calculateCombination(n, m);
        
        // 결과 출력
        System.out.println(result);
    }
    
    // 조합 계산 메서드
    private static BigInteger calculateCombination(int n, int m) {
        // 분자 계산: n!
        BigInteger numerator = factorial(n);
        // 분모 계산: m! * (n-m)!
        BigInteger denominator = factorial(m).multiply(factorial(n - m));
        
        // nCm 계산 결과 리턴턴
        return numerator.divide(denominator);
    }
    
    // 팩토리얼 계산 메서드
    private static BigInteger factorial(int num) {
        // 결과를 저장할 BigInteger 객체 초기화
        BigInteger result = BigInteger.ONE;
        
        // 2부터 num까지 반복하면서 팩토리얼 계산
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        // 계산된 팩토리얼 리턴
        return result;
    }
}



/*

100 50

100891344545564193334812497256

*/
