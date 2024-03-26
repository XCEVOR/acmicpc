import java.util.Scanner;

public class Main {
    static int[] permutation;  // 순열을 저장할 배열
    static boolean[] chosen;  // 숫자 사용 여부를 표시할 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // N을 입력
        
        permutation = new int[N];  // 순열을 저장할 배열 초기화
        chosen = new boolean[N + 1];  // 숫자 사용 여부를 표시할 배열 초기화
        
        generatePermutations(N, 0);  // 순열 생성 함수 호출
    }
    
    // 순열을 생성하는 재귀 함수
    private static void generatePermutations(int N, int depth) {
        if (depth == N) {  // 순열의 길이가 N과 같으면
            printPermutation();  // 순열 출력
            return;
        }
        
        for (int i = 1; i <= N; i++) {  // 1부터 N까지의 숫자에 대해 반복
            if (!chosen[i]) {  // 숫자가 사용되지 않았으면
                chosen[i] = true;  // 해당 숫자 사용 표시
                permutation[depth] = i;  // 순열에 숫자 추가
                generatePermutations(N, depth + 1);  // 재귀 호출로 다음 숫자를 추가
                chosen[i] = false;   // 숫자 사용 해제
            }
        }
    }
    
    // 순열을 출력하는 함수
    private static void printPermutation() {
        for (int i = 0; i < permutation.length; i++) {
            System.out.print(permutation[i] + " ");  // 순열 출력
        }
        System.out.println();  // 줄 바꿈
    }
}
