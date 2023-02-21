import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String inputStr = sc.next();
        
        String reverseStr = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reverseStr += inputStr.charAt(i);
        }
        
        System.out.println(reverseStr);
    }
}
