import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();  // 현재 주파수 A
        int B = sc.nextInt();  // 듣고 싶은 주파수 B
        int N = sc.nextInt();  // 즐겨찾기 주파수의 개수
        
        // 즐겨찾기 주파수들을 저장하는 Set 생성
        Set<Integer> favorites = new HashSet<>();
        for (int i = 0; i < N; i++) {
            favorites.add(sc.nextInt());
        }
        
        // 최소 버튼 누르는 수 계산
        int minButtonPresses = calculateMinButtonPresses(A, B, favorites);
        
        // 결과 출력
        System.out.println(minButtonPresses);
    }
    
    // 주어진 A에서 B로 이동하는 데 필요한 최소 버튼 수 계산하는 메서드
    private static int calculateMinButtonPresses(int A, int B, Set<Integer> favorites) {
        int minButtonPresses = Math.abs(B - A);  // 기본적으로 증가 또는 감소 버튼만 누르는 경우
        
        // 즐겨찾기 주파수들을 순회하며 최소 버튼 누르는 수 갱신
        for (int favorite : favorites) {
            int pressesToFavorite = 1;  // 즐겨찾기 주파수로 이동하는 데 필요한 버튼 수
            pressesToFavorite += Math.abs(B - favorite);  // 즐겨찾기 주파수에서 목표 주파수로 이동하는 데 필요한 버튼 수
            minButtonPresses = Math.min(minButtonPresses, pressesToFavorite);  // 최소값 갱신
        }
        
        return minButtonPresses;
    }
}
