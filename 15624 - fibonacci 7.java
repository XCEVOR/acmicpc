import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 n 값을 입력
        int n = sc.nextInt();
        
        // getFibonacciNumber 메서드를 호출하여 n번째 피보나치 수를 계산하고 결과를 result에 저장
        int result = getFibonacciNumber(n);
        
        // 계산된 n번째 피보나치 수를 출력
        System.out.println(result);
    }
    
    // n번째 피보나치 수를 계산하는 메서드
    private static int getFibonacciNumber(int n) {
        // base case: n이 0 또는 1인 경우, 해당 값을 반환
        if (n <= 1) {
            return n;
        }
        
        // 피보나치 수열을 저장할 dp 배열 생성
        int[] dp = new int[n + 1];
        
        // 초기값 설정
        dp[0] = 0;
        dp[1] = 1;
        
        // 2부터 n까지 반복하며 피보나치 수열 계산
        for (int i = 2; i <= n; i++) {
            // dp[i]는 dp[i-1]과 dp[i-2]의 합을 1,000,000,007로 나눈 나머지
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1_000_000_007;
        }
        
        // n번째 피보나치 수 반환
        return dp[n];
    }
}
