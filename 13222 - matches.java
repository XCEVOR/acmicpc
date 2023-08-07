import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();
        
        double maxBottom = getMaxBottom(W, H);
        
        for (int i = 0; i < N; i++) {
            int match = sc.nextInt();
            if (match <= maxBottom) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    private static double getMaxBottom(int W, int H) {
        return Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
    }
}
