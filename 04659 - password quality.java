import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 패스워드를 입력받고 처리
        while (true) {
            String password = sc.nextLine();
            
            // 'end'가 입력되면 프로그램 종료
            if (password.equals("end")) {
                break;
            }
            
            // 입력받은 패스워드를 평가하는 함수를 호출
            String result = evaluatePassword(password);
            
            // 결과 출력
            System.out.println(result);
        }
    }
    
    // 패스워드의 품질을 평가하는 함수
    public static String evaluatePassword(String password) {
        // 각각의 조건을 확인하기 위한 변수들 초기화
        boolean containsVowel = false;
        boolean consecutiveChar = false;
        boolean threeVowelsOrConsonants = false;
        
        char prevChar = '\0';  // 이전 문자를 저장하는 변수 초기화
        int vowelCount = 0;  // 연속된 모음의 개수를 세는 변수 초기화
        int consonantCount = 0;  // 연속된 자음의 개수를 세는 변수 초기화
        
        // 패스워드를 한 글자씩 확인하며 조건을 검사
        for (char c : password.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                // 현재 문자가 모음인 경우
                containsVowel = true;  // 모음을 포함하고 있음을 표시
                vowelCount++;  // 연속된 모음 개수 증가
                consonantCount = 0;  // 연속된 자음 개수 초기화
            } else {
                // 현재 문자가 자음인 경우
                consonantCount++;  // 연속된 자음 개수 증가
                vowelCount = 0;  // 연속된 모음 개수 초기화
            }
            
            // 현재 문자가 이전 문자와 같고, ee 또는 oo가 아닌 경우
            if (c == prevChar && c != 'e' && c != 'o') {
                consecutiveChar = true;  // 연속된 문자가 있는 경우 표시
            }
            
            // 연속된 모음 또는 자음의 개수가 3 이상인 경우
            if (vowelCount >= 3 || consonantCount >= 3) {
                threeVowelsOrConsonants = true;  // 3개 이상의 연속된 모음 또는 자음이 있는 경우 표시
            }
            
            prevChar = c;  // 현재 문자를 이전 문자로 설정
        }
        
        // 주어진 조건에 따라 패스워드의 품질을 평가하여 결과 반환
        if (containsVowel && !consecutiveChar && !threeVowelsOrConsonants) {
            return ("<" + password + "> is acceptable."); // 만족하는 경우
        } else {
            return ("<" + password + "> is not acceptable."); // 만족하지 않는 경우
        }
    }
    
}
