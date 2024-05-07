import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수열의 길이 입력
        int N = sc.nextInt();
        int[] sequence = new int[N];
        
        // 수열 입력
        for (int i = 0; i < N; i++) {
            sequence[i] = sc.nextInt();
        }
        
        // 가장 긴 수열의 길이 찾기
        int maxLength = findLongestSequence(N, sequence);
        
        // 결과 출력
        System.out.println(maxLength);
    }
    
    // 주어진 수열에서 가장 긴 증가 수열과 감소 수열의 길이를 계산하고, 두 값 중 큰 값을 반환하는 메서드
    private static int findLongestSequence(int N, int[] sequence) {
        // 각 위치에서의 증가 수열과 감소 수열의 길이 계산
        int[] increasing = calculateIncreasingSequence(N, sequence);
        int[] decreasing = calculateDecreasingSequence(N, sequence);
        
        // 가장 긴 수열의 길이 찾기
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            maxLength = Math.max(maxLength, Math.max(increasing[i], decreasing[i]));
        }
        
        return maxLength;
    }
    
    // 주어진 수열에서 각 위치에서의 증가 수열의 길이를 계산하는 메서드
    private static int[] calculateIncreasingSequence(int N, int[] sequence) {
        int[] increasing = new int[N];
        // 첫 번째 위치의 수열은 1로 초기화
        increasing[0] = 1;
        
        // 두 번째 위치부터 시작하여 이전 위치와 비교하여 증가 수열의 길이 계산
        for (int i = 1; i < N; i++) {
            if (sequence[i] >= sequence[i - 1]) {
                // 현재 숫자가 이전 숫자보다 크거나 같으면
                // 이전 증가 수열의 길이에 1을 더함
                increasing[i] = increasing[i - 1] + 1;
            } else {
                // 현재 숫자가 이전 숫자보다 작으면
                // 현재 위치에서의 증가 수열의 길이는 1
                increasing[i] = 1;
            }
        }
        
        return increasing;
    }
    
    // 주어진 수열에서 각 위치에서의 감소 수열의 길이를 계산하는 메서드
    private static int[] calculateDecreasingSequence(int N, int[] sequence) {
        int[] decreasing = new int[N];
        // 첫 번째 위치의 수열은 1로 초기화
        decreasing[0] = 1;
        
        // 두 번째 위치부터 시작하여 이전 위치와 비교하여 감소 수열의 길이 계산
        for (int i = 1; i < N; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                // 현재 숫자가 이전 숫자보다 작거나 같으면
                // 이전 감소 수열의 길이에 1을 더함
                decreasing[i] = decreasing[i - 1] + 1;
            } else {
                // 현재 숫자가 이전 숫자보다 크면
                // 현재 위치에서의 감소 수열의 길이는 1
                decreasing[i] = 1;
            }
        }
        
        return decreasing;
    }
}
