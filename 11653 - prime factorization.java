import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        primeFactorization(N);
    }
    
    // 소인수분해 함수
    private static void primeFactorization(int N) {
        // N이 1인 경우 아무것도 출력하지 않음
        if (N == 1) {
            return;
        }
        
        // N의 제곱근까지만 검사
        for (int i = 2; i * i <= N; i++) {
            // 정수 N을 i로 나눌 수 없을때까지 반복
            while (N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }
        
        // 마지막 소인수 출력
        if (N > 1) {
            System.out.println(N);
        }
    }
    
}
