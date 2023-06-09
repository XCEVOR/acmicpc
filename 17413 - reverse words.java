import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();  // 입력 문자열
        
        String result = reverseWords(S);  // 주어진 규칙에 의해 문자 뒤집기
        
        System.out.println(result);  // 결과 출력
    }
    
    public static String reverseWords(String S) {
        // StringBuilder 로 문자를 누적 저장
        StringBuilder storedString = new StringBuilder();  // 결과 반환을 위한 문자열
        StringBuilder word = new StringBuilder();  // 뒤집기 위해 저장된 단어
        
        boolean inTag = false;  // < > 로 감싸진 상태 태그로 판별

        // 주어진 문자열에서 하나씩 확인
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);  // 문자 임시 저장
            
            // 입력된 문자 또는 inTag 에 따른 분류
            if (c == '<') {
                storedString.append(word.reverse());  // 태그 시작으로 지금까지 저장된 단어 뒤집어 저장
                word.setLength(0);  // 저장된 단어 초기화
                storedString.append(c);  // '<' 저장
                inTag = true;  // 태그 시작 표시
            } else if (c == '>') {
                storedString.append(c);  // '>' 저장
                inTag = false;  // 태그 끝 표시
            } else if (inTag) {
                storedString.append(c);  // 태그 안에 포함된 문자 그대로 저장
            } else if (c == ' ') {
                storedString.append(word.reverse());  // 빈칸으로 단어가 나뉘는 순간 지금까지 저장된 단어 뒤집어 저장
                storedString.append(c);  // ' ' 빈칸 저장
                word.setLength(0);  // 저장된 단어 초기화
            } else {
                word.append(c);  // 위의 경우를 모두 만족하지 않은 상태로 뒤집힐 예약 단어 저장
            }
        }
        
        storedString.append(word.reverse());  // 마지막에 뒤집을 단어가 있을경우 저장
        
        return storedString.toString();
    }
    
}
