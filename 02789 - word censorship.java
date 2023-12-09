import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 단어 입력 받기
        String word = sc.nextLine();
        
        // 단어를 검열하여 결과 출력
        String censoredWord = censorWord(word);
        
        System.out.println(censoredWord);
    }
    
    // 단어를 검열하는 함수
    public static String censorWord(String word) {
        // HashSet을 사용하여 검열할 알파벳들을 저장
        Set<Character> censoredAlphabets = new HashSet<>();
        String censoredLetters = "CAMBRIDGE";
        
        // censoredLetters의 각 알파벳을 HashSet에 추가
        for (char c : censoredLetters.toCharArray()) {
            censoredAlphabets.add(c);
        }
        
        // 검열된 결과를 저장할 StringBuilder 생성
        StringBuilder result = new StringBuilder();
        
        // 단어의 각 문자를 확인하여 검열할 알파벳인지 검사하고 결과에 추가
        for (char c : word.toCharArray()) {
            // HashSet을 사용하여 상수 시간(O(1))에 해당 알파벳이 검열할 알파벳 집합에 포함되어 있는지 확인
            if (!censoredAlphabets.contains(c)) {
                // 검열할 알파벳이 아닌 경우 결과에 추가
                result.append(c);
            }
        }
        
        // 최종 검열된 결과를 문자열로 반환
        return result.toString();
    }
}
