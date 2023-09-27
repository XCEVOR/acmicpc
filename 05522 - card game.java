import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 입력을 받기 위한 준비
        Scanner sc = new Scanner(System.in);
        
        // 정수들의 총 합을 저장할 변수를 초기화
        int totalSum = 0;
        
        // 5번의 반복을 통해 사용자로부터 정수를 입력받고 총 합을 계산
        for (int i = 0; i < 5; i++) {
            totalSum += sc.nextInt(); // 사용자로부터 정수 입력 받음
        }
        
        // 총 합을 출력
        System.out.println(totalSum);
    }
    
}
