import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 숫자 입력 받기
        int n = sc.nextInt();
        
        // 패턴 출력
        for (int i = 1; i <= n; i++) {
            // 왼쪽 공백 출력 (i에 따라 줄어듦)
            String leftSpace = " ".repeat(n - i);
            System.out.print(leftSpace);  // 왼쪽 공백 출력하고 대기
            
            // 별표 출력
            String stars = "*";
            if (i > 1) {
                // 중간 공백과 오른쪽 별표 출력
                stars += " ".repeat(2 * i - 3);
                stars += "*";
            }
            
            // 한 줄 출력
            System.out.println(stars);  // 오른쪽 별, 공백, 별 출력하고 줄바꿈
        }
        
        // Scanner 객체 닫기
        sc.close();
    }
}
