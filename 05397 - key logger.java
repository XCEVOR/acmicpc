import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수를 입력
        int T = sc.nextInt();
        
        // 각 테스트 케이스에 대해 반복
        for (int t = 0; t < T; t++) {
            // 입력한 순서대로 길이가 L인 문자열을 입력
            String input = sc.next();
            
            // 비밀번호를 추출하는 함수 호출
            String password = getPassword(input);
            
            // 비밀번호 출력
            System.out.println(password);
        }
    }
    
    // 비밀번호 추출 메서드
    private static String getPassword(String input) {
        // 비밀번호를 저장할 연결 리스트
        LinkedList<Character> password = new LinkedList<>();
        // 비밀번호에 대한 커서
        ListIterator<Character> cursor = password.listIterator();
        
        // 입력한 키에 대해 반복
        for (char ch : input.toCharArray()) {
            switch(ch) {
                case '-':
                    // 백스페이스 키가 입력된 경우
                    if (cursor.hasPrevious()) {
                        // 현재 커서 위치의 이전 위치에 요소가 존재하는지 확인
                        // 커서를 이전 위치로 이동
                        cursor.previous();
                        // 현재 위치의 문자 삭제
                        cursor.remove();
                    }
                    break;
                case '<':
                    // 왼쪽 화살표 키가 입력된 경우
                    if (cursor.hasPrevious()) {
                        // 현재 커서 위치의 이전 위치에 요소가 존재하는지 확인
                        // 커서를 이전 위치로 이동
                        cursor.previous();
                    }
                    break;
                case '>':
                    // 오른쪽 화살표 키가 입력된 경우
                    if (cursor.hasNext()) {
                        // 현재 커서 위치의 다음 위치에 요소가 존재하는지 확인
                        // 커서를 다음 위치로 이동
                        cursor.next();
                    }
                    break;
                default:
                    // 알파벳, 숫자 등의 문자가 입력된 경우
                    // 현재 커서 위치에 문자 추가
                    cursor.add(ch);
                    break;
            }
        }
        
        // 연결 리스트에 저장된 비밀번호를 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (char ch : password) {
            sb.append(ch);
        }
        
        // 비밀번호 문자열 반환
        return sb.toString();
    }
    
}
