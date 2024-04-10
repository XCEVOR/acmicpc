import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수 입력
        int testCases = sc.nextInt();
        
        // 각 테스트 케이스에 대해 반복
        for (int t = 0; t < testCases; t++) {
            // 정수 n 입력
            long n = sc.nextLong();
            
            // n보다 크거나 같은 소수 찾기
            for (long i = n; ; i++) {
                // 소수인지 확인하는 함수 호출
                if (isPrime(i)) {
                    // 가장 작은 소수 출력 후 반복 종료
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    
    // 소수를 판별하는 함수
    private static boolean isPrime(long n) {
        // 1 이하의 수는 소수가 아님
        if (n <= 1) return false;
        
        // 2와 3은 소수
        if (n <= 3) return true;
        
        // 2와 3을 제외한 모든 짝수는 소수가 아님
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        // 에라토스테네스의 체 알고리즘을 이용하여 소수 판별
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        // 소수인 경우
        return true;
    }
}
