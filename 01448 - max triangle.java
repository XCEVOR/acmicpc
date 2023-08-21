import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 삼각형 문제를 해결하는 클래스
class TriangleSolver {
    // 주어진 빨대 길이 배열에서 삼각형의 세 변의 길이 합의 최댓값을 찾는 메서드
    public static int findMaxTriangleSum(int[] straws) {
        int maxSum = -1;  // 초기값 설정
        int N = straws.length;  // 배열 길이
        
        // 뒤에서부터 삼각형 성립 조건을 확인하며 최댓값을 찾음
        for (int i = N - 1; i >= 2; i--) {
            // 삼각형 성립 조건 확인
            if (straws[i - 2] + straws[i - 1] > straws[i]) {
                maxSum = straws[i - 2] + straws[i - 1] + straws[i];  // 최댓값 갱신
                break;  // 조건을 만족하면 더이상 확인할 필요 없음
            }
        }

        return maxSum;  // 최댓값 반환
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader를 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 빨대 개수를 읽어옴
        int N = Integer.parseInt(br.readLine());
        
        // 빨대 길이를 저장할 배열 생성
        int[] straws = new int[N];
        
        // 각 빨대의 길이를 읽어옴
        for (int i = 0; i < N; i++) {
            straws[i] = Integer.parseInt(br.readLine());
        }
        
        // 빨대 길이를 정렬하여 가장 큰 값이 뒤에 위치하도록 함
        Arrays.sort(straws);
        
        // TriangleSolver 클래스를 이용해 삼각형의 최댓값을 계산
        int maxSum = TriangleSolver.findMaxTriangleSum(straws);
        
        // 결과 출력
        System.out.println(maxSum);
    }
}
