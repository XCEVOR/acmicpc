import java.util.Scanner;

public class Main {
    
    static class Point {
        long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            points[i] = new Point(x, y);
        }

        double area = calculatePolygonArea(points);
        
        System.out.printf("%.1f", area);
    }

    private static double calculatePolygonArea(Point[] points) {
        int n = points.length;
        long area = 0;

        for (int i = 0; i < n; i++) {
            long x1 = points[i].x;
            long y1 = points[i].y;
            long x2 = points[(i + 1) % n].x;
            long y2 = points[(i + 1) % n].y;

            area += (x1 * y2) - (x2 * y1);
        }

        return Math.abs(area) / 2.0;
    }
    
}
