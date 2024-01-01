import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            
            if (a1 == 0 && a2 == 0 && a3 == 0) break;
            
            if (a2 - a1 == a3 - a2) {
                int commonDifference = a2 - a1;
                int nextTerm = a3 + commonDifference;
                System.out.println("AP " + nextTerm);
            } else {
                int commonRatio = a2 / a1;
                int nextTerm = a3 * commonRatio;
                System.out.println("GP " + nextTerm);
            }
        }
    }
    
}
