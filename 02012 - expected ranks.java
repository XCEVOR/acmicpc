import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 학생 수 입력
        int N = sc.nextInt();
        // 각 학생의 예상 등수 배열
        int[] expectedRanks = new int[N];
        
        // 각 학생의 예상 등수 입력
        for (int i = 0; i < N; i++) {
            expectedRanks[i] = sc.nextInt();
        }
        
        // 예상 등수를 기준으로 오름차순 정렬
        Arrays.sort(expectedRanks);
        
        // 불만도 계산 함수 호출
        long dissatisfaction = calculateDissatisfaction(expectedRanks);
        
        // 결과 출력
        System.out.println(dissatisfaction);
    }
    
    // 불만도 계산 함수
    private static long calculateDissatisfaction(int[] expectedRanks) {
        int N = expectedRanks.length;
        // 전체 불만도 합을 저장할 변수
        long dissatisfaction = 0;
        
        // 각 학생의 불만도를 계산하여 전체 불만도 합에 더함
        for (int i = 1; i <= N; i++) {
            dissatisfaction += Math.abs(expectedRanks[i - 1] - i);
        }
        
        // 계산된 전체 불만도 합 반환
        return dissatisfaction;
    }
}
