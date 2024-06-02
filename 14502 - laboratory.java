import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    // 지도를 나타내는 2차원 배열과 상하좌우 이동을 위한 배열 선언
    static int[][] map;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    // 지도의 세로, 가로 크기 및 최대 안전 영역의 크기를 저장하는 변수
    static int N, M;
    static int maxSafeArea = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 지도의 세로, 가로 크기 입력 받기
        N = sc.nextInt();
        M = sc.nextInt();
        
        // 지도의 정보를 저장할 2차원 배열 생성
        map = new int[N][M];
        
        // 지도 정보 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        // 벽을 세우는 모든 경우의 수를 탐색하고 최대 안전 영역 크기 계산
        buildWalls(0, 0, 0);
        // 최대 안전 영역 크기 출력
        System.out.println(maxSafeArea);
    }
    
    // 벽을 세우는 메서드
    static void buildWalls(int x, int y, int walls) {
        if (walls == 3) {
        // 벽을 3개 세웠을 때
            // 벽을 세운 후의 임시 지도 배열 복사
            int[][] tempMap = new int[N][M];
            for (int i = 0; i < N; i++) {
                tempMap[i] = Arrays.copyOf(map[i], M);
            }
            // 최대 안전 영역 크기 업데이트
            maxSafeArea = Math.max(maxSafeArea, getSafeArea(tempMap));
            return;
        }
        
        // 벽을 세우는 모든 경우의 수 탐색
        for (int i = x; i < N; i++) {
            for (int j = (i == x ? y : 0); j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    buildWalls(i, j + 1, walls + 1);
                    map[i][j] = 0;
                }
            }
        }
    }
    
    // 안전 영역 크기를 계산하는 메서드
    static int getSafeArea(int[][] tempMap) {
        // 바이러스의 위치를 저장하기 위한 큐 선언
        Queue<int[]> queue = new LinkedList<>();
        // 안전 영역 크기를 저장할 변수
        int safeArea = 0;
        
        // 바이러스의 초기 위치를 큐에 추가
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tempMap[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        
        // BFS를 사용하여 바이러스가 퍼지는 과정 시뮬레이션
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            // 상하좌우로 이동하면서 바이러스 퍼뜨리기
            for (int[] d : dir) {
                int nx = current[0] + d[0];
                int ny = current[1] + d[1];
                
                // 지도 범위 내에 있고 빈 공간이면 바이러스 퍼뜨림
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && tempMap[nx][ny] == 0) {
                    tempMap[nx][ny] = 2;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        
        // 안전 영역의 크기 계산
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tempMap[i][j] == 0) {
                    safeArea++;
                }
            }
        }
        
        return safeArea;
    }
}
