import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 개수 입력
        int T = Integer.parseInt(br.readLine());
        
        // 테스트 케이스 수만큼 반복
        for (int t = 0; t < T; t++) {
            // '수첩1'에 적혀 있는 정수의 개수 입력
            int N = Integer.parseInt(br.readLine());
            // '수첩1'에 적혀 있는 정수들을 저장할 배열 생성
            int[] notebook1 = new int[N];
            // '수첩1'에 적혀 있는 정수들을 공백을 기준으로 나눠서 배열에 저장
            String[] nums1 = br.readLine().split(" ");
            
            // 정수들을 배열에 저장
            for (int i = 0; i < N; i++) {
                notebook1[i] = Integer.parseInt(nums1[i]);
            }
            
            // '수첩1'에 적혀 있는 정수들을 정렬
            Arrays.sort(notebook1);
            
            // '수첩2'에 적혀 있는 정수의 개수 입력
            int M = Integer.parseInt(br.readLine());
            // '수첩2'에 적혀 있는 정수들을 공백을 기준으로 나눠서 배열에 저장
            String[] nums2 = br.readLine().split(" ");
            
            // '수첩2'에 적혀 있는 각 정수에 대해 반복
            for (int i = 0; i < M; i++) {
                // 현재 검사할 정수 가져오기
                int num = Integer.parseInt(nums2[i]);
                
                // '수첩1'에서 이분 탐색을 통해 정수가 있는지 확인하고 결과 출력
                bw.write(binarySearch(notebook1, num) + "\n");
            }
        }
        
        // BufferedWriter의 버퍼 비우고 닫기
        bw.flush();
        bw.close();
    }
    
    // 이분 탐색을 통해 정수가 배열에 있는지 확인하는 메서드
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] == target) {
                return 1; // 정수가 배열에 있음
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return 0; // 정수가 배열에 없음
    }
}
