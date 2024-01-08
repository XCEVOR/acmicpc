import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 수 입력
        int t = sc.nextInt();
        
        // 각 테스트 케이스에 대한 처리
        for (int i = 0; i < t; i++) {
            // 배열 크기 입력
            int n = sc.nextInt();
            
            // 배열 선언
            int[] arr = new int[n];
            
            // 배열 요소 입력
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            
            // 최대 부분 배열의 합 계산
            int result = maxSubarraySum(arr);
            
            // 최대 부분 배열의 합 출력
            System.out.println(result);
        }
    }
    
    // 최대 부분 배열의 합을 계산하는 메서드
    public static int maxSubarraySum(int[] arr) {
        // 현재까지 부분 배열의 최대 합
        int maxEndingHere = arr[0];
        // 최대 부분 배열의 합
        int maxSoFar = arr[0];
        
        // 배열을 순회하며 최대 부분 배열의 합 계산
        for (int i = 1; i < arr.length; i++) {
            // 현재 위치까지의 부분 배열의 합과 현재 원소와의 합 중 큰 값을 선택
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            // 현재까지의 최대 부분 배열의 합과 새로운 부분 배열의 합 중 큰 값을 최대 부분 배열의 합으로 선택
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        // 최종 최대 부분 배열의 합 반환
        return maxSoFar;
    }
}
