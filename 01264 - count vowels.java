import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String sentence = sc.nextLine();

            if (sentence.equals("#")) break;
            int vowelCount = countVowels(sentence);
            
            System.out.println(vowelCount);
        }
    }

    public static int countVowels(String sentence) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                count += 1;
            }
        }

        return count;
    }
    
}
