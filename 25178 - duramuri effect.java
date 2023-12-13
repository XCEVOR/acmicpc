import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 입력으로 단어의 길이 N을 받음
        
        String word1 = sc.next(); // 첫 번째 단어 입력
        String word2 = sc.next(); // 두 번째 단어 입력
        
        // 두 단어가 두라무리 효과를 가지는지 확인
        if (isDuramuriEffect(word1, word2)) {
            System.out.println("YES"); // 만약 두라무리 효과를 가지면 YES 출력
        } else {
            System.out.println("NO"); // 그렇지 않으면 NO 출력
        }
    }
    
    // 두 단어가 두라무리 효과를 가지는지 확인하는 메서드
    public static boolean isDuramuriEffect(String word1, String word2) {
        char[] word1Chars = word1.toCharArray(); // 첫 번째 단어를 문자 배열로 변환
        char[] word2Chars = word2.toCharArray(); // 두 번째 단어를 문자 배열로 변환
        
        // 각 단어의 문자를 사전순으로 정렬
        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);
        
        // 정렬된 문자 배열을 다시 문자열로 변환
        String sortedWord1 = new String(word1Chars);
        String sortedWord2 = new String(word2Chars);
        
        // 정렬된 단어들이 같은지 확인
        if (!sortedWord1.equals(sortedWord2)) {
            return false; // 만약 다르다면 두라무리 효과를 가지지 않음
        }
        
        if (word1.charAt(0) != word2.charAt(0) || word1.charAt(word1.length() - 1) != word2.charAt(word2.length() - 1)) {
            return false; // 첫 번째와 마지막 글자가 다르다면 두라무리 효과를 가지지 않음
        }
        
        // 각 단어에서 모음을 제거한 문자열 생성
        String filteredWord1 = removeVowels(word1);
        String filteredWord2 = removeVowels(word2);
        
        // 제거된 모음들이 같은지 확인하여 두라무리 효과를 가지는지 판별
        return filteredWord1.equals(filteredWord2);
    }
    
    // 모음을 제거하는 메서드
    public static String removeVowels(String word) {
        return word.replaceAll("[aeiou]", ""); // 정규 표현식을 사용하여 모음을 제거한 문자열 반환
    }
}
