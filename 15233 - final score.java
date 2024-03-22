import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 각 팀의 선수 수와 골 수 입력 받기
        int numPlayersA = sc.nextInt();  // 팀 A의 선수 수
        int numPlayersB = sc.nextInt();  // 팀 B의 선수 수
        int numGoals = sc.nextInt();  // 골의 수
        sc.nextLine();   // 버퍼 비우기
        
        // 각 팀의 선수 이름 입력
        String[] playersA = sc.nextLine().split(" ");  // 팀 A의 선수 이름
        String[] playersB = sc.nextLine().split(" ");  // 팀 B의 선수 이름
        
        // 골을 넣은 선수 이름 입력
        String[] scoredPlayers = sc.nextLine().split(" ");  // 골을 넣은 선수 이름
        
        // 각 팀의 선수와 골을 관리하는 FootballTeam 객체 생성
        FootballTeam teamA = new FootballTeam(playersA);
        FootballTeam teamB = new FootballTeam(playersB);
        
        // 경기 결과 분석
        String result = FootballMatchAnalyzer.analyzeMatch(teamA, teamB, scoredPlayers);
        
        // 결과 출력
        System.out.println(result);
    }
}

// 축구 팀을 나타내는 클래스
class FootballTeam {
    private String[] players;  // 팀의 선수들
    private HashMap<String, Integer> goalsScored;  // 각 선수가 넣은 골의 수를 저장하는 해시맵
    
    // constructor: 팀의 선수들을 받아 초기화
    public FootballTeam(String[] players) {
        this.players = players;
        this.goalsScored = new HashMap<>();
        initializeGoals();  // 각 선수의 골 수 초기화
    }
    
    // 각 선수의 골 수를 초기화하는 메서드
    private void initializeGoals() {
        for (String player : players) {
            goalsScored.put(player, 0);
        }
    }
    
    // 선수가 골을 넣었을 때 호출되는 메서드
    public void scoreGoal(String playerName) {
        if (goalsScored.containsKey(playerName)) {
            goalsScored.put(playerName, goalsScored.get(playerName) + 1);
        }
    }
    
    // 팀의 총 골 수를 반환하는 메서드
    public int getTotalGoals() {
        int totalGoals = 0;
        for (int goals : goalsScored.values()) {
            totalGoals += goals;
        }
        return totalGoals;
    }
}

// 축구 경기를 분석하는 클래스
class FootballMatchAnalyzer {
    // 경기 결과를 분석하여 승자를 반환하는 메서드
    public static String analyzeMatch(FootballTeam teamA, FootballTeam teamB, String[] scoredPlayers) {
        // 각 팀의 선수들이 골을 넣은 횟수 업데이트
        for (String scoredPlayer : scoredPlayers) {
            teamA.scoreGoal(scoredPlayer);
            teamB.scoreGoal(scoredPlayer);
        }
        
        // 각 팀의 총 골 수 계산
        int goalsA = teamA.getTotalGoals();
        int goalsB = teamB.getTotalGoals();
        
        // 승자 결정 및 반환
        if (goalsA > goalsB) {
            return "A";
        } else if (goalsA < goalsB) {
            return "B";
        } else {
            return "TIE";
        }
    }
}
