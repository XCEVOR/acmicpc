import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 수 입력
        int P = sc.nextInt();
        
        // 각 테스트 케이스에 대해 반복
        for (int i = 0; i < P; i++) {
            // 테스트 케이스 번호 입력
            int T = sc.nextInt();
            // 아이들의 키를 저장할 배열
            int[] heights = new int[20];
            
            // 각 아이의 키 입력
            for (int j = 0; j < 20; j++) {
                heights[j] = sc.nextInt();
            }
            
            // 뒤로 물러나는 걸음 수 계산
            int steps = calculateSteps(heights);
            
            // 결과 출력
            System.out.println(T + " " + steps);
        }
    }
    
    // 뒤로 물러나는 걸음 수를 계산하는 메서드
    private static int calculateSteps(int[] heights) {
        int steps = 0;
        
        // 각 아이에 대해 반복
        for (int i = 1; i < 20; i++) {
            int count = 0;
            // 현재 아이보다 앞에 있는 아이들 중 키가 큰 아이들의 수 세기
            for (int j = 0; j < i; j++) {
                if (heights[j] > heights[i]) {
                    count++;
                }
            }
            // 물러나는 걸음 수에 추가
            steps += count;
        }
        
        return steps;
    }
}
