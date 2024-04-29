import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 재료의 개수 N과 갑옷을 만드는데 필요한 수 M을 입력
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 재료의 고유한 번호들을 저장할 배열
        int[] materials = new int[N];
        
        // 재료의 고유한 번호들을 입력받아 배열에 저장
        for (int i = 0; i < N; i++) {
            materials[i] = sc.nextInt();
        }
        
        // 재료의 번호를 오름차순으로 정렬
        Arrays.sort(materials);
        
        // countArmors 메서드를 호출하여 갑옷을 만들 수 있는 경우의 수를 계산
        int count = countArmors(materials, M);
        
        // 결과 출력
        System.out.println(count);
    }
    
    // 갑옷을 만들 수 있는 경우의 수를 계산하는 메서드
    private static int countArmors(int[] materials, int M) {
        int count = 0;
        int left = 0;
        int right = materials.length - 1;
        
        // 두 포인터를 사용하여 갑옷을 만들 수 있는 경우의 수를 계산
        while (left < right) {
            int sum = materials[left] + materials[right];
            if (sum == M) {
                // 갑옷을 만들 수 있는 경우의 수 증가
                count++;
                left++;
                right--;
            } else if (sum < M) {
                // 합이 M보다 작으면 왼쪽 포인터를 오른쪽으로 이동
                left++;
            } else {
                // 합이 M보다 크면 오른쪽 포인터를 왼쪽으로 이동
                right--;
            }
        }
        
        return count;
    }
}
