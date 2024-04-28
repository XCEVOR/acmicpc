import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            String input = sc.next();
            
            String result = checkOddOrEven(input);
            
            System.out.println(result);
        }
    }
    
    private static String checkOddOrEven(String input) {
        int lastDigit = Character.getNumericValue(input.charAt(input.length() - 1));
        if (lastDigit % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
