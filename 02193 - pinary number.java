import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // dp 배열을 이용하여 N자리 이친수의 개수를 저장
        long[] dp = new long[N + 1];
        
        // 초기값 설정
        dp[1] = 1; // 1자리 이친수: 1
        
        // 다이나믹 프로그래밍으로 N자리 이친수의 개수 구하기
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        // N자리 이친수의 개수 출력
        System.out.println(dp[N]);
    }
    
}
