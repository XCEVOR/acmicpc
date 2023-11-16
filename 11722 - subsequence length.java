import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // 입력값 받기
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // 가장 긴 감소하는 부분 수열의 길이 구하기
        int maxLength = findLongestDecreasingSubsequenceLength(N, A);
        
        // 결과 출력
        System.out.println(maxLength);
    }
    
    // 가장 긴 감소하는 부분 수열의 길이를 찾는 함수
    public static int findLongestDecreasingSubsequenceLength(int N, int[] A) {
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            // 모든 요소를 1로 초기화
            dp[i] = 1;
        }
        
        // DP 알고리즘을 이용하여 가장 긴 감소하는 부분 수열의 길이 구하기
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                // 현재 값이 이전 값보다 작은 경우
                if (A[j] > A[i]) {
                    // 현재 값의 부분 수열 길이 갱신
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        // 최대 길이 반환
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            maxLength = Math.max(maxLength, dp[i]);
        }
        
        return maxLength;
    }
    
}
