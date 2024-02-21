import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 테스트 케이스의 개수 입력
        sc.nextLine(); // 개행 문자 처리
        
        LCMCalculator lcmCalculator = new LCMCalculator(); // 최소공배수 계산을 위한 객체 생성
        
        // 테스트 케이스의 개수만큼 반복
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");  // 입력을 공백을 기준으로 분리
            long a = Long.parseLong(input[0]);  // 첫 번째 수
            long b = Long.parseLong(input[1]);  // 두 번째 수
            long result = lcmCalculator.calculateLCM(a, b);  // 최소공배수 계산
            
            System.out.println(result); // 결과 출력
        }
    }
}

// 최소공배수 계산을 위한 클래스
class LCMCalculator {
    // 최소공배수 계산 메서드
    public long calculateLCM(long a, long b) {
        return (a * b) / gcd(a, b);  // 최소공배수는 두 수의 곱을 최대공약수로 나눈 값
    }
    
    // 최대공약수를 구하는 메서드
    private long gcd(long a, long b) {
        // 유클리드 호제법을 사용하여 최대공약수 계산
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;  // 최대공약수 반환
    }
}
