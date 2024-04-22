import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 체크포인트의 개수 입력
        int N = sc.nextInt();
        // 체크포인트 좌표를 저장할 배열
        int[][] checkpoints = new int[N][2];
        
        // 체크포인트 좌표 입력 받기
        inputCheckpoints(sc, checkpoints);
        
        // 전체 거리 계산
        int totalDistance = calculateTotalDistance(checkpoints);
        
        // 최소 거리 계산
        int minDistance = calculateMinDistance(checkpoints, totalDistance);
        
        // 최소 거리 출력
        System.out.println(minDistance);
    }
    
    // 체크포인트 좌표 입력 메서드
    private static void inputCheckpoints(Scanner sc, int[][] checkpoints) {
        // 각 체크포인트의 x좌표와 y좌표 입력 받기
        for (int i = 0; i < checkpoints.length; i++) {
            checkpoints[i][0] = sc.nextInt();
            checkpoints[i][1] = sc.nextInt();
        }
    }
    
    // 두 점 사이의 거리 계산 메서드
    private static int calculateDistance(int[] point1, int[] point2) {
        // 맨해튼 거리 계산
        return Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
    }
    
    // 전체 거리 계산 메서드
    private static int calculateTotalDistance(int[][] checkpoints) {
        int totalDistance = 0;
        
        // 각 체크포인트 간의 거리를 누적하여 전체 거리 계산
        for (int i = 1; i < checkpoints.length; i++) {
            totalDistance += calculateDistance(checkpoints[i - 1], checkpoints[i]);
        }
        
        return totalDistance;
    }
    
    // 최소 거리 계산 메서드
    private static int calculateMinDistance(int[][] checkpoints, int totalDistance) {
        int minDistance = Integer.MAX_VALUE;
        
        // 각 체크포인트를 제외한 경우의 최소 거리 계산
        for (int i = 1; i < checkpoints.length - 1; i++) {
            int tempDistance = totalDistance;
            
            // i번째 체크포인트를 건너뛰었을 때의 거리 계산
            tempDistance -= calculateDistance(checkpoints[i - 1], checkpoints[i]);
            tempDistance -= calculateDistance(checkpoints[i], checkpoints[i + 1]);
            tempDistance += calculateDistance(checkpoints[i - 1], checkpoints[i + 1]);
            
            // 최소 거리 갱신
            minDistance = Math.min(minDistance, tempDistance);
        }
        
        return minDistance;
    }
}
