import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String N = scanner.nextLine();
        
        String largestMultiple = findLargestMultiple(N);
        
        System.out.println(largestMultiple);
    }
    
    public static String findLargestMultiple(String N) {
        int[] digitCount = new int[10];
        int digitSum = 0;
        
        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0';
            digitCount[digit]++;
            digitSum += digit;
        }
        
        if (digitSum % 3 != 0 || digitCount[0] == 0) {
            return "-1";
        }
        
        StringBuilder largestMultiple = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            while (digitCount[i] > 0) {
                largestMultiple.append(i);
                digitCount[i]--;
            }
        }
        
        return largestMultiple.toString();
    }
    
}
