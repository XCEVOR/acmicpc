import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수를 입력받음
        int T = sc.nextInt();
        
        // 각 테스트 케이스에 대해 반복
        for (int t = 0; t < T; t++) {
            // 동전의 가지 수를 입력받음
            int N = sc.nextInt();
            
            // 동전의 가치를 저장할 배열 생성
            int[] coins = new int[N];
            
            // 각 동전의 가치를 입력받아 배열에 저장
            for (int i = 0; i < N; i++) {
                coins[i] = sc.nextInt();
            }
            
            // 만들어야 할 금액을 입력받음
            int M = sc.nextInt();
            
            // CoinCounter 객체 생성하여 동전 조합의 수를 계산
            CoinCounter coinCounter = new CoinCounter(coins, M);
            long result = coinCounter.countWays();
            
            // 결과 출력
            System.out.println(result);
        }
    }
}

// 동전 조합의 수를 계산하는 클래스
class CoinCounter {
    private int[] coins;  // 동전의 가치를 저장하는 배열
    private int targetAmount;  // 만들어야 할 금액
    
    // constructor: 동전 배열과 목표 금액을 받아 초기화
    public CoinCounter(int[] coins, int targetAmount) {
        this.coins = coins;
        this.targetAmount = targetAmount;
    }
    
    // 동전 조합의 수를 계산하는 메서드
    public long countWays() {
        int n = coins.length;  // 동전의 가지 수
        long[] dp = new long[targetAmount + 1];  // DP 배열 초기화
        dp[0] = 1;  // 금액이 0일 때는 1가지 방법밖에 없음
        
        // 동전을 하나씩 추가하면서 DP 배열 갱신
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= targetAmount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        
        // targetAmount를 만드는 조합의 수 반환
        return dp[targetAmount];
    }
}
