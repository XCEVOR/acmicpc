import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 문장의 수 입력
        sc.nextLine();  // 개행 문자 소비
        
        // YodaTranslator 객체 생성
        YodaTranslator translator = new YodaTranslator();
        
        // 입력된 문장의 수만큼 반복
        for (int i = 0; i < N; i++) {
            String sentence = sc.nextLine();  // 문장 입력
            
            // 요다의 말로 번역
            String yodaSentence = translator.translateToYoda(sentence);
            
            // 요다의 말 출력
            System.out.println(yodaSentence);
        }
    }
}

// 요다 번역기 클래스
class YodaTranslator {
    // 요다의 말로 번역하는 메서드
    public String translateToYoda(String sentence) {
        // 공백을 기준으로 문장을 단어로 분리
        String[] words = sentence.split(" ");
        
        // 요다의 말을 저장할 StringBuilder 객체 생성
        StringBuilder yodaTalk = new StringBuilder();
        
        // 두 번째 단어부터 마지막 이전 단어까지 요다의 말에 추가
        for (int j = 2; j < words.length; j++) {
            // 단어와 공백 추가
            yodaTalk.append(words[j]).append(" ");
        }
        // 첫 번째와 두 번째 단어를 요다의 말에 추가
        yodaTalk.append(words[0]).append(" ").append(words[1]);
        
        // 문자열로 변환하고 앞뒤 공백 제거 후 반환
        return yodaTalk.toString().trim();
    }
}
