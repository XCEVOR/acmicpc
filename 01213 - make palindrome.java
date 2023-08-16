import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        
        String palindrome = createPalindrome(name);
        
        System.out.println(palindrome);
    }
    
    public static String createPalindrome(String name) {
        int[] alphabetCount = new int[26];
        for (char c : name.toCharArray()) {
            alphabetCount[c - 'A']++;
        }
        
        StringBuilder halfPalindrome = new StringBuilder();
        char oddCharacter = 0;
        
        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] % 2 == 1) {
                if (oddCharacter != 0) {
                    return "I'm Sorry Hansoo";
                }
                oddCharacter = (char) ('A' + i);
            }
            
            for (int j = 0; j < alphabetCount[i] / 2; j++) {
                halfPalindrome.append((char) ('A' + i));
            }
        }
        
        StringBuilder palindrome = new StringBuilder(halfPalindrome.toString());
        if (oddCharacter != 0) {
            palindrome.append(oddCharacter);
        }
        palindrome.append(halfPalindrome.reverse());
        
        return palindrome.toString();
    }
    
}



/*
AABBCCCDD

ABCDCDCBA
*/
