import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] alphabet = new int[26];
        char[] wordArr = sc.next().toCharArray();
        
        for (int i = 0; i < wordArr.length; i++) {
            // System.out.println(wordArr[i]); // TEST PRINT
            // System.out.println(wordArr[i] - 97); // TEST PRINT
            
            alphabet[wordArr[i] - 97] += 1;
        }
        
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
        
    }
}
