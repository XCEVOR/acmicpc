import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int inputWeight = sc.nextInt();
        int result = findMinimumBags(inputWeight);
        
        System.out.println(result);
    }
    
    public static int findMinimumBags(int inputWeight) {
        
        int max5kg = inputWeight / 5;  // 주어진 무게를 5kg로 나눈 몫.

        // 5kg로 나눈 몫부터 0까지 반복하면서
        // 남은 무게를 3kg로 나눠서 나머지가 0인지 확인.
        while (max5kg >= 0) {
            int remainingWeight = inputWeight - max5kg * 5;
            if (remainingWeight % 3 == 0) {
                // 3kg로 나눠서 나머지가 0이면 최소 개수를 return.
                return max5kg + remainingWeight / 3;
            }
            max5kg -= 1;
        }

        // 주어진 무게를 만들 수 없는 경우 -1을 return.
        return -1;
    }
    
}
