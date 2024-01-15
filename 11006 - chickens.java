import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[] result = getLegAndChicken(n, m);
            
            System.out.println(result[0] + " " + result[1]);
        }
    }
    
    private static int[] getLegAndChicken(int n, int m) {
        int U = 2 * m - n;
        int T = m - U;
        
        return new int[]{U, T};
    }
    
}
