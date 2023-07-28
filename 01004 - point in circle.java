import java.util.Scanner;

class Point {
    int x;
    int y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point center;
    int radius;
    
    Circle(int cx, int cy, int r) {
        this.center = new Point(cx, cy);
        this.radius = r;
    }
    
    // 점이 원 안에 있는지 확인하는 함수
    boolean containsPoint(Point p) {
        double distance = Math.sqrt(Math.pow(p.x - center.x, 2) + Math.pow(p.y - center.y, 2));
        return distance <= radius;
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스의 개수
        
        for (int t = 0; t < T; t++) {
            // 점 좌표 입력 받기
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            // 원의 개수 입력 받기
            int n = sc.nextInt();
            
            // 원 정보를 저장하는 배열
            Circle[] circles = new Circle[n];
            
            for (int i = 0; i < n; i++) {
                // 원의 중점과 반지름 입력 받기
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int r = sc.nextInt();
                circles[i] = new Circle(cx, cy, r);
            }
            
            int result = countPointsInCircles(new Point(x1, y1), new Point(x2, y2), circles);
          
            System.out.println(result);
        }
    }
    
    // 원 안에 점이 위치하는 개수 계산 함수
    private static int countPointsInCircles(Point p1, Point p2, Circle[] circles) {
        int count = 0;
        
        for (Circle circle : circles) {
            boolean p1Inside = circle.containsPoint(p1);
            boolean p2Inside = circle.containsPoint(p2);
            
            if (p1Inside && !p2Inside) {
                count++;
            } else if (!p1Inside && p2Inside) {
                count++;
            }
        }
        
        return count;
    }
    
}
