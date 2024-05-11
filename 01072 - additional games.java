import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 게임 횟수와 이긴 게임 수를 입력
        long X = sc.nextLong();
        long Y = sc.nextLong();
        
        // 추가 게임 횟수를 계산하는 메서드 호출
        long additionalGames = findAdditionalGames(X, Y);
        
        // 결과 출력
        System.out.println(additionalGames);
    }
    
    // 형택이가 추가로 플레이해야 할 게임 횟수를 이분 탐색으로 계산하는 메서드
    private static long findAdditionalGames(long X, long Y) {
        // 이분 탐색을 위한 범위 설정
        long left = 0;
        long right = 1000000001;
        
        // 이분 탐색 진행
        while (left < right) {
            long mid = (left + right) / 2;
            long win = Y + mid; // 이긴 게임 수에 추가 게임 횟수 더함
            long total = X + mid; // 전체 게임 수에 추가 게임 횟수 더함
            
            long winRate = win * 100 / total; // 현재 승률 계산
            
            // 승률이 변하지 않는 경우, 추가 게임 횟수를 늘려야 함
            if (winRate <= Y * 100 / X) {
                left = mid + 1;
            } else { // 승률이 변하는 경우, 추가 게임 횟수를 줄여야 함
                right = mid;
            }
        }
        
        if (left == 1000000001) {
            // 만약 승률이 절대 변하지 않는 경우
            return -1;
        } else {
            // 그렇지 않은 경우 추가 게임 횟수 반환
            return left;
        }
    }
}
