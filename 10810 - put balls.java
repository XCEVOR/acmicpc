import java.util.Scanner;
import java.util.HashMap;

class BasketManager {
    private HashMap<Integer, Integer> basket;  // 바구니 상태를 저장하는 해시맵

    // 바구니 매니저 클래스의 생성자
    public BasketManager(int N) {
        basket = new HashMap<>();
        // 초기화: 바구니 번호와 0을 저장하여 모든 바구니가 비어있는 상태로 설정
        for (int i = 1; i <= N; i++) {
            basket.put(i, 0);
        }
    }

    // 공을 넣는 메서드
    public void putBalls(int start, int end, int ballNumber) {
        for (int i = start; i <= end; i++) {
            basket.put(i, ballNumber);  // 시작 바구니부터 끝 바구니까지 같은 번호의 공을 넣음
        }
    }
    
    // 바구니 상태를 문자열로 반환하는 메서드
    public String getBasketState() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= basket.size(); i++) {
            sb.append(basket.get(i));
            if (i < basket.size()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 바구니 개수 입력
        int M = sc.nextInt();  // 공을 넣는 횟수 입력
        
        BasketManager basketManager = new BasketManager(N);  // 바구니 매니저 객체 생성
        
        for (int m = 0; m < M; m++) {
            int start = sc.nextInt();  // 시작 바구니 번호 입력
            int end = sc.nextInt();  // 끝 바구니 번호 입력
            int ballNumber = sc.nextInt(); // 넣을 공 번호 입력
            
            basketManager.putBalls(start, end, ballNumber);  // 바구니 매니저를 통해 공을 넣음
        }
        
        System.out.println(basketManager.getBasketState());  // 바구니 상태 출력
    }
}
