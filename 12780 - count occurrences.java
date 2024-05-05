import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 단서 문자열 H와 등장 횟수를 알고 싶은 문자열 N을 입력
        String H = sc.next();
        String N = sc.next();
        
        // countOccurrences 메서드를 사용하여 N이 H에서 몇 번 등장하는지 계산
        int count = countOccurrences(H, N);
        
        // 결과를 출력
        System.out.println(count);
    }
    
    // 문자열 text에서 부분 문자열 pattern의 등장 횟수를 계산하는 메서드
    private static int countOccurrences(String text, String pattern) {
        // 등장 횟수를 저장할 변수를 초기화
        int count = 0;
        // 문자열에서 검색을 시작할 인덱스를 초기화
        int index = 0;
        
        // text에서 pattern을 찾을 때마다 등장 횟수를 증가
        // indexOf 메서드를 사용하여 pattern의 첫 번째 등장 위치를 찾음
        while ((index = text.indexOf(pattern, index)) != -1) {
            count++; // 등장 횟수를 증가시킵니다.
            index += pattern.length(); // 다음 검색을 시작할 위치를 설정
        }
        
        return count; // 등장 횟수를 반환
    }
}
