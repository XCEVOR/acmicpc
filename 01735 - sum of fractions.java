import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 두 분수의 분자와 분모를 입력
        int a1 = sc.nextInt();  // 첫 번째 분수의 분자
        int b1 = sc.nextInt();  // 첫 번째 분수의 분모
        int a2 = sc.nextInt();  // 두 번째 분수의 분자
        int b2 = sc.nextInt();  // 두 번째 분수의 분모
        
        // 분수의 합
        int numerator = a1 * b2 + a2 * b1;  // 분자의 합
        int denominator = b1 * b2;  // 분모의 합
        
        // 합을 기약분수의 형태로 변환
        int gcd = findGCD(numerator, denominator);  // 분자와 분모의 최대공약수
        numerator /= gcd;  // 분자를 최대공약수로 나눔
        denominator /= gcd;  // 분모를 최대공약수로 나눔
        
        // 결과 출력
        System.out.println(numerator + " " + denominator);
    }
    
    // 최대공약수를 구하는 재귀 함수
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;  // 분모가 0이면 분자가 최대공약수
        }
        // 유클리드 호제법을 사용하여 최대공약수를 재귀적으로 구함
        return findGCD(b, a % b);
    }
    
}
