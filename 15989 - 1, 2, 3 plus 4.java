import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        int[] dp = new int[10001];
        
        findTheNumberOfWaysUpTo10000(dp);
        
        while (testCase-- > 0) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
    
    public static void findTheNumberOfWaysUpTo10000(int[] dp) {
        dp[0] = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 10000; j++) {
                dp[j] = dp[j] + dp[j - i];
            }
        }
    }
    
}
