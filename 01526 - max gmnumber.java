import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력값 N
        int N = sc.nextInt();
        
        // N부터 시작해서 가장 큰 금민수를 찾을 때까지 반복
        while (true) {
            // isGMNumber 함수를 사용하여 금민수인지 확인
            if (isGMNumber(N)) {
                // 찾은 금민수를 출력하고 반복문을 종료
                System.out.println(N);
                break;
            }
            // N을 감소시켜 다음 수를 확인
            N--;
        }
    }
    
    // 주어진 수가 금민수인지 확인하는 함수
    public static boolean isGMNumber(int num) {
        // 주어진 수를 자릿수별로 확인
        while (num > 0) {
            int digit = num % 10;
            // 자릿수가 4 또는 7이 아니면 금민수가 아님
            if (digit != 4 && digit != 7) {
                return false;
            }
            // 다음 자릿수를 확인하기 위해 나누기 연산을 수행
            num /= 10;
        }
        // 모든 자릿수가 4 또는 7이면 금민수
        return true;
    }
    
}
