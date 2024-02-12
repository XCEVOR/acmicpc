import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 단어 입력 받기
        String word = sc.next();
        
        // WordProcessor 객체 생성
        WordProcessor wordProcessor = new WordProcessor();
        
        // 가장 작은 연결된 단어 찾기
        String result = wordProcessor.findSmallestConcatenatedWord(word);
        
        // 결과 출력
        System.out.println(result);
    }
}

class WordProcessor {
    // 가장 작은 연결된 단어 찾는 메서드
    public String findSmallestConcatenatedWord(String word) {
        // 단어의 모든 가능한 조합 생성
        List<String> words = generateConcatenatedWords(word);
        // 가장 작은 단어 찾기
        return findSmallestWord(words);
    }
    
    // 단어의 모든 가능한 조합 생성하는 메서드
    private List<String> generateConcatenatedWords(String word) {
        // 생성된 단어들을 저장할 리스트 생성
        List<String> words = new ArrayList<>();
        
        // 단어를 세 부분으로 쪼개고 역순으로 결합하여 리스트에 추가
        for (int i = 1; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                String firstPart = reverseString(word.substring(0, i));
                String secondPart = reverseString(word.substring(i, j));
                String thirdPart = reverseString(word.substring(j));
                
                words.add(firstPart + secondPart + thirdPart);
            }
        }
        
        // 생성된 단어 리스트 반환
        return words;
    }
    
    // 문자열을 역순으로 변환하는 메서드
    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    // 리스트에서 가장 작은 단어를 찾는 메서드
    private String findSmallestWord(List<String> words) {
        // 리스트를 사전순으로 정렬
        Collections.sort(words);
        // 가장 작은 단어 반환
        return words.get(0);
    }
}
