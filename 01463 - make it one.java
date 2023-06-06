import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 입력값

        int result = findMinNumToMakeItOne(N);  // 최소 횟수 찾기

        System.out.print(result);  // 최솟값 출력
    }
    
    public static int findMinNumToMakeItOne (int N) {
        int[] dp = new int[N + 1];  // N까지 연산 횟수를 저장할 dp 배열 생성

        // 1부터 N까지 연산을 수행하여 최솟값을 구함
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;  // 1을 빼는 연산을 수행한 경우

            if (i % 2 == 0)
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);  // 2로 나누는 연산을 수행한 경우

            if (i % 3 == 0)
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);  // 3으로 나누는 연산을 수행한 경우
        }
        
        return dp[N];  // N까지 최소 횟수 반환
    }
    
}
