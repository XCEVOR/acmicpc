import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        String[] input = sc.next().split(":");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        // 최대공약수 계산
        int gcdResult = gcd(n, m);
        
        // 약분하여 출력
        System.out.println(n / gcdResult + ":" + m / gcdResult);
    }
    
    // 최대공약수를 구하는 메서드
    public static int gcd(int n, int m) {
        // 유클리드 호제법을 사용하여 최대공약수 계산
        while (m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }
}
