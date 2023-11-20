import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


// 단어 쌍을 비교하기 위한 WordPair 클래스
class WordPair implements Comparable<WordPair> {
    String originalWord;  // 원래 단어
    String lowercaseWord;  // 소문자로 변환된 단어
    
    // WordPair 클래스 constructor
    public WordPair(String word) {
        this.originalWord = word;  // 원래 단어 저장
        this.lowercaseWord = word.toLowerCase();  // 소문자로 변환하여 저장
    }
    
    // Comparable 인터페이스의 compareTo 메서드 구현
    @Override
    public int compareTo(WordPair other) {
        return this.lowercaseWord.compareTo(other.lowercaseWord);  // 소문자로 변환된 단어로 비교
    }
    
    // 원래 단어를 반환하는 메서드
    public String getOriginalWord() {
        return originalWord;  // 원래 단어 반환
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();  // 테스트 케이스의 단어 수를 입력 받음
            if (n == 0) break;  // 입력이 0이면 반복문 종료
            
            // WordPair 객체를 저장할 리스트 생성
            List<WordPair> wordPairs = new ArrayList<>();
            
            // 단어 쌍을 받아 소문자로 변환하여 WordPair 객체를 생성하고 리스트에 추가하는 부분
            for (int i = 0; i < n; i++) {
                // 단어 입력 받음
                String word = sc.next();
                // 소문자로 변환된 WordPair 객체를 리스트에 추가
                wordPairs.add(new WordPair(word));
            }
            
            // 리스트 안의 WordPair 객체들을 소문자 기준으로 정렬
            // public int compareTo(WordPair other) {} 에 의해 결정
            Collections.sort(wordPairs);
            
            // 가장 앞에 있는 단어 출력
            System.out.println(wordPairs.get(0).getOriginalWord());
            
            // 정렬된 단어 쌍 출력 (TEST)
            // printWordPairs(wordPairs);  // TEST PRINT
        }
    }
    
    // 정렬된 단어 쌍을 출력하는 메서드 (TEST)
    public static void printWordPairs(List<WordPair> wordPairs) {
        // 정렬된 단어 쌍 출력
        System.out.println("Sorted Word Pairs:");
        for (WordPair pair : wordPairs) {
            System.out.println(pair.lowercaseWord + " " + pair.originalWord);
        }
        System.out.println();
    }
}



/*
bAt
Sorted Word Pairs:
bat bAt
cat Cat
fat fat

All
Sorted Word Pairs:
all All
ball ball
call call
hall Hall
*/
