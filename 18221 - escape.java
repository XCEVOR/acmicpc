import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N 입력
        int N = sc.nextInt();
        // 책상 위치 array 초기화
        int[][] desk = new int[N][N];
        
        // 책상 상태 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                desk[i][j] = sc.nextInt();
            }
        }
        
        // 성규와 교수님의 위치 찾기
        int[] sgPosition = findPosition(desk, 2); // 성규의 위치
        int[] profPosition = findPosition(desk, 5); // 교수님의 위치
        
        // 성규가 도망갈 수 있는지 확인
        int result = canEscape(sgPosition, profPosition, desk);
        
        // 결과 출력
        System.out.println(result);
    }
    
    // 특정 숫자의 위치 찾는 메서드
    public static int[] findPosition(int[][] desk, int num) {
        int[] position = new int[2];
        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk[i].length; j++) {
                if (desk[i][j] == num) {
                    // 현재 위치가 찾는 숫자와 같으면
                    position[0] = i; // 행 번호 저장
                    position[1] = j; // 열 번호 저장
                    return position; // 위치 반환 후 종료
                }
            }
        }
        return position; // 위치를 찾지 못한 경우 기본값 반환
    }
    
    // 성규가 도망갈 수 있는지 확인하는 메서드
    public static int canEscape(int[] sgPosition, int[] profPosition, int[][] desk) {
        // 성규와 교수님 사이의 거리 계산
        double distance = Math.sqrt(Math.pow(sgPosition[0] - profPosition[0], 2) + Math.pow(sgPosition[1] - profPosition[1], 2));
        
        if (distance >= 5) {
        // 거리가 5 이상인 경우
            int count = 0;
            
            // 직사각형 안에 있는 학생 수 카운트
            for (int i = Math.min(sgPosition[0], profPosition[0]); i <= Math.max(sgPosition[0], profPosition[0]); i++) {
                for (int j = Math.min(sgPosition[1], profPosition[1]); j <= Math.max(sgPosition[1], profPosition[1]); j++) {
                    if (desk[i][j] == 1) { // 학생이 앉아있는 경우
                        count++; // 카운트 증가
                        // System.out.println(count);
                    }
                }
            }
            
            if (count >= 3) {
            // 직사각형 안에 학생이 3명 이상인 경우
                return 1; // 도망 가능하므로 1 반환
            } else {
                return 0; // 도망 불가능하므로 0 반환
            }
        } else {
        // 거리가 5 미만인 경우
            return 0; // 도망 불가능하므로 0 반환
        }
    }
}
