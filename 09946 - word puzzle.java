import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int caseNum = 1;
        
        while (true) {
            String originalWord = sc.nextLine();
            String collectedLetters = sc.nextLine();
            
            if (originalWord.equals("END") && collectedLetters.equals("END")) {
                break;
            }
            
            String sortedOriginal = sortString(originalWord);
            String sortedCollected = sortString(collectedLetters);
            
            if (sortedOriginal.equals(sortedCollected)) {
                System.out.println("Case " + caseNum + ": same");
            } else {
                System.out.println("Case " + caseNum + ": different");
            }
            
            caseNum++;
        }
    }
    
    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
