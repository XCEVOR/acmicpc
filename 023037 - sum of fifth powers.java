import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 다섯 자리 양의 정수 입력
        int n = sc.nextInt();
        
        // 다섯 자리 양의 정수의 각 자릿수의 다섯제곱의 합을 구하는 함수 호출
        int sum = sumOfFifthPowers(n);
        
        // 결과 출력
        System.out.println(sum);
    }
    
    // 각 자릿수의 다섯제곱의 합을 계산하는 함수
    public static int sumOfFifthPowers(int num) {
        // 초기 합계를 저장할 변수
        int sum = 0;
        
        // 입력받은 정수가 0보다 큰 동안 반복
        while (num > 0) {
            // 입력받은 정수의 일의 자리 숫자 추출
            int digit = num % 10;
            
            // 추출한 숫자의 다섯제곱을 합계에 더함
            sum += Math.pow(digit, 5);
            
            // 다음 자릿수를 확인하기 위해 10으로 나눔
            num /= 10;
        }
        
        // 최종 합계 반환
        return sum;
    }
}
