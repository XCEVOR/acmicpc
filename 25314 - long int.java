import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String result = findTheTypeName(n);
        
        System.out.print(result);
    }
    
    public static String findTheTypeName(int n) {
        String theTypeName = "long ".repeat(n / 4) + "int";
        return theTypeName;
    }
    
}
