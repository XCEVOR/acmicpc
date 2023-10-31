import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        sc.nextLine();
        
        for (int t = 0; t < testCase; t++) {
            // 한 줄을 공백으로 분리
            String[] inputLine = sc.nextLine().split(" ");
            
            // 결과에 초기 값을 저장
            double result = Double.parseDouble(inputLine[0]);
            
            for (int i = 1; i < inputLine.length; i++) {
                // 연산자를 하나씩 불러옴
                char operator = inputLine[i].charAt(0);
                // 화성 수학을 적용
                result = calculateMarsMath(result, operator);
            }
            
            // 소수점 둘째 자리까지 출력
            System.out.printf("%.2f\n", result);
        }
    }
    
    // 화성 수학을 연산하는 메서드
    private static double calculateMarsMath(double value, char operator) {
        if (operator == '@') {
            return value * 3;
        } else if (operator == '%') {
            return value + 5;
        } else if (operator == '#') {
            return value - 7;
        }
        return value;
    }
    
}
