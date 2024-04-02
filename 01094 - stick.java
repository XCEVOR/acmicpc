import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // X를 입력
        int X = sc.nextInt();
        
        // countBars 함수를 호출하여 막대의 개수 찾음
        int count = countBars(X);
        
        // 필요한 막대의 개수를 출력
        System.out.println(count);
    }
    
    // 막대의 개수를 구하는 메서드
    private static int countBars(int X) {
        // 필요한 막대의 개수를 저장할 변수를 초기화
        int count = 0;
        
        // X가 0보다 클 때까지 반복
        while (X > 0) {
            // X에 가장 가까운 2의 거듭제곱 값을 찾아서 smallestBar에 저장
            int smallestBar = Integer.highestOneBit(X);
            // 찾은 막대를 사용하여 X에서 그 값을 빼고, 필요한 막대의 개수를 증가
            X -= smallestBar;
            count++;
        }
        
        // 필요한 막대의 총 개수를 반환
        return count;
    }
}
