import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스 개수 입력
        
        // 각 테스트 케이스에 대해 반복
        for (int i = 1; i <= T; i++) {
            int[] sides = new int[3]; // 세 변을 저장할 배열
            
            // 세 변의 길이 입력
            for (int j = 0; j < 3; j++) {
                sides[j] = sc.nextInt();
            }
            
            // 세 변을 오름차순으로 정렬
            Arrays.sort(sides);
            
            // 케이스 번호 출력
            System.out.print("Case #" + i + ": ");
            
            // 삼각형이 유효한지 확인하고 분류하여 출력
            if (isValidTriangle(sides)) {
                classifyTriangle(sides);
            } else {
                System.out.println("invalid!");
            }
        }
    }
    
    // 삼각형이 유효한지 확인하는 메서드
    private static boolean isValidTriangle(int[] sides) {
        return sides[0] + sides[1] > sides[2];
    }
    
    // 삼각형을 분류하여 출력하는 메서드
    private static void classifyTriangle(int[] sides) {
        if (sides[0] == sides[1] && sides[1] == sides[2]) {
            // 정삼각형인 경우
            System.out.println("equilateral");
        } else if (sides[0] == sides[1] || sides[1] == sides[2]) {
            // 이등변삼각형인 경우
            System.out.println("isosceles");
        } else { 
            // 부등변삼각형인 경우
            System.out.println("scalene");
        }
    }
    
}
