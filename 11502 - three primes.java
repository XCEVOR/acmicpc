import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 수 입력
        int t = sc.nextInt();
        
        // 1000 이하의 소수를 미리 구함
        boolean[] primes = ThreePrimesProblemSolver.sieveOfEratosthenes(1000);
        
        // 각 테스트 케이스에 대해 처리
        for (int i = 0; i < t; i++) {
            // 홀수 입력
            int k = sc.nextInt();
            
            // 세 소수의 합을 찾음
            int[] result = ThreePrimesProblemSolver.findPrimesSum(k, primes);
            
            // 결과 출력
            if (result != null) {
                System.out.println(result[0] + " " + result[1] + " " + result[2]);
            } else {
                System.out.println(0);
            }
        }
    }
}

class ThreePrimesProblemSolver {
    // 에라토스테네스의 체를 사용하여 소수를 구함
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }
        // 소수 찾기
        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }
        return primes;
    }
    
    // 세 소수의 합을 찾음
    public static int[] findPrimesSum(int n, boolean[] primes) {
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                for (int j = 2; j <= n; j++) {
                    if (primes[j]) {
                        for (int k = 2; k <= n; k++) {
                            if (primes[k] && (i + j + k) == n) {
                                return new int[]{i, j, k};
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
