import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        // dp 배열 초기화
        int[] dp = new int[N + 1];
        
        // i를 1부터 N까지 순회하며 최소 항의 개수 계산
        for (int i = 1; i <= N; i++) {
            // 초기값은 i개의 1로 구성된 합으로 표현할 때의 개수로 설정
            dp[i] = i;
            
            // j * j가 i보다 작거나 같은 범위에서 최소 항의 개수 찾기
            for (int j = 1; j * j <= i; j++) {
                // dp[i - j * j] + 1은 현재의 자연수 i를 만들기 위해
                // 이전에 이미 계산한 자연수들을 이용하여 구성하는 방법 중에서
                // 가장 최소 항의 개수를 찾음
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        
        // 출력
        System.out.println(dp[N]);
    }
}
