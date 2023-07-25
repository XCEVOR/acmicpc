import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int count = countTrailingZeros(N);
        
        System.out.println(count);
    }

    private static int countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        return count;
    }
    
}
