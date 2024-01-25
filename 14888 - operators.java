import java.util.Scanner;

public class Main {
    static int N;  // 수의 개수
    static int[] numbers;  // 수열을 저장하는 배열
    static int[] operators;  // 연산자의 개수를 저장하는 배열
    static long maxResult = Long.MIN_VALUE;  // 최대값 초기화
    static long minResult = Long.MAX_VALUE;  // 최소값 초기화

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        N = sc.nextInt();
        numbers = new int[N];
        operators = new int[4];
        
        // 수열 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 연산자 개수 입력
        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }
        
        // 브루트포스 알고리즘 호출
        calculate(1, numbers[0]);
        
        // 결과 출력
        System.out.println(maxResult);
        System.out.println(minResult);
    }
    
    // 브루트포스 알고리즘을 통해 최대값과 최소값을 계산
    private static void calculate(int index, long result) {
        // 수열을 모두 사용한 경우
        if (index == N) {
            maxResult = Math.max(maxResult, result);
            minResult = Math.min(minResult, result);
            return;
        }
        
        // 각 연산자를 사용하여 재귀 호출
        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                
                // 연산자에 따라 계산 후 재귀 호출
                switch (i) {
                    case 0:
                        calculate(index + 1, result + numbers[index]);
                        break;
                    case 1:
                        calculate(index + 1, result - numbers[index]);
                        break;
                    case 2:
                        calculate(index + 1, result * numbers[index]);
                        break;
                    case 3:
                        calculate(index + 1, result / numbers[index]);
                        break;
                }
                
                operators[i]++;
            }
        }
    }
}
