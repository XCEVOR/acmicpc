import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 N 값을 입력
        long N = sc.nextLong();
        
        // Honeycomb 클래스의 calculateSteps 메서드를 호출하여 최소 지나가는 방의 개수를 계산
        long steps = Honeycomb.calculateSteps(N);
        
        // 계산된 최소 지나가는 방의 개수를 출력
        System.out.println(steps);
    }
}

// Honeycomb 클래스
class Honeycomb {
    // calculateSteps 메서드
    public static long calculateSteps(long N) {
        // 지나가는 방의 개수를 1로 초기화
        long count = 1;
        // 방 번호를 1로 초기화
        long roomNumber = 1;
        
        // N보다 작은 동안 반복
        while (roomNumber < N) {
            // 방 번호를 6의 배수로 증가시킴 (벌집 구조 상 각 층은 6의 배수만큼 방을 가지므로)
            roomNumber += 6 * count;
            // 방의 개수를 1 증가시킴
            count++;
        }
        
        // 최종적으로 계산된 방의 개수를 반환
        return count;
    }
}
