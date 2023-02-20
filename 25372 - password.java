import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int tCase = sc.nextInt();
        for (int i = 0; i < tCase; i++) {
            String text = sc.next();
            if (6 <= text.length() && text.length() <= 9) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
