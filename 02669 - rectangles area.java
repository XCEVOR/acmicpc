import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // 101x101 크기의 2차원 배열, 좌표는 1부터 시작
        int[][] grid = new int[101][101];
        
        // 직사각형 좌표 입력 함수 호출
        inputRectangles(grid);
        
        // 면적 계산 함수 호출
        int area = calculateArea(grid);
        
        // 면적 출력
        System.out.print(area);
    }
    
    // 직사각형 좌표를 입력받아 해당 부분을 1로 표시하는 함수
    private static void inputRectangles(int[][] grid) {
        Scanner sc = new Scanner(System.in);
        
        // 네 개의 직사각형에 대해 반복
        for (int i = 0; i < 4; i++) {
            int x1 = sc.nextInt();  // 왼쪽 아래 꼭짓점 x 좌표 입력
            int y1 = sc.nextInt();  // 왼쪽 아래 꼭짓점 y 좌표 입력
            int x2 = sc.nextInt();  // 오른쪽 위 꼭짓점 x 좌표 입력
            int y2 = sc.nextInt();  // 오른쪽 위 꼭짓점 y 좌표 입력
            
            // 직사각형이 차지하는 부분을 1로 표시
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    grid[x][y] = 1;
                }
            }
        }
    }
    
    // 1의 개수를 세어 면적을 계산하는 함수
    private static int calculateArea(int[][] grid) {
        // 면적을 저장할 변수 초기화
        int area = 0;
        
        // x 좌표에 대해 반복
        for (int i = 1; i <= 100; i++) {
            // y 좌표에 대해 반복
            for (int j = 1; j <= 100; j++) {
                // 해당 좌표가 1인 경우 area 증가
                if (grid[i][j] == 1) area++;
            }
        }
        
        // 계산된 면적 반환
        return area;
    }
    
}
