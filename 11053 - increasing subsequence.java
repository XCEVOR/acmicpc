import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수열 A의 크기 입력
        int sizeOfA = sc.nextInt();
        
        // Sequence 객체 생성
        Sequence sequence = new Sequence(sizeOfA);
        
        // 수열 A 입력
        sequence.inputSequence(sc);
        
        // 가장 긴 증가하는 부분 수열의 길이 계산
        int maxLength = sequence.findLongestIncreasingSubsequence();
        
        // 결과 출력
        System.out.println(maxLength);
    }
}

class Sequence {
    private int[] sequence;
    
    // Sequence 객체 생성 시 수열의 크기에 맞게 배열 초기화
    public Sequence(int size) {
        sequence = new int[size];
    }
    
    // 수열 입력
    public void inputSequence(Scanner sc) {
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = sc.nextInt();
        }
    }
    
    // 가장 긴 증가하는 부분 수열의 길이 계산
    public int findLongestIncreasingSubsequence() {
        int[] dp = new int[sequence.length];
        
        // 각 원소를 길이가 1인 부분 수열로 초기화
        for (int i = 0; i < sequence.length; i++) {
            dp[i] = 1;
        }
        
        // 다이나믹 프로그래밍을 통해 각 원소의 가장 긴 증가하는 부분 수열의 길이를 구함
        for (int i = 1; i < sequence.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        // 가장 긴 증가하는 부분 수열의 길이 반환
        int maxLength = 0;
        for (int i = 0; i < sequence.length; i++) {
            maxLength = Math.max(maxLength, dp[i]);
        }
        
        return maxLength;
    }
}
