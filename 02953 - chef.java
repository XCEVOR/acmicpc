import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> participantScores = new HashMap<>();
        
        // 5명의 참가자의 점수 입력과 처리
        for (int i = 1; i <= 5; i++) {
            String[] input = scanner.nextLine().split(" ");  // 입력 문자열을 공백으로 분리
            int totalScore = calculateTotalScore(input);  // 입력된 점수의 합을 계산
            participantScores.put(i, totalScore);  // 참가자 번호와 점수를 해시맵에 저장
        }
        
        // 참가자의 점수 출력
        // printParticipantScores(participantScores);
        
        // 우승자 정보 찾아 출력
        int[] winnerInfo = findWinner(participantScores);  // 우승자 정보 계산
        // System.out.println("Winner: Participant " + winnerInfo[0] + " with a score of " + winnerInfo[1]);  // 우승자 정보 출력
        System.out.println(winnerInfo[0] + " " + winnerInfo[1]);  // 우승자 정보 출력
    }

    // 입력된 문자열 배열에서 점수의 합을 계산하는 함수
    private static int calculateTotalScore(String[] input) {
        int totalScore = 0;
        for (int j = 0; j < 4; j++) {
            totalScore += Integer.parseInt(input[j]);  // 문자열을 정수로 변환하여 더함
        }
        return totalScore;
    }

    // 참가자의 번호와 점수를 해시맵에서 읽어와 출력하는 함수
    private static void printParticipantScores(HashMap<Integer, Integer> scores) {
        for (Map.Entry<Integer, Integer> entry : scores.entrySet()) {
            int participant = entry.getKey();
            int score = entry.getValue();
            System.out.println("Participant " + participant + ": " + score);
        }
    }

    // 우승자를 찾는 함수
    private static int[] findWinner(HashMap<Integer, Integer> scores) {
        int winnerNumber = 0;
        int maxScore = Integer.MIN_VALUE;
        
        // 해시맵을 순회하며 가장 큰 점수를 가진 우승자 찾기
        for (int participant : scores.keySet()) {
            int score = scores.get(participant);
            if (score > maxScore) {
                maxScore = score;
                winnerNumber = participant;
            }
        }
        
        // 우승자 번호와 점수를 배열로 반환
        return new int[]{winnerNumber, maxScore};
    }
    
}
