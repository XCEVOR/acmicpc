import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // 주어진 10진수를 -2진수로 변환하여 결과를 출력
        String result = decimalToNegativeBinary(n);
        
        System.out.println(result);
    }
    
    // 주어진 10진수를 -2진수로 변환하는 함수
    private static String decimalToNegativeBinary(int n) {
        // 10진수가 0이면 -2진수로 0을 반환
        if (n == 0) {
            return "0";
        }
        
        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder result = new StringBuilder();
        
        // 10진수를 -2진수로 변환하는 과정
        while (n != 0) {
            // 현재의 나머지 계산
            int remainder = n % -2;
            // 몫 계산
            n /= -2;
            
            // 음수의 경우 나머지가 음수이면 2를 더해주고 몫에 1을 더해주는 보정
            if (remainder < 0) {
                remainder += 2;
                n += 1;
            }
            
            // 나머지를 결과 문자열의 맨 앞에 추가하여 역순으로 저장
            result.insert(0, remainder);
        }
        
        // 최종 결과를 문자열로 반환
        return result.toString();
    }
    
}
