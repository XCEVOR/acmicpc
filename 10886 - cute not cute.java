import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int notCuteCount = 0;
        int cuteCount = 0;
        
        for (int i = 0; i < N; i++) {
            int opinion = sc.nextInt();
            if (opinion == 0) {
                notCuteCount++;
            } else if (opinion == 1) {
                cuteCount++;
            }
        }
        
        if (notCuteCount > cuteCount) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }
    
}
