import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prev = Integer.MIN_VALUE; // 이전 숫자를 저장할 변수

        while (sc.hasNext()) { // 입력이 계속되는 동안 반복
            int current = sc.nextInt(); // 다음 숫자 입력 받기
            
            if (current < prev) { // 현재 숫자가 이전 숫자보다 작으면
                System.out.println("Bad"); // 비내림차순이 아니므로 "Bad" 출력
                return; // 프로그램 종료
            }
            
            prev = current; // 현재 숫자를 이전 숫자로 업데이트
        }
        
        // 모든 숫자가 비내림차순인 경우
        System.out.println("Good"); // "Good" 출력
    }
}
