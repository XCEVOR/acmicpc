import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수식 입력
        String expression = sc.nextLine();
        
        // 입력된 수식을 계산하고 결과를 출력
        long result = calculate(expression);
        System.out.println(result);
    }
    
    // 수식을 계산하는 메서드
    private static long calculate(String expression) {
        // 연산에 사용할 스택 생성
        Stack<Long> stack = new Stack<>();
        
        // 수식을 한 글자씩 확인하여 처리
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                // 숫자인 경우 스택에 푸시
                stack.push((long)(c - '0'));
            } else {
                // 연산자인 경우
                // 스택에서 두 개의 피연산자(숫자)를 팝하여 연산 수행
                long operand2 = stack.pop();
                long operand1 = stack.pop();
                long tempResult;
                switch (c) {
                    // 연산자에 따라 연산 수행 후 결과를 스택에 푸시
                    case '+':
                        tempResult = operand1 + operand2;
                        break;
                    case '-':
                        tempResult = operand1 - operand2;
                        break;
                    case '*':
                        tempResult = operand1 * operand2;
                        break;
                    case '/':
                        tempResult = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }
                stack.push(tempResult);
            }
        }
        
        // 마지막으로 스택에 남아 있는 결과값 반환
        return stack.pop();
    }
}
