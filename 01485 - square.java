import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x4 = sc.nextInt();
            int y4 = sc.nextInt();
            
            // 정사각형을 만들 수 있는지 확인하고 결과 출력
            int result = canFormSquare(x1, y1, x2, y2, x3, y3, x4, y4) ? 1 : 0;
            System.out.println(result);
        }
    }
    
    // 두 점 사이의 거리를 계산하는 함수
    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    // 네 점으로 정사각형을 만들 수 있는지 확인하는 함수
    private static boolean canFormSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // 모든 두 점 사이의 거리를 구하여 오름차순 정렬
        double[] distancesArr = new double[6];
        distancesArr[0] = distance(x1, y1, x2, y2);
        distancesArr[1] = distance(x1, y1, x3, y3);
        distancesArr[2] = distance(x1, y1, x4, y4);
        distancesArr[3] = distance(x2, y2, x3, y3);
        distancesArr[4] = distance(x2, y2, x4, y4);
        distancesArr[5] = distance(x3, y3, x4, y4);
        Arrays.sort(distancesArr);
        // System.out.println(Arrays.toString(distancesArr));  // TEST PRINT
        
        // 세 변의 길이가 같고 두 대각선의 길이가 같은지 확인
        return distancesArr[0] == distancesArr[1] 
            && distancesArr[1] == distancesArr[2] 
            && distancesArr[2] == distancesArr[3] 
            && distancesArr[4] == distancesArr[5];
    }

}
