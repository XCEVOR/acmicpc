import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 숫자 입력
        String N = sc.nextLine();
        
        // divider를 지정
        int divider = 20000303;
        
        // 입력된 숫자를 나눈 나머지를 계산
        int result = calculateRemainder(N, divider);
        
        // 결과를 출력
        System.out.println(result);
    }
    
    // 입력된 숫자를 나눈 나머지를 계산하는 메서드
    private static int calculateRemainder(String N, int divider) {
        // 결과를 저장할 변수 초기화
        int result = 0;
        
        // 입력된 숫자의 각 자리를 순회하며 나머지를 계산
        for (int i = 0; i < N.length(); i++) {
            // 현재 결과에 10을 곱하고 입력된 숫자의 현재 자리를 더한 후, 나눌 수로 나머지를 계산하여 업데이트
            result = (result * 10 + (N.charAt(i) - '0')) % divider;
        }
        
        return result;
    }
}
