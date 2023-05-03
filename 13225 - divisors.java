import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            
            int count = 1;  // n 이 자기 자신을 약수로 가질 경우를 초기로 넣고 시작.
            for (int j = 1; j <= n / 2; j++) {
                if (n % j == 0) {
                    count += 1;
                }
            }
            
            System.out.println(n + " " + count);
        }

    }
}
