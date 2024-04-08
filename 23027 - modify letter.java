import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 문자열 입력
        String S = sc.next();
        
        // 수정된 문자열을 저장할 변수 선언 및 초기화
        String modifiedLetter = modifyLetter(S);
        
        // 수정된 문자열 출력
        System.out.println(modifiedLetter);
    }
    
    // 주어진 문자열을 수정하는 함수
    public static String modifyLetter(String S) {
        // 수정된 문자열을 저장하기 위한 StringBuilder 객체 생성
        StringBuilder modifiedLetter = new StringBuilder();
        
        // 'A'가 포함되어 있을 경우
        if (S.contains("A")) {
            // 문자열의 각 문자에 대해 반복
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                if (ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F') {
                    // 조건에 맞는 문자인 경우 'A'로 변경하여 StringBuilder에 추가
                    modifiedLetter.append('A');
                } else {
                    // 조건에 맞지 않는 문자는 그대로 StringBuilder에 추가
                    modifiedLetter.append(ch);
                }
            }
        } 
        // 'B'가 포함되어 있을 경우
        else if (S.contains("B")) {
            // 문자열의 각 문자에 대해 반복
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                if (ch == 'C' || ch == 'D' || ch == 'F') {
                    // 조건에 맞는 문자인 경우 'B'로 변경하여 StringBuilder에 추가
                    modifiedLetter.append('B');
                } else {
                    // 조건에 맞지 않는 문자는 그대로 StringBuilder에 추가
                    modifiedLetter.append(ch);
                }
            }
        } 
        // 'C'가 포함되어 있을 경우
        else if (S.contains("C")) {
            // 문자열의 각 문자에 대해 반복
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                if (ch == 'D' || ch == 'F') {
                    // 조건에 맞는 문자인 경우 'C'로 변경하여 StringBuilder에 추가
                    modifiedLetter.append('C');
                } else {
                    // 조건에 맞지 않는 문자는 그대로 StringBuilder에 추가
                    modifiedLetter.append(ch);
                }
            }
        } 
        // 모든 조건을 만족하지 않을 경우
        else {
            // 문자열의 각 문자를 'A'로 변경하여 StringBuilder에 추가
            for (int i = 0; i < S.length(); i++) {
                modifiedLetter.append('A');
            }
        }
        
        // 수정된 문자열을 문자열로 변환하여 반환
        return modifiedLetter.toString();
    }
}
