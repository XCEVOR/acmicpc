import java.util.Scanner;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력된 인원 수를 저장
        int N = sc.nextInt();
        sc.nextLine();
        
        // 각 사람의 최대 일의 자리 수 합을 저장할 HashMap
        HashMap<Integer, Integer> maxSums = new HashMap<>();
        
        // 각 사람의 카드에 대해 최대 일의 자리 수 합을 계산하여 HashMap에 저장
        for (int i = 1; i <= N; i++) {
            String[] cards = sc.nextLine().split(" ");
            int maxLastDigitSum = calculateMaxLastDigitSum(cards);
            maxSums.put(i, maxLastDigitSum);
        }
        
        // 최대 일의 자리 수 합을 가진 사람을 찾아 출력
        int winner = findWinner(maxSums);
        System.out.println(winner);
    }
    
    // 각 사람의 카드에 대한 최대 일의 자리 수 합을 계산하는 함수
    public static int calculateMaxLastDigitSum(String[] cards) {
        int maxLastDigitSum = 0;
        
        for (int j = 0; j < 5; j++) {
            for (int k = j + 1; k < 5; k++) {
                for (int l = k + 1; l < 5; l++) {
                    // 각 카드의 합을 계산하고 일의 자리 수를 구함
                    int sum = Integer.parseInt(cards[j]) + Integer.parseInt(cards[k]) + Integer.parseInt(cards[l]);
                    int lastDigitSum = sum % 10;
                    // 최대값 갱신
                    maxLastDigitSum = Math.max(maxLastDigitSum, lastDigitSum);
                }
            }
        }
        
        return maxLastDigitSum;
    }
    
    // HashMap에서 최대값을 가진 사람을 찾는 함수
    public static int findWinner(HashMap<Integer, Integer> maxSums) {
        int maxDigit = -1;
        int winner = -1;
        
        for (HashMap.Entry<Integer, Integer> entry : maxSums.entrySet()) {
            // 최대값을 가진 사람을 찾아 winner 변수에 할당
            if (entry.getValue() > maxDigit || (entry.getValue() == maxDigit && entry.getKey() > winner)) {
                maxDigit = entry.getValue();
                winner = entry.getKey();
            }
        }
        
        return winner;
    }
    
}
