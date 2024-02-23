import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt() ; // 라운드 수 입력
        Game game = new Game();  // 게임 객체 생성
        
        // 각 라운드의 점수를 입력받고 게임 진행
        for (int i = 0; i < N; i++) {
            int scoreA = sc.nextInt();  // A의 점수 입력
            int scoreB = sc.nextInt();  // B의 점수 입력
            game.playRound(scoreA, scoreB);  // 게임 진행
        }
        
        // A와 B의 승리 횟수 출력
        System.out.println(game.getWinA() + " " + game.getWinB());
    }
}

// 게임 클래스
class Game {
    private int winA;  // A의 승리 횟수를 저장하는 변수
    private int winB;  // B의 승리 횟수를 저장하는 변수
    
    // 생성자
    public Game() {
        this.winA = 0;  // 초기에 A의 승리 횟수를 0으로 설정
        this.winB = 0;  // 초기에 B의 승리 횟수를 0으로 설정
    }
    
    // 라운드 진행 메소드
    public void playRound(int scoreA, int scoreB) {
        if (scoreA > scoreB) {  // A가 더 높은 점수를 획득한 경우
            winA++;  // A의 승리 횟수 증가
        } else if (scoreA < scoreB) {  // B가 더 높은 점수를 획득한 경우
            winB++;  // B의 승리 횟수 증가
        }
    }
    
    // A의 승리 횟수를 반환하는 메소드
    public int getWinA() {
        return winA;  // A의 승리 횟수 반환
    }
    
    // B의 승리 횟수를 반환하는 메소드
    public int getWinB() {
        return winB;  // B의 승리 횟수 반환
    }
}
