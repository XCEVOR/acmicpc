import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 거스름돈 금액 입력 받기
        int n = sc.nextInt();
        
        // 최소 동전 개수 구하기
        int result = getMinCoins(n);
        
        // 최소 동전 개수 출력
        System.out.println(result);
    }
    
    // 최소 동전 개수를 계산하는 함수
    public static int getMinCoins(int n) {
        int count = 0;
        
        // 거스름돈이 0보다 큰 동안 반복
        while (n > 0) {
            if (n % 5 == 0) { // 5원짜리 동전으로 나눌 수 있는 경우
                count += n / 5; // 5원짜리 동전의 개수 추가
                n = 0; // 거스름돈을 모두 주었으므로 반복문 종료
            } else { // 5원짜리 동전으로 나눌 수 없는 경우
                count++; // 2원짜리 동전 하나 사용
                n -= 2; // 2원씩 거스름돈을 감소
                if (n < 0) { // 거스름돈을 주지 못하는 경우
                    count = -1; // -1 반환
                    break; // 반복문 종료
                }
            }
        }
        
        return count; // 최소 동전 개수 반환
    }
}
