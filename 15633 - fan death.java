import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int sumOfDivisors = calculateSumOfDivisors(n);
        
        int result = (sumOfDivisors * 5) - 24;
        
        System.out.println(result);
    }
    
    public static int calculateSumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
