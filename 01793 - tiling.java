import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력값이 있는 동안 계속 반복
        while (sc.hasNext()) {
            // n을 입력
            int n = sc.nextInt();
            
            // n에 대한 결과 계산
            BigInteger result = countWays(n);
            
            // 결과 출력
            System.out.println(result);
        }
    }
    
    // 2×n 직사각형을 채우는 방법의 수를 계산하는 함수
    private static BigInteger countWays(int n) {
        // n이 0인 경우 1을 반환
        if (n == 0) {
            return BigInteger.ONE;
        }
        
        // 결과를 저장할 배열 초기화
        BigInteger[] dp = new BigInteger[n+1];
        
        // 초기값 설정
        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;
        
        // 반복문을 통해 각 경우의 수 계산
        for (int i = 2; i <= n; i++) {
            // 점화식을 이용하여 현재 경우의 수 계산
            dp[i] = dp[i-1].add(dp[i-2].multiply(BigInteger.valueOf(2)));
        }
        
        // n에 대한 결과 반환
        return dp[n];
    }
}
