import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 개의 자연수 입력받기
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 최대 공약수 구하기
        int gcdResult = greatestCommonDivisor(num1, num2);

        // 최소 공배수 구하기
        int lcmResult = leastCommonMultiple(num1, num2);

        // 결과 출력
        System.out.println(gcdResult);
        System.out.println(lcmResult);
    }
    
    // 최대 공약수를 구하는 메서드
    private static int greatestCommonDivisor(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return greatestCommonDivisor(num2, num1 % num2);
        }
    }

    // 최소 공배수를 구하는 메서드
    private static int leastCommonMultiple(int num1, int num2) {
        return (num1 * num2) / greatestCommonDivisor(num1, num2);
    }

}
