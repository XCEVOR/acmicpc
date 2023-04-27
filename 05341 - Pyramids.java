import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int total = 0;
            int b = sc.nextInt();
            if (b == 0) break;
            
            for (int i = 1; i <= b; i++) {
                total += i;
            }
            
            System.out.println(total);
        }
        
    }
}
