import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int sum = 0;
        int minPrime = -1;

        for (int num = M; num <= N; num++) {
            if (isPrime(num)) {
                sum += num;
                if (minPrime == -1 || num < minPrime) {
                    minPrime = num;
                }
            }
        }

        if (minPrime == -1) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
