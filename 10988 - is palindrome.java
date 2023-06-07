import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String inputWord = sc.nextLine();
        
        if ( isPalindrome(inputWord) ) {
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
    }
    
    public static boolean isPalindrome (String inputWord) {
        int lengthWord = inputWord.length();
        
        for (int i = 0; i < lengthWord / 2; i++) {
            if (inputWord.charAt(i) != inputWord.charAt(lengthWord - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
    
}
