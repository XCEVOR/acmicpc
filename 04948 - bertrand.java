import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력이 0이 나올 때까지 반복
        while (true) {
            // 자연수 n을 입력 받음
            int n = sc.nextInt();
            // 입력이 0이면 반복 종료
            if (n == 0) break;
            
            // 에라토스테네스의 체를 사용하여 n보다 크고 2n보다 작거나 같은 소수를 구함
            boolean[] primes = getPrimes(n);
            // 소수의 개수를 저장할 변수 초기화
            int count = 0;
            
            // n보다 크고, 2n보다 작거나 같은 범위 내의 소수 개수를 세기
            for (int i = n + 1; i <= 2 * n; i++) {
                if (primes[i]) {
                    count++;
                }
            }
            
            // 결과 출력
            System.out.println(count);
        }
    }
    
    // 에라토스테네스의 체를 사용하여 소수를 구하는 메소드
    private static boolean[] getPrimes(int n) {
        // 소수 여부를 저장할 배열 생성
        boolean[] primes = new boolean[2 * n + 1];
        // 초기화: 2부터 2n까지 모두 소수로 설정
        for (int i = 2; i <= 2 * n; i++) {
            primes[i] = true;
        }
        
        // 에라토스테네스의 체 알고리즘을 사용하여 소수 판별
        for (int i = 2; i * i <= 2 * n; i++) {
            if (primes[i]) {
                // 소수인 경우, 해당 소수의 배수들은 모두 소수가 아니므로 false로 설정
                for (int j = i * i; j <= 2 * n; j += i) {
                    primes[j] = false;
                }
            }
        }
        
        return primes; // 소수 여부를 담은 배열 반환
    }
    
}
