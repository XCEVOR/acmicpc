import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    // 점을 표현하는 Point 클래스
    static class Point {
        int x, y;
        
        // Point 클래스 constructor
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 점의 개수를 입력 받음
        int n = sc.nextInt();
        // 다각형을 구성하는 점들을 저장할 ArrayList
        ArrayList<Point> polygon = new ArrayList<>();
        
        // 점의 개수만큼 반복하며 x, y 좌표를 입력 받아 ArrayList에 추가
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            polygon.add(new Point(x, y));
        }
        
        // 입력된 다각형의 좌표 출력
        // System.out.println("Input Polygon");  // TEST PRINT
        // printPolygon(polygon);  // TEST PRINT
        
        // 가능한 최대 삼각형의 넓이 계산
        double result = getMaxTriangleArea(polygon);
        // System.out.println("\nMaximum Area of a Triangle: " + result);  // TEST PRINT
        System.out.println(result);
    }
    
    // 가능한 최대 삼각형의 넓이를 계산하는 메서드
    static double getMaxTriangleArea(ArrayList<Point> polygon) {
        int n = polygon.size();
        double maxArea = 0;
        
        // 3개의 점을 선택하여 가능한 모든 삼각형의 넓이를 계산하고 최댓값을 찾음
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = triangleArea(polygon.get(i), polygon.get(j), polygon.get(k));
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        
        return maxArea;
    }
    
    // 삼각형의 넓이를 계산하는 메서드
    static double triangleArea(Point A, Point B, Point C) {
        // 주어진 세 점 A(x1, y1), B(x2, y2), C(x3, y3)를 사용하여 삼각형의 넓이를 구하는 공식
        return Math.abs((A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0);
    }
    
    // 입력된 polygon을 출력하는 메서드
    static void printPolygon(ArrayList<Point> polygon) {
        for (Point point : polygon) {
            System.out.println(point.x + " " + point.y);
        }
    }
    
}
