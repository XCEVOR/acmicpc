import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        String order = sc.next();
        
        String result = printSortedNumbers(A, B, C, order);
        
        System.out.print(result);
    }
    
    private static String printSortedNumbers(int A, int B, int C, String order) {
        int[] sortedNumbers = new int[3];
        sortedNumbers[0] = A;
        sortedNumbers[1] = B;
        sortedNumbers[2] = C;
        Arrays.sort(sortedNumbers);
        
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            resultBuilder.append(sortedNumbers[order.charAt(i) - 'A']);
            if (i < 2) {
                resultBuilder.append(" ");
            }
        }
        return resultBuilder.toString();
    }
}
