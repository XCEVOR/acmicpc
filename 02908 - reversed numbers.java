import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int reversedNumber1 = reverseNumber(number1);
        int reversedNumber2 = reverseNumber(number2);
        
        int result = compareTheReversedNumbers(reversedNumber1, reversedNumber2);
        
        System.out.print(result);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            // System.out.println("number: " + number);  // TEST PRINT
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
            // System.out.println("reversedNumber: " + reversedNumber);  // TEST PRINT
        }
        return reversedNumber;
    }
    
    public static int compareTheReversedNumbers(int reversedNumber1, int reversedNumber2) {
        int maxReversedNumber = Math.max(reversedNumber1, reversedNumber2);
        return maxReversedNumber;
    }
    
}



/*

734 893

number: 734
reversedNumber: 4
number: 73
reversedNumber: 43
number: 7
reversedNumber: 437
number: 893
reversedNumber: 3
number: 89
reversedNumber: 39
number: 8
reversedNumber: 398

437

*/
