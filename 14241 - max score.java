import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 슬라임의 개수 N 입력
        int N = sc.nextInt();
        
        // 슬라임의 크기 배열 입력
        int[] slimeSizes = new int[N];
        for (int i = 0; i < N; i++) {
            slimeSizes[i] = sc.nextInt();
        }
        
        // 크기를 기준으로 오름차순 정렬
        Arrays.sort(slimeSizes);
        
        // 최대 점수 계산
        int maxScore = calculateMaxScore(slimeSizes);
        
        // 최대 점수 출력
        System.out.println(maxScore);
    }
    
    // 최대 점수를 계산하는 함수
    private static int calculateMaxScore(int[] slimeSizes) {
        // 최대 점수 초기화
        int maxScore = 0;
        
        // 가장 작은 크기의 슬라임이 합쳐지면서 최대 점수 계산
        for (int i = slimeSizes.length - 1; i > 0; i--) {
            // 현재 크기와 바로 앞의 크기를 합치기
            int currentSize = slimeSizes[i];
            int prevSize = slimeSizes[i - 1];
            int mergedSize = currentSize + prevSize;
            
            // 합친 크기를 다시 배열에 삽입
            slimeSizes[i - 1] = mergedSize;
            
            // 점수 계산하여 누적
            maxScore += currentSize * prevSize;
        }
        
        // 최종적인 최대 점수 반환
        return maxScore;
    }
    
}
