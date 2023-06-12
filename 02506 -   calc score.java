import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 문제의 개수 입력
        int n = scanner.nextInt();
        
        // 채점 결과 입력
        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            answers[i] = scanner.nextInt();
        }
        
        // 총 점수 계산 메서드
        int result = calcTotalScore(n, answers);
        
        // 총 점수 출력
        System.out.print(result); 
    }
    
    public static int calcTotalScore(int n, int[] answers) {
        int score = 0; // 총 점수 변수 초기화
        int consecutiveCorrect = 0; // 연속적으로 맞은 문제 수 변수 초기화
        
        for (int i = 0; i < n; i++) {
            if (answers[i] == 1) {
                // 문제의 답이 맞는 경우
                consecutiveCorrect++; // 연속적으로 맞은 문제 수 증가
                score += consecutiveCorrect; // 총 점수에 가산점 추가
            } else {
                // 문제의 답이 틀린 경우
                consecutiveCorrect = 0; // 연속적으로 맞은 문제 수 초기화
            }
        }
        
        return score;
    }
    
}
