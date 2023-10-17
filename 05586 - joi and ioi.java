import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();  // 사용자로부터 문자열 입력
        
        int joiCount = 0;  // "JOI"의 개수를 저장할 변수를 초기화
        int ioiCount = 0;  // "IOI"의 개수를 저장할 변수를 초기화
        
        // 입력 문자열을 순회하며 연속된 3개의 문자를 검사
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.substring(i, i + 3).equals("JOI")) {
                // 현재 위치부터 다음 3개의 문자를 추출하고, "JOI"와 일치하는지 확인
                joiCount++;  // "JOI"와 일치하면 joiCount를 증가
            } else if (input.substring(i, i + 3).equals("IOI")) {
                // 현재 위치부터 다음 3개의 문자를 추출하고, "IOI"와 일치하는지 확인
                ioiCount++;  // "IOI"와 일치하면 ioiCount를 증가
            }
        }
        
        System.out.println(joiCount);  // JOI의 개수를 출력
        System.out.println(ioiCount);  // IOI의 개수를 출력
    }
    
}
