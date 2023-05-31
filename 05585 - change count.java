import java.util.Scanner;

public class Main {
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int payment = sc.nextInt();  // 입력 받은 지불할 돈
        int result = changeCalculator(payment);
        
        System.out.print(result);
    }
    
    public static int changeCalculator (int payment) {
        int[] coins = {500, 100, 50, 10, 5, 1};  // 잔돈의 종류
        int[] changeCount = new int[coins.length];  // 잔돈의 개수를 저장할 배열

        int remainingChange = 1000 - payment;  // 받을 잔돈

        for (int i = 0; i < coins.length; i++) {
            changeCount[i] = remainingChange / coins[i];  // 해당 잔돈의 개수 계산
            remainingChange %= coins[i];  // 남은 잔돈 업데이트
        }

        int totalChangeCount = 0;  // 받을 잔돈에 포함된 잔돈의 총 개수
        for (int count : changeCount) {
            totalChangeCount += count;
        }
        
        return totalChangeCount;
    }
    
}
