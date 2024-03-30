import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        int A = sc.nextInt();  // 분자
        int B = sc.nextInt();  // 분모
        int N = sc.nextInt();  // 소숫점 아래 N번째 자리수
        
        // 피제수 A를 제수 B로 나눈 뒤, N번째 자리수 구하기
        int result = divideAndFindNthDecimal(A, B, N);
        
        // 결과 출력
        System.out.println(result);
    }
    
    // 분자를 분모로 나누어 소숫점 아래 N번째 자리수를 반환하는 메서드
    private static int divideAndFindNthDecimal(int A, int B, int N) {
        int quotient = A / B;  // 몫 초기화
        int remainder = A % B;  // 나머지 초기화
        
        // 소수점 아래 N번째 자리수까지 반복하여 계산
        for (int i = 0; i < N; i++) {
            remainder *= 10;  // 나머지를 10배하여 다음 자리수로 이동
            quotient = remainder / B;  // 나누어진 몫 계산
            remainder %= B;  // 나눈 후의 나머지 업데이트
        }
        
        return quotient;  // N번째 자리수 반환
    }
}
