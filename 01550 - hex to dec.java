import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine();
        
        int result = convertHexToDecimal(hex);
        
        System.out.print(result);
    }
    
    public static int convertHexToDecimal(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        return decimal;
    }
    
}
