import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String expression = sc.nextLine();
        
        long result = calculate(expression);
        
        System.out.println(result);
    }
    
    private static long calculate(String expression) {
        Stack<Long> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((long)(c - '0'));
            } else {
                long operand2 = stack.pop();
                long operand1 = stack.pop();
                long tempResult;
                switch (c) {
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
        
        return stack.pop();
    }
}
