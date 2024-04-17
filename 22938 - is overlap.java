import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫번째 과녁의 정보 입력
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        
        // 두번째 과녁의 정보 입력
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();
        
        // 두 과녁이 겹치는지 확인하는 함수 호출
        boolean result = isOverlap(x1, y1, r1, x2, y2, r2);
        
        // 결과 출력
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    // 두 과녁이 겹치는지 확인하는 함수
    private static boolean isOverlap(int x1, int y1, int r1, int x2, int y2, int r2) {
        // 두 과녁 중심 사이의 거리 계산
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        // 두 과녁이 겹치는지 여부 반환
        return distance < r1 + r2;
    }
}
