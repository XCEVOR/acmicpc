import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 숫자 입력 받기
        int n = sc.nextInt();
        
        // 패턴 출력
        for (int i = 1; i <= n; i++) {
            // n개 만큼 별을 한 줄 출력
            System.out.println("*".repeat(n));
        }
        
        // Scanner 객체 닫기
        sc.close();
    }
}
