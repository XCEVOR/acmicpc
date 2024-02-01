import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N 입력
        int N = sc.nextInt();
        
        // 순열 입력
        int[] permutation = new int[N];
        for (int i = 0; i < N; i++) {
            permutation[i] = sc.nextInt();
        }
        System.out.println(permutation + "  // permutation address");
        
        // 이전 순열 찾기
        if (prevPermutation(permutation)) {
            // 이전 순열이 존재하는 경우 출력
            for (int i = 0; i < N; i++) {
                System.out.print(permutation[i] + " ");
            }
        } else {
            // 사전순으로 가장 처음에 오는 순열인 경우 -1 출력
            System.out.println("-1");
        }
    }
    
    // 이전 순열 찾는 함수
    private static boolean prevPermutation(int[] arr) {
        System.out.println(arr + "  // arr address");
        
        int i = arr.length - 1;
        // 순열의 끝부터 내림차순이 아닌 부분을 찾음
        while (i > 0 && arr[i - 1] <= arr[i]) {
            i--;
        }
        System.out.println(Arrays.toString(arr) + "  // 1st");
        
        // 순열이 내림차순으로 되어있으면 이전 순열이 없음
        if (i <= 0) {
            return false;
        }
        System.out.println(Arrays.toString(arr) + "  // 2nd");
        
        // 이전 순열을 찾기 위해 순열의 끝부터 탐색하여 현재 위치와 바꿀 위치를 찾음
        int j = arr.length - 1;
        while (arr[j] >= arr[i - 1]) {
            j--;
        }
        System.out.println(Arrays.toString(arr) + "  // 3rd");
        
        // 현재 위치와 바꿀 위치를 바꿈
        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;
        System.out.println(Arrays.toString(arr) + "  // 4th");
        
        // 바꾼 위치부터 순열을 뒤집어서 정렬
        j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr) + "  // 5th");
        
        return true;
    }
}




/*

5
5 4 3 2 1

[I@75b84c92  // permutation address
[I@75b84c92  // arr address
[5, 4, 3, 2, 1]  // 1st
[5, 4, 3, 2, 1]  // 2nd
[5, 4, 3, 2, 1]  // 3rd
[5, 4, 3, 1, 2]  // 4th
[5, 4, 3, 1, 2]  // 5th
5 4 3 1 2 

*/
