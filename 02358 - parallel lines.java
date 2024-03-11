import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 점의 개수
        
        // x, y 좌표 개수를 저장하는 해시맵
        HashMap<Integer, Integer> xCount = new HashMap<>();
        HashMap<Integer, Integer> yCount = new HashMap<>();
        
        // 각 점의 좌표를 입력 받아서 해시맵에 저장
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();  // x 좌표
            int y = sc.nextInt();  // y 좌표
            
            // x 좌표 개수를 저장하는 해시맵 갱신
            xCount.put(x, xCount.getOrDefault(x, 0) + 1);
            // y 좌표 개수를 저장하는 해시맵 갱신
            yCount.put(y, yCount.getOrDefault(y, 0) + 1);
        }
        
        // 평행한 직선의 개수를 저장하는 변수
        int parallelLines = 0;
        
        // x 좌표 개수를 검사하여 평행한 직선의 개수 갱신
        for (int count : xCount.values()) {
            // x 좌표의 중복이 있다면 평행한 직선 개수 증가
            parallelLines += count > 1 ? 1 : 0;
        }
        // y 좌표 개수를 검사하여 평행한 직선의 개수 갱신
        for (int count : yCount.values()) {
            // y 좌표의 중복이 있다면 평행한 직선 개수 증가
            parallelLines += count > 1 ? 1 : 0;
        }
        
        // 평행한 직선의 개수 출력
        System.out.println(parallelLines);
    }
}
