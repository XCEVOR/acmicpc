import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
      
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // '* ' 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            // 줄 바꿈
            System.out.println();
        }
    }
    
}
