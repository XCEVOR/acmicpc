import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] ballArr = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            ballArr[i] = i;
        }
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int temp = ballArr[a];
            ballArr[a] = ballArr[b];
            ballArr[b] = temp;
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print(ballArr[i] + " ");
        }

    }
}
