import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            words.add(word);
        }

        List<Character> output = findAlphabetWithFiveMore(words);

        if (output.isEmpty()) {
            System.out.print("PREDAJA");
        } else {
            Collections.sort(output);
            for (char c : output) {
                System.out.print(c);
            }
        }
    }

    private static List<Character> findAlphabetWithFiveMore(List<String> words) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (String word : words) {
            char firstChar = word.charAt(0);
            countMap.put(firstChar, countMap.getOrDefault(firstChar, 0) + 1);
        }

        List<Character> output = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= 5) {
                output.add(entry.getKey());
            }
        }

        return output;
    }
    
}
