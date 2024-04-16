import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 세 점의 좌표를 입력
        int xA = sc.nextInt();
        int yA = sc.nextInt();
        int xB = sc.nextInt();
        int yB = sc.nextInt();
        int xC = sc.nextInt();
        int yC = sc.nextInt();
        
        // 세 점으로 만들 수 있는 평행사변형의 가장 큰 둘레와 가장 작은 둘레의 차이를 계산
        double difference = findPerimeterDifference(xA, yA, xB, yB, xC, yC);
        
        // 결과 출력
        System.out.println(difference);
    }
    
    // 가장 큰 둘레와 가장 작은 둘레의 차이를 계산하는 함수
    private static double findPerimeterDifference(int xA, int yA, int xB, int yB, int xC, int yC) {
        // 세 점이 한 직선 위에 있는지 확인
        if (isCollinear(xA, yA, xB, yB, xC, yC)) {
            // 세 점이 한 직선 위에 있으면 평행사변형을 만들 수 없으므로 -1 반환
            return -1;
        }
        
        // 세 점으로 만들 수 있는 선분의 길이 계산
        double AB = distance(xA, yA, xB, yB);
        double AC = distance(xA, yA, xC, yC);
        double BC = distance(xB, yB, xC, yC);
        
        // 가능한 모든 조합을 이용하여 평행사변형의 둘레 계산
        double maxPerimeter = Math.max( 2 * (AB + AC), Math.max(2 * (AB + BC), 2 * (AC + BC)) );
        double minPerimeter = Math.min( 2 * (AB + AC), Math.min(2 * (AB + BC), 2 * (AC + BC)) );
        
        // 가장 큰 둘레와 가장 작은 둘레의 차이 반환
        return maxPerimeter - minPerimeter;
    }
    
    // 세 점이 한 직선 위에 있는지 확인하는 함수
    private static boolean isCollinear(int xA, int yA, int xB, int yB, int xC, int yC) {
        // 세 점이 한 직선 위에 있으면 평행사변형을 만들 수 없음
        // 두 점 A와 B를 지나는 직선의 기울기는 (yB - yA) / (xB - xA)
        // 두 점 A와 C를 지나는 직선의 기울기는 (yC - yA) / (xC - xA)
        // (yB - yA) / (xB - xA) == (yC - yA) / (xC - xA)
        return (xB - xA) * (yC - yA) == (xC - xA) * (yB - yA);
    }
    
    // 두 점 사이의 거리를 계산하는 함수
    private static double distance(int x1, int y1, int x2, int y2) {
        // 피타고라스의 정리를 이용하여 거리 계산
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
