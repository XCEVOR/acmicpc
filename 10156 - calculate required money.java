import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int requiredMoney = calculateRequiredMoney(K, N, M);
        
        System.out.println(requiredMoney);
    }
    
    private static int calculateRequiredMoney(int K, int N, int M) {
        return Math.max(0, K * N - M);
    }
}
