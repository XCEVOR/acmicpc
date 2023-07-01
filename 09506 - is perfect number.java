import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        while ((n = sc.nextInt()) != -1) {
            if (isPerfectNumber(n)) {
                List<Integer> divisors = getDivisors(n);
                System.out.print(n);
                System.out.print(" = ");
                for (int i = 0; i < divisors.size() - 1; i++) {
                    System.out.print(divisors.get(i) + " + ");
                }
                System.out.println(divisors.get(divisors.size() - 1));
            }
            else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }

    private static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    private static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
    
}
