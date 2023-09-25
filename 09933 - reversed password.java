import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 단어의 수 입력
        int N = sc.nextInt();
        
        // 단어를 저장할 ArrayList 생성
        ArrayList<String> words = new ArrayList<>();
        
        // 단어 입력
        for (int i = 0; i < N; i++) {
            String word = sc.next();
            words.add(word);  // ArrayList에 추가
        }
        
        // 비밀번호 찾기 함수 호출
        String result = findPassword(words);
        
        // 결과 출력
        System.out.println(result);
    }
    
    // 비밀번호를 찾는 함수
    public static String findPassword(ArrayList<String> words) {
        int length = 0;  // 비밀번호의 길이
        char middleChar = ' ';  // 비밀번호의 가운데 글자
        
        // 각 단어에 대해 검사
        for (String password : words) {
            StringBuilder reversed = new StringBuilder(password).reverse();  // 단어를 뒤집음
            if (words.contains(reversed.toString())) {  // 뒤집은 단어가 목록에 있는지 확인
                length = password.length();  // 길이 저장
                middleChar = password.charAt(length / 2);  // 가운데 글자 저장
                break;  // 비밀번호를 찾았으므로 루프 종료
            }
        }
        
        // 결과 문자열 반환
        return length + " " + middleChar;
    }
}
