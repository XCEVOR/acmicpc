import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 두 문자열 입력
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        // LCSCalculator 객체 생성
        LCSCalculator lcsCalculator = new LCSCalculator();
        // LCS 길이 계산
        int lcsLength = lcsCalculator.calculateLCSLength(str1, str2);
        
        // 계산된 LCS의 길이 출력
        System.out.println(lcsLength);
    }
}

class LCSCalculator {
    // LCS 길이를 계산하는 메서드
    public int calculateLCSLength(String str1, String str2) {
        // 각 문자열의 길이 구하기
        int m = str1.length();
        int n = str2.length();
        
        // DP 테이블 초기화
        int[][] dp = new int[m + 1][n + 1];
        
        // 다이나믹 프로그래밍을 통해 LCS 길이 계산
        // dp[i][j]는 문자열 str1의 처음부터 i번째 문자까지, 그리고 문자열 str2의 처음부터 j번째 문자까지의 LCS 길이를 나타냄
        // 문자열 str1의 각 문자를 순회
        for (int i = 1; i <= m; i++) {
            // 문자열 str2의 각 문자를 순회
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    // 이전까지의 LCS 길이에 현재 문자를 추가하면서 LCS의 길이를 증가
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    // 현재 비교하는 문자가 다르다면, 이전까지의 LCS 중 최대값을 선택하여 현재 위치의 LCS 길이를 결정
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        
        // 계산된 LCS의 길이 반환
        return dp[m][n];
    }
}
