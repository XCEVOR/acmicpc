import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sideLength = sc.nextInt();  // 변의 길이 입력
        
        // 정삼각형의 넓이를 계산
        double area = 0.5 * sideLength * (sideLength * Math.sqrt(3) / 2);  // 1/2 * 밑변 * 높이
        
        System.out.println(area);
    }
}
