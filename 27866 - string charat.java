import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String inputText = sc.next();
        int num = sc.nextInt();
        
        System.out.println(inputText.charAt(num - 1));
    }
    
}
