import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 사용자로부터 N 값을 입력
    int N = sc.nextInt();
    
    // 초성 배열 (19개)
    String[] initialConsonants = {
      "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", 
      "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"
    };
    
    // 중성 배열 (21개)
    String[] medialVowels = {
      "ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", 
      "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"
    };
    
    // 종성 배열 (28개)
    String[] finalConsonants = {
      "", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", 
      "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ", "ㅄ", 
      "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"
    };
    
    // N을 1 감소시켜 0 기반 인덱스로 변환
    N -= 1;
    
    // 초성, 중성, 종성의 인덱스를 계산
    int initialIndex = N / (21 * 28); // 초성의 인덱스
    int medialIndex = (N % (21 * 28)) / 28; // 중성의 인덱스
    int finalIndex = N % 28; // 종성의 인덱스
    
    // 유니코드 값을 계산하여 한글 글자를 생성
    char hangulChar = (char) (0xAC00 + (initialIndex * 588) + (medialIndex * 28) + finalIndex);
    
    // 생성된 한글 글자를 출력
    System.out.println(hangulChar);
  }
}
