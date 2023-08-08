import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 10진법 수 N
        int B = sc.nextInt(); // 목표 진법 B

        String result = convertToBaseN(N, B);
        
        System.out.println(result);
    }

    // 10진법 수를 B진법으로 변환하는 함수
    public static String convertToBaseN(int num, int base) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int remainder = num % base;
            char digit;

            if (remainder < 10) {
                digit = (char) ('0' + remainder);
            } else {
                digit = (char) ('A' + remainder - 10);
            }

            sb.insert(0, digit); // 앞에 삽입하여 순서를 뒤집음
            num /= base;
        }

        return sb.toString();
    }
    
}
