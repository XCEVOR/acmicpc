import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String document = sc.nextLine();
        String word = sc.nextLine();
        
        int result = countNonOverlappingOccurrences(document, word);
        
        System.out.println(result);
    }
    
    public static int countNonOverlappingOccurrences(String document, String word) {
        int documentLength = document.length();
        int wordLength = word.length();
        int maxNonOverlappingCount = 0;
        
        for (int i = 0; i <= documentLength - wordLength; i++) {
            boolean isNonOverlapping = true;
            
            for (int j = 0; j < wordLength; j++) {
                if (document.charAt(i + j) != word.charAt(j)) {
                    isNonOverlapping = false;
                    break;
                }
            }
            
            if (isNonOverlapping) {
                maxNonOverlappingCount++;
                i += wordLength - 1;
            }
        }
        
        return maxNonOverlappingCount;
    }
    
}
