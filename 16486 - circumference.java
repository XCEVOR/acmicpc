import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        
        double result = calcCircumference(d1, d2);
        
        System.out.println(result);
    }
    
    private static double calcCircumference(int d1, int d2) {
        double PI = 3.141592;
        double circle = 2 * PI * d2;
        return 2 * d1 + circle;
    }
    
}
