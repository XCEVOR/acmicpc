import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수 입력
        int testCase = sc.nextInt();
        
        // 각 테스트 케이스 처리
        for (int t = 0; t < testCase; t++) {
            // 수의 개수 입력
            int n = sc.nextInt();
            
            // 수 배열 초기화
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                // 수 입력
                numbers[i] = sc.nextInt();
            }
            
            // 쌍의 GCD의 합 계산
            long result = calculateGCDSum(numbers);
            
            // 결과 출력
            System.out.println(result);
        }
    }
    
    // 쌍의 GCD의 합을 계산하는 메서드
    public static long calculateGCDSum(int[] numbers) {
        int n = numbers.length;
        long sum = 0;
        
        // 가능한 모든 쌍의 GCD의 합을 계산
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // 쌍의 GCD 계산 및 누적
                sum += gcd(numbers[i], numbers[j]);
            }
        }
        return sum;
    }
    
    // 최대공약수를 구하는 메서드
    public static int gcd(int n, int m) {
        // 유클리드 호제법을 사용하여 최대공약수 계산
        while (m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }
    
}
