import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력으로부터 S와 K를 받음
        long S = sc.nextLong();
        int K = sc.nextInt();
        
        // S를 K개의 양의 정수로 균등하게 분배하여 몫과 나머지를 계산
        long quotient = S / K;
        long remainder = S % K;
        
        // K개의 수를 저장할 배열 생성
        long[] result = new long[K];
        
        // 각각의 수를 계산하여 배열에 저장
        for (int i = 0; i < K; i++) {
            // 나머지가 있는 경우, 앞의 몇 개의 수에 몫 + 1을 할당하고, 나머지는 몫을 할당
            result[i] = i < remainder ? quotient + 1 : quotient;
        }
        
        // K개의 수의 곱 계산
        long maxProduct = 1;
        for (int i = 0; i < K; i++) {
            maxProduct *= result[i];
        }
        
        // 최대 곱 출력
        System.out.println(maxProduct);
    }
}
