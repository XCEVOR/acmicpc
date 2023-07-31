import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] sticks = new int[3];
        
        // 막대의 길이 입력
        for (int i = 0; i < 3; i++) {
            sticks[i] = sc.nextInt();
        }
        
        // 막대의 길이를 오름차순으로 정렬
        Arrays.sort(sticks);
        
        // 세 변 중 짧은 두 변의 길이의 합이 마지막 변의 길이보다 큰지 확인
        if (sticks[0] + sticks[1] > sticks[2]) {
            // 성립되면 삼각형이므로 세 변의 길이를 모두 더한 값을 출력
            System.out.println(sticks[0] + sticks[1] + sticks[2]);
        } else {
            // 삼각형이 성립되지 않으면 작은 두 변의 길이 합에 -1을 하여 나머지 변으로 지정
            System.out.println((sticks[0] + sticks[1]) * 2 - 1);
        }
    }
    
}
