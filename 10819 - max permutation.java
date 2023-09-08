import java.util.Scanner;

public class Main {
    static int N;
    static int[] A;
    static boolean[] used;
    static int maxSum = Integer.MIN_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();  // 배열의 크기 N을 입력받음
        A = new int[N];  // 배열 A를 선언
        used = new boolean[N];  // 순열 생성 시 사용 여부를 표시하는 배열
    
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();  // 배열 A에 정수 입력
        }
        
        permutation(0, new int[N]);  // 백트래킹을 사용하여 순열 생성
        
        System.out.println(maxSum);  // 최댓값 출력
    }

    static void permutation(int depth, int[] result) {
        if (depth == N) {  // 순열의 길이가 N과 같아지면
            int sum = calculateSum(result);  // 주어진 식의 값을 계산
            maxSum = Math.max(maxSum, sum);  // 최댓값 업데이트
            return;
        }
        
        for (int i = 0; i < N; i++) {
            if (!used[i]) {  // 아직 사용되지 않은 숫자라면
                used[i] = true;  // 사용 표시
                result[depth] = A[i];  // 순열에 현재 숫자 추가
                permutation(depth + 1, result);  // 다음 순열 생성
                used[i] = false;  // 백트래킹: 숫자 사용 해제
            }
        }
    }
    
    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);  // 주어진 식의 값을 계산
        }
        return sum;
    }
}
