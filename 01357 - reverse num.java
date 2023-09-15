import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Read two positive integers X and Y from the user.
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        // Calculate the reverse of X and Y using the reverse() function.
        int revX = reverse(X);
        int revY = reverse(Y);
        
        // Calculate the reverse of the sum of revX and revY.
        int result = reverse(revX + revY);
        
        // Output: Print the result.
        System.out.println(result);
    }
    
    // Function to reverse a number.
    public static int reverse(int num) {
        int reversedNum = 0;
        while (num > 0) {
            // Extract the last digit of num.
            int digit = num % 10;
            // Add the digit to the reversed number, shifting it left by one position.
            reversedNum = reversedNum * 10 + digit;
            // Remove the last digit from num.
            num /= 10;
        }
        // Return the reversed number.
        return reversedNum;
    }
    
}
