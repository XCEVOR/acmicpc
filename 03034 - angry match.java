import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 성냥 개수
        int W = sc.nextInt(); // 박스 가로 길이
        int H = sc.nextInt(); // 박스 세로 길이
        
        // 박스의 대각선 길이 계산
        double diagonal = calculateDiagonal(W, H);
        
        // 각 성냥에 대해 처리
        for (int i = 0; i < N; i++) {
            int matchLength = sc.nextInt(); // 성냥의 길이
            
            // 성냥이 박스에 들어갈 수 있는지 여부 출력
            printResult(matchLength, diagonal);
        }
    }
    
    // 박스의 대각선 길이를 계산하는 함수
    private static double calculateDiagonal(int width, int height) {
        return Math.sqrt(width * width + height * height);
    }
    
    // 성냥이 박스에 들어갈 수 있는지 여부를 출력하는 함수
    private static void printResult(int matchLength, double diagonal) {
        if (matchLength <= diagonal) {
            // 성냥이 박스에 들어갈 수 있는 경우
            System.out.println("DA");
        } else {
            // 성냥이 박스에 들어갈 수 없는 경우
            System.out.println("NE");
        }
    }
}
