import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력으로부터 A진법, B진법, 자릿수의 개수를 받음
        int A = sc.nextInt();
        int B = sc.nextInt();
        int m = sc.nextInt();
        
        // A진법으로 표현된 숫자를 10진법으로 변환
        int decimal = convertToDecimal(sc, A, m);
        // 10진법 숫자를 B진법으로 변환
        ArrayList<Integer> converted = convertToBaseB(decimal, B);
        
        // 변환된 결과를 출력
        printConvertedResult(converted);
    }
    
    // A진법으로 표현된 숫자를 10진법으로 변환하는 메서드
    private static int convertToDecimal(Scanner sc, int A, int m) {
        int decimal = 0;
        for (int i = 0; i < m; i++) {
            int digit = sc.nextInt();
            decimal = decimal * A + digit;
        }
        return decimal;
    }
    
    // 10진법 숫자를 B진법으로 변환하는 메서드
    private static ArrayList<Integer> convertToBaseB(int decimal, int B) {
        ArrayList<Integer> converted = new ArrayList<>();
        while (decimal > 0) {
            int remainder = decimal % B;
            converted.add(remainder);
            decimal /= B;
        }
        return converted;
    }
    
    // 변환된 결과를 출력하는 메서드
    private static void printConvertedResult(ArrayList<Integer> converted) {
        for (int i = converted.size() - 1; i >= 0; i--) {
            System.out.print(converted.get(i) + " ");
        }
    }
}
