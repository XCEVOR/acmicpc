import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a + b == c) {
            System.out.println(a + "+" + b + "=" + c);
        } else if (a - b == c) {
            System.out.println(a + "-" + b + "=" + c);
        } else if (a * b == c) {
            System.out.println(a + "*" + b + "=" + c);
        } else if (a / b == c && a % b == 0) {
            System.out.println(a + "/" + b + "=" + c);
        } else if (b + c == a) {
            System.out.println(a + "=" + b + "+" + c);
        } else if (b - c == a) {
            System.out.println(a + "=" + b + "-" + c);
        } else if (b * c == a) {
            System.out.println(a + "=" + b + "*" + c);
        } else if (b / c == a && b % c == 0) {
            System.out.println(a + "=" + b + "/" + c);
        }
    }
    
}
