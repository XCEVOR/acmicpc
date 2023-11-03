import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String input = sc.nextLine();
            
            if (input.equals("END")) {
                break;
            }
            
            String decrypted = decryptCode(input);
            
            System.out.println(decrypted);
        }
    }
    
    private static String decryptCode(String code) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : code.toCharArray()) {
            stack.push(c);
        }
        
        StringBuilder decrypted = new StringBuilder();
        while (!stack.isEmpty()) {
            decrypted.append(stack.pop());
        }
        
        return decrypted.toString();
    }
    
}
