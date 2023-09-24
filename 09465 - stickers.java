import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 개수 입력
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            // 스티커 열 개수 입력
            int n = sc.nextInt();
            
            // 스티커의 점수를 저장할 배열
            int[][] sticker = new int[2][n];
            
            // 스티커 점수 입력
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    sticker[i][j] = sc.nextInt();
                }
            }
            
            // 스티커의 최대 점수를 계산하는 함수 사용
            int result = getMaxStickerScore(n, sticker);
            
            // 결과 출력
            System.out.println(result);
        }
    }
    
    // 스티커의 최대 점수를 계산하는 함수
    private static int getMaxStickerScore(int n, int[][] sticker) {
        // 동적 프로그래밍을 위한 배열
        int[][] dp = new int[2][n];
        
        // 초기값 설정: 첫 번째 열의 스티커 점수로 초기화
        dp[0][0] = sticker[0][0]; // 첫 번째 열의 위쪽 행 스티커 선택
        dp[1][0] = sticker[1][0]; // 첫 번째 열의 아래쪽 행 스티커 선택
        
        // dp 배열 채우기
        for (int i = 1; i < n; i++) {
            // 현재 열의 위쪽 행 스티커를 선택했을 때의 최대 점수
            // i가 0 또는 1일 때는 i - 1 또는 i - 2가 음수로 나가게 되므로 이런 경우에 대한 예외 처리
            dp[0][i] = Math.max(dp[1][i - 1], i >= 2 ? dp[1][i - 2] : 0) + sticker[0][i];
            
            // 현재 열의 아래쪽 행 스티커를 선택했을 때의 최대 점수
            // i가 0 또는 1일 때는 i - 1 또는 i - 2가 음수로 나가게 되므로 이런 경우에 대한 예외 처리
            dp[1][i] = Math.max(dp[0][i - 1], i >= 2 ? dp[0][i - 2] : 0) + sticker[1][i];
        }
        
        // 마지막 열에서 최대값 구하기
        return Math.max(dp[0][n - 1], dp[1][n - 1]);
    }
}
