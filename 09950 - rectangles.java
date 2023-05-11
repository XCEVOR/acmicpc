import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a == 0 && b == 0 && c == 0) return;
            else if (c == 0) c = a * b;
            else if (a == 0) a = c / b;
            else if (b == 0) b = c / a;
            
            System.out.println(a + " " + b + " " + c);
        }

    }
}
