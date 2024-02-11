import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnagramChecker anagramChecker = new AnagramChecker();
        
        anagramChecker.checkAnagrams();
    }
}

class AnagramChecker {
    public void checkAnagrams() {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCases; i++) {
            String[] words = sc.nextLine().split(" ");
            String word1 = words[0];
            String word2 = words[1];

            AnagramDetector detector = new AnagramDetector(word1, word2);

            if (detector.areAnagrams()) {
                System.out.println(word1 + " & " + word2 + " are anagrams.");
            } else {
                System.out.println(word1 + " & " + word2 + " are NOT anagrams.");
            }
        }
    }
}

class AnagramDetector {
    private String word1;
    private String word2;

    public AnagramDetector(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public boolean areAnagrams() {
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }
}
