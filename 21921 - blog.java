import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 블로그 시작부터 지난 일수
        int X = sc.nextInt();  // X일 동안의 기간
        
        int[] visitors = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            visitors[i] = sc.nextInt();
        }
        
        int[] result = findMaxVisitors(visitors, N, X);
        
        if (result[0] == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
    }
    
    // 최대 방문자 수와 해당 기간을 계산하는 함수
    static int[] findMaxVisitors(int[] visitors, int N, int X) {
        int[] dp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i - 1] + visitors[i];
        }
        
        int maxVisitors = 0;
        int maxPeriods = 0;
        
        for (int i = X; i <= N; i++) {
            int totalVisitors = dp[i] - dp[i - X];
            
            if (totalVisitors > maxVisitors) {
                maxVisitors = totalVisitors;
                maxPeriods = 1;
            } else if (totalVisitors == maxVisitors) {
                maxPeriods++;
            }
        }
        
        return new int[]{maxVisitors, maxPeriods};
    }
    
}
