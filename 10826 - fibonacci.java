import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // n 입력
        int n = sc.nextInt();
        
        // Fibonacci 클래스의 calculate 메서드를 호출하여 n번째 피보나치 수를 계산
        BigInteger result = Fibonacci.calculate(n);
        
        // 결과 출력
        System.out.println(result);
    }
}

class Fibonacci {
    public static BigInteger calculate(int n) {
        // 피보나치 수를 저장할 BigInteger 배열을 선언하고 초기값 설정
        BigInteger[] fibo = new BigInteger[n + 2];
        fibo[0] = BigInteger.ZERO;
        fibo[1] = BigInteger.ONE;
        
        // 피보나치 수 계산
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }
        
        // n번째 피보나치 수 반환
        return fibo[n];
    }
}
