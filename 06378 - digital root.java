import java.util.Scanner;

public class Main {
    // 입력값을 저장하는 변수
    static String input;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 여러 양의 정수 입력을 받음
        while (true) {
            // 한 줄을 입력받아 input 변수에 저장
            input = sc.nextLine();
            
            // 입력값이 "0"이면 루프 종료
            if (input.equals("0")) {
                break;
            }
            
            // 입력값의 디지털 루트를 계산하고 출력
            int digitalRoot = calculateDigitalRoot(input);
            
            System.out.println(digitalRoot);
        }
    }
    
    // 디지털 루트를 계산하는 메서드
    private static int calculateDigitalRoot(String input) {
        // 입력값이 한 자리 숫자가 될 때까지 반복
        while (input.length() > 1) {
            // 각 자리수를 더한 값을 저장하는 변수
            int sum = 0;
            
            // 각 자리수를 더함
            for (int i = 0; i < input.length(); i++) {
                sum += Character.getNumericValue(input.charAt(i));
            }
            
            // 새로운 값을 input 변수에 저장
            input = String.valueOf(sum);
        }
        
        // 결과값을 정수로 변환하여 반환
        return Integer.parseInt(input);
    }
    
}
