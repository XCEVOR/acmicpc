import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        String strA = sc.next();
        String strB = sc.next();
        
        // 새로운 곱셈 방법을 사용하여 결과 계산
        long result = Multiplication.multiplyByNewMethod(strA, strB);
        
        // 결과 출력
        System.out.println(result);
    }
    
}

class Multiplication {
    public static long multiplyByNewMethod(String strA, String strB) {
        int lenA = strA.length();
        int lenB = strB.length();
        
        long result = 0;
        
        // A의 각 자리수와 B의 각 자리수를 곱하여 결과에 더하기
        for (int i = 0; i < lenA; i++) {
            for (int j = 0; j < lenB; j++) {
                // A와 B의 현재 자리의 숫자를 얻기
                int digitA = Character.getNumericValue(strA.charAt(i));
                int digitB = Character.getNumericValue(strB.charAt(j));
                
                // 현재 자리의 숫자끼리 곱하여 결과에 더하기
                result += (long) digitA * digitB;
            }
        }
        
        return result;
    }
}

