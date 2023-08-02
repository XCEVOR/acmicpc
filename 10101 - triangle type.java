import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 삼각형의 세 각을 입력받음
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        
        // 세 각의 합이 180이 아닌 경우 Error 출력
        if (angle1 + angle2 + angle3 != 180) {
            System.out.println("Error");
        } else {
            // 세 각의 크기가 모두 60이면 Equilateral 출력
            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                System.out.println("Equilateral");
            }
            // 두 각이 같은 경우 Isosceles 출력
            else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles");
            }
            // 같은 각이 없는 경우 Scalene 출력
            else {
                System.out.println("Scalene");
            }
        }
    }
    
}
