import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next();
        
        int result;
        
        if (input.startsWith("0x")) {
            // 16진수인 경우, 문자열에서 "0x"를 제외하고 16진수 문자열을 10진수로 변환
            result = Integer.parseInt(input.substring(2), 16);
        } else if (input.startsWith("0")) {
            // 8진수인 경우, 문자열에서 맨 앞의 "0"을 제외하고 8진수 문자열을 10진수로 변환
            result = Integer.parseInt(input.substring(1), 8);
        } else {
            // 10진수인 경우, 입력값을 그대로 10진수로 변환
            result = Integer.parseInt(input);
        }
        
        // 변환된 10진수를 출력
        System.out.println(result);
    }
    
}
