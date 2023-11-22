import java.util.Scanner;
import java.math.BigInteger;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Long.toBinaryString()은 long 타입의 값을 이진수 문자열로 변환하는 것이기 때문에, 음수가 아닌 경우 64비트까지만 처리
        // 따라서 100,000,000,000,000에 해당하는 값은 64비트를 넘어가기 때문에 오버플로우가 발생할 수 있음
        // 이를 해결하기 위해서는 BigInteger 클래스를 사용하여 더 큰 수를 다룰 수 있도록 구현
        
        // 사용자로부터 BigInteger 형태의 입력값을 받음
        BigInteger N = sc.nextBigInteger();
        
        // BigInteger 클래스의 메서드 중 하나인 toString(2)을 사용
        // BigInteger를 이진수 문자열로 변환
        String binary = N.toString(2);
        
        // 이진수 문자열 출력
        System.out.println(binary);
    }
    
}



/*
100000000000000
10110101111001100010000011110100100000000000000
*/
