import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받은 숫자를 변수에 저장
        String input = sc.next();
        
        // 입력된 숫자가 유진수인지 판별하여 결과 출력
        if (isEugeneNumber(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    // 유진수인지를 판별하는 함수
    public static boolean isEugeneNumber(String num) {
        int len = num.length();
        
        // 숫자를 나눠가며 유진수인지 확인
        for (int i = 1; i < len; i++) {
            // 숫자를 두 부분으로 나눔
            String firstPart = num.substring(0, i);
            String secondPart = num.substring(i);
            
            // 두 부분의 자릿수 곱이 같으면 유진수이므로 true 반환
            if (calculateProduct(firstPart) == calculateProduct(secondPart)) {
                return true;
            }
        }
        // 모든 경우를 확인했지만 유진수가 아닌 경우 false 반환
        return false;
    }
    
    // 숫자의 각 자릿수를 곱하여 결과 반환하는 함수
    public static long calculateProduct(String num) {
        long product = 1;
        
        // 각 자릿수를 곱함
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            product *= digit;
        }
        // 곱한 결과 반환
        return product;
    }
    
}
