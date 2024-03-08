import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 컵의 위치를 바꾼 횟수 입력
        int M = sc.nextInt();
        
        // CupGame 객체 생성
        CupGame cupGame = new CupGame();
        
        // 컵의 위치를 M번 바꾼 후의 상태 설정
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            // 컵 위치 변경 메서드 호출
            cupGame.moveCups(X, Y);
        }
        
        // 공이 들어있는 컵의 번호 출력
        System.out.println(cupGame.getBallPosition());
    }
}

// 컵 게임 클래스
class CupGame {
    // 컵 상태 저장을 위한 해시맵
    private HashMap<Integer, Integer> cups;

    // constructor 초기 컵 위치 설정
    public CupGame() {
        cups = new HashMap<>();
        cups.put(1, 1);  // 1번 컵에 공이 들어있음
        cups.put(2, 0);
        cups.put(3, 0);
    }

    // 컵 위치 변경 메서드
    public void moveCups(int X, int Y) {
        int temp = cups.get(X);  // X번 컵의 상태를 임시 저장
        cups.put(X, cups.get(Y));  // Y번 컵의 상태를 X번 컵에 저장
        cups.put(Y, temp);  // 임시 저장된 X번 컵의 상태를 Y번 컵에 저장
    }

    // 공이 들어있는 컵의 번호 반환 메서드
    public int getBallPosition() {
        for (int cup : cups.keySet()) {
            if (cups.get(cup) == 1) {  // 컵의 상태가 1인 경우
                return cup;  // 해당 컵의 번호 반환
            }
        }
        return -1;  // 공이 컵 안에 없는 경우
    }
}
