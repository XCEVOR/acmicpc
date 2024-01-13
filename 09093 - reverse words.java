import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 개수 입력
        int T = sc.nextInt();
        sc.nextLine();
        
        // 각 테스트 케이스에 대해 반복
        for (int i = 0; i < T; i++) {
            // 문장 입력
            String sentence = sc.nextLine();
            // 뒤집힌 단어로 이루어진 문장 생성
            String reversedSentence = reverseWordsInSentence(sentence);
            
            // 뒤집힌 문장 출력
            System.out.println(reversedSentence);
        }
    }
    
    // 문장의 단어를 뒤집어서 반환하는 함수
    private static String reverseWordsInSentence(String sentence) {
        // 문장을 공백을 기준으로 단어로 분리
        String[] words = sentence.split(" ");
        // 뒤집힌 단어로 이루어진 문장을 저장할 StringBuilder 생성
        StringBuilder reversedSentence = new StringBuilder();
        
        // 각 단어에 대해 반복
        for (String word : words) {
            // 단어를 뒤집어서 StringBuilder에 추가
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }
        
        // 뒤집힌 문장을 문자열로 반환 (마지막 공백 제거)
        return reversedSentence.toString().trim();
    }
    
    // 단어를 뒤집어서 반환하는 함수
    private static String reverseWord(String word) {
        // 단어를 문자 배열로 변환
        char[] characters = word.toCharArray();
        // 시작과 끝 인덱스 초기화
        int start = 0;
        int end = characters.length - 1;
        
        // 시작 인덱스가 끝 인덱스보다 작은 동안 반복
        while (start < end) {
            // 시작과 끝을 교환
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;
            
            // 인덱스 이동
            start++;
            end--;
        }
        
        // 뒤집힌 단어를 문자열로 반환
        return new String(characters);
    }
    
}
