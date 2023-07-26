import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 입력으로 주어진 수열 A를 저장할 배열
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int count = findSubarraySumCount(A, M);
        
        System.out.println(count);
    }

    // i번째 수부터 j번째 수까지의 합이 M이 되는 경우의 수를 반환하는 함수
    private static int findSubarraySumCount(int[] A, int M) {
        int N = A.length;

        // 누적 합 배열 B 초기화
        int[] B = new int[N];
        B[0] = A[0];
        for (int i = 1; i < N; i++) {
            B[i] = B[i - 1] + A[i];
        }

        int count = 0; // 경우의 수를 저장할 변수

        // 모든 경우의 수를 탐색하면서 합이 M인 경우 카운트
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sum = B[j] - (i > 0 ? B[i - 1] : 0);
                if (sum == M) {
                    count++;
                }
            }
        }

        return count;
    }
    
}
