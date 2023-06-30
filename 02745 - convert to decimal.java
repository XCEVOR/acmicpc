import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();  // B진법 수 N 입력
        int b = sc.nextInt();  // 진법 B 입력
        
        int result = convertToDecimal(n, b);
        
        System.out.print(result);
    }
    
    public static int convertToDecimal(String n, int b) {
        int decimal = Integer.parseInt(n, b);
        return decimal;
    }
    
}
