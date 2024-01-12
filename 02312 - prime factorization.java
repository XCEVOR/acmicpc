import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // 테스트 케이스의 수
        
        // 각 테스트 케이스에 대해 소인수분해 결과 출력
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();  // 양의 정수 N
            primeFactorization(N);  // 소인수분해 함수 호출
        }
    }
    
    // 주어진 수를 소인수분해하여 출력하는 함수
    static void primeFactorization(int n) {
        boolean[] isPrime = getPrimes(n);  // 소수 여부를 저장하는 배열
        
        // 2부터 n까지 각 인수에 대한 소인수분해 수행
        for (int i = 2; i <= n; i++) {
            int count = 0;  // 현재 인수가 나누어지는 횟수
            // 현재 인수로 나누어지는 동안 반복
            while (n % i == 0 && isPrime[i]) {
                n /= i;  // 현재 인수로 나눈 몫으로 갱신
                count++;  // 나누어진 횟수 증가
            }
            
            // 나누어진 횟수가 1 이상일 때만 출력
            if (count > 0) {
                System.out.println(i + " " + count);  // 현재 인수와 횟수 출력
            }
        }
    }
    
    // 에라토스테네스의 체를 사용하여 소수 여부를 판별하는 함수
    static boolean[] getPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];  // 소수 여부를 저장하는 배열
        
        // 초기화: 모든 수를 소수로 가정
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        // 2부터 n의 제곱근까지 반복하여 소수 여부 갱신
        for (int i = 2; i * i <= n; i++) {
            // 현재 수가 소수인 경우
            if (isPrime[i]) {
                // 현재 소수의 배수를 모두 소수가 아닌 것으로 표시
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;  // 소수 여부 배열 반환
    }
  
}
