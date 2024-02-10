import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();  // read the first integer N
        int F = sc.nextInt();  // read the second integer F
        
        // call the findLastTwoDigits method to find the last two digits of N
        int result = findLastTwoDigits(N, F);
        
        // print the result
        System.out.printf("%02d\n", result);
    }
    
    private static int findLastTwoDigits(long N, int F) {
        // loop through all possible values for the last two digits
        for (int i = 0; i < 100; i++) {
            // replace the last two digits with i
            long temp = N / 100 * 100 + i;
            
            // if the modified number is divisivle by F, return the last digits
            if (temp % F == 0) {
                return i;
            }
        }
        // if no valid result is found, return -1
        return -1;
    }
    
}
