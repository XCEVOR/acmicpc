import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 피보나치 수열의 0과 1의 개수를 계산하기 위한 객체 생성
        FibonacciCounterWithHashMap counter = new FibonacciCounterWithHashMap();
        
        // 테스트 케이스의 개수 T를 입력 받음
        int T = sc.nextInt();
        
        // T번만큼 반복하여 각 테스트 케이스에 대해 처리
        for (int i = 0; i < T; i++) {
            // N을 입력 받음
            int N = sc.nextInt();
            
            // N에 대한 피보나치 수열의 0과 1의 개수를 계산
            int[] counts = counter.getCounts(N);
            
            // 계산된 0과 1의 개수를 출력
            System.out.println(counts[0] + " " + counts[1]);
        }
    }
}

class FibonacciCounterWithHashMap {
    // dp(동적 계획법)를 위한 HashMap 선언, 각 피보나치 수에 대한 0과 1의 개수를 저장
    private HashMap<Integer, int[]> dp;
    
    public FibonacciCounterWithHashMap() {
        // HashMap 초기화
        dp = new HashMap<>();
        
        // 피보나치 수열의 기본값 설정. fibonacci(0)의 경우 0이 1번, 1이 0번 등장
        dp.put(0, new int[]{1, 0});
        // fibonacci(1)의 경우 0이 0번, 1이 1번 등장
        dp.put(1, new int[]{0, 1});
    }
    
    public int[] getCounts(int n) {
        // dp에 n에 대한 계산 결과가 없다면, 새로 계산
        if (!dp.containsKey(n)) {
            // n-1에 대한 0과 1의 개수를 재귀적으로 계산
            int[] countsForNMinus1 = getCounts(n - 1);
            // n-2에 대한 0과 1의 개수를 재귀적으로 계산
            int[] countsForNMinus2 = getCounts(n - 2);
            
            // n에 대한 0과 1의 개수를 dp에 저장
            dp.put(n, new int[]{countsForNMinus1[0] + countsForNMinus2[0], countsForNMinus1[1] + countsForNMinus2[1]});
        }
        
        // dp에서 n에 대한 0과 1의 개수를 반환
        return dp.get(n);
    }
}
