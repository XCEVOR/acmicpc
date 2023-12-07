import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 단의 수 입력
        int K = sc.nextInt(); // 항의 수 입력
        
        int maxResult = 0; // 가장 큰 결과값 초기화
        
        // 주어진 항의 수만큼 반복하여 거꾸로 구구단의 최댓값 계산
        for (int i = 1; i <= K; i++) {
            int result = reverseMultiplication(N, i); // 거꾸로 구구단 결과 계산
            if (result > maxResult) { // 현재 결과값이 최댓값보다 크면 업데이트
                maxResult = result;
            }
        }
        
        System.out.print(maxResult); // 최종 최댓값 출력
    }
    
    // 거꾸로 구구단 계산 함수
    public static int reverseMultiplication(int N, int i) {
        int result = N * i; // 구구단 계산
        result = reverseNumber(result); // 결과값을 거꾸로 변환
        
        return result; // 거꾸로 변환된 결과값 반환
    }
    
    // 숫자를 거꾸로 뒤집는 함수
    public static int reverseNumber(int num) {
        int reversed = 0; // 거꾸로 변환된 숫자 초기화
        while (num > 0) {
            int digit = num % 10; // 숫자의 맨 끝 자리수 추출
            reversed = reversed * 10 + digit; // 추출한 자리수를 거꾸로 숫자에 추가
            num /= 10; // 다음 자리수 추출을 위해 10으로 나눔
        }
        
        return reversed; // 거꾸로 변환된 숫자 반환
    }
}
