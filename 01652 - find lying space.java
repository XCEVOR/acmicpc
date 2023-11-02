import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 방의 크기 N을 입력받음
        int N = sc.nextInt();
        
        // N x N 크기의 방 배열 선언
        char[][] room = new char[N][N];
        
        for (int i = 0; i < N; i++) {
            // 한 칸의 상태 입력
            String oneSpace = sc.next();
            for (int j = 0; j < N; j++) {
                room[i][j] = oneSpace.charAt(j);
            }
        }
        
        // 누울 수 있는 자리 계산 함수 호출
        int[] result = calculateLyingSpaces(N, room);
        
        // 결과 출력
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] calculateLyingSpaces(int N, char[][] room) {
        int horizontalCount = 0;  // 가로로 누울 수 있는 자리 개수
        int verticalCount = 0;  // 세로로 누울 수 있는 자리 개수
        
        for (int i = 0; i < N; i++) {
            int count = 0;  // 연속된 빈 칸 개수 초기화
            for (int j = 0; j < N; j++) {
                if (room[i][j] == '.') {  // 현재 위치가 빈 칸인 경우
                    count++;  // 빈 칸 개수 증가
                } else {
                    if (count >= 2) {  // 연속된 빈 칸이 2개 이상인 경우
                        horizontalCount++;  // 가로로 누울 수 있는 자리 개수 증가
                    }
                    count = 0;  // 빈 칸 개수 초기화
                }
            }
            if (count >= 2) {  // 연속된 빈 칸이 2개 이상인 경우
                horizontalCount++;  // 가로로 누울 수 있는 자리 개수 증가
            }
        }
        
        for (int j = 0; j < N; j++) {
            int count = 0;  // 연속된 빈 칸 개수 초기화
            for (int i = 0; i < N; i++) {
                if (room[i][j] == '.') {  // 현재 위치가 빈 칸인 경우
                    count++;  // 빈 칸 개수 증가
                } else {
                    if (count >= 2) {  // 연속된 빈 칸이 2개 이상인 경우
                        verticalCount++;  // 세로로 누울 수 있는 자리 개수 증가
                    }
                    count = 0;  // 빈 칸 개수 초기화
                }
            }
            if (count >= 2) {  // 연속된 빈 칸이 2개 이상인 경우
                verticalCount++;  // 세로로 누울 수 있는 자리 개수 증가
            }
        }
        
        int[] result = {horizontalCount, verticalCount};  // 결과 배열 생성
        return result;  // 결과 반환
    }
    
}
