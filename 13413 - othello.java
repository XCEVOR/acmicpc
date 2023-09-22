import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 오셀로 말의 개수
            String initialState = sc.next(); // 초기 상태
            String targetState = sc.next(); // 목표 상태

            // 초기 상태와 목표 상태를 비교하여 작업 횟수 계산
            int result = calculateMinOperations(N, initialState, targetState);
            System.out.println(result);
        }
    }

    // 초기 상태에서 목표 상태를 만들기 위한 작업의 최소 횟수를 계산하는 함수
    public static int calculateMinOperations(int N, String initialState, String targetState) {
        int flipCount = 0; // 뒤집는 작업 횟수
        int swapCount = 0; // 위치 바꾸는 작업 횟수

        for (int i = 0; i < N; i++) {
            char initialColor = initialState.charAt(i);
            char targetColor = targetState.charAt(i);

            // 초기 상태와 목표 상태의 말 색상이 다를 경우 작업 횟수 증가
            if (initialColor != targetColor) {
                if (initialColor == 'W') {
                    flipCount++; // 흰색 말을 뒤집는 작업
                } else {
                    swapCount++; // 검은색 말과 위치를 바꾸는 작업
                }
            }
        }

        // 뒤집는 작업과 위치 바꾸는 작업 중 더 큰 값을 선택하여 반환
        return Math.max(flipCount, swapCount);
    }
}
