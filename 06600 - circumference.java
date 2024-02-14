import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // CircleCalculator 객체 생성
        CircleCalculator circleCalculator = new CircleCalculator();
        
        // 입력이 더 이상 없을 때까지 반복
        while (sc.hasNext()) {
            // 세 점의 좌표 입력
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            
            // 세 점으로부터 원의 둘레 계산
            double circumference = circleCalculator.calculateCircumference(x1, y1, x2, y2, x3, y3);
            
            // 결과 출력
            System.out.printf("%.2f\n", circumference);
        }
    }
}

// 원의 둘레를 계산하는 클래스
class CircleCalculator {
    // 세 점을 이용하여 원의 둘레를 계산하는 메서드
    public double calculateCircumference(double x1, double y1, double x2, double y2, double x3, double y3) {
        // 세 점 간의 거리 계산
        double d12 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double d13 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double d23 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        
        // 삼각형의 반 둘레 계산
        double s = (d12 + d13 + d23) / 2;
        // 삼각형의 넓이 계산
        double area = Math.sqrt(s * (s - d12) * (s - d13) * (s - d23));
        
        // 외접원의 반지름 계산
        double radius = (d12 * d13 * d23) / (4 * area);
        // 원의 둘레 계산하여 반환
        return 2 * Math.PI * radius;
    }
}
