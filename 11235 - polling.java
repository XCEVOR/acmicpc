import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스가 있는 동안 반복
        while (sc.hasNext()) {
            // 후보자 수 입력
            int n = sc.nextInt();
            sc.nextLine(); // 개행 문자 처리
            
            // 후보자 이름과 득표 수를 저장하기 위한 TreeMap 생성
            TreeMap<String, Integer> voteCount = new TreeMap<>();
            
            // 후보자 이름과 득표 수 카운트
            for (int i = 0; i < n; i++) {
                String candidate = sc.nextLine();
                countVote(voteCount, candidate);
            }
            
            // 최대 득표 수 찾기
            int maxVotes = findMaxVotes(voteCount);
            
            // 최대 득표 수를 가진 후보자 출력
            printWinners(voteCount, maxVotes);
        }
    }
    
    // 후보자의 득표 수 카운트 메서드
    private static void countVote(TreeMap<String, Integer> voteCount, String candidate) {
        // 후보자 이름을 voteCount에 넣고, 이미 존재하는 경우 기존 값에 1을 더함
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
    }
    
    // 최대 득표 수 찾는 메서드
    private static int findMaxVotes(TreeMap<String, Integer> voteCount) {
        return Collections.max(voteCount.values());
    }
    
    // 최대 득표 수를 가진 후보자 출력 메서드
    private static void printWinners(TreeMap<String, Integer> voteCount, int maxVotes) {
        // voteCount의 각 엔트리에 대해 반복하여 최대 득표수와 비교하여 출력
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            // 최대 득표수와 현재 후보자의 득표수가 같은 경우
            if (entry.getValue() == maxVotes) {
                // 해당 후보자의 이름을 출력
                System.out.println(entry.getKey());
            }
        }
    }
}



/*

< input >
5
FRED
BARNEY
FRED
FRED
BARNEY
5
PORTHOS
ATHOS
ARAMIS
PORTHOS
ATHOS


< output >
FRED
ATHOS
PORTHOS

*/
