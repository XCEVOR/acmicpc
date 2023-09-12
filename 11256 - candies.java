import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    // 상자의 부피를 계산하고 정렬하는 함수
    private static void sortBoxesArr(int boxes, List<Integer> boxVolumeArr) {
        for (int b = 0; b < boxes; b++) {
            // 상자의 세로 길이와 가로 길이를 입력받아 부피를 계산하고 리스트에 추가
            int v = sc.nextInt() * sc.nextInt();
            boxVolumeArr.add(v);
        }
        
        // 상자 부피를 정렬
        Collections.sort(boxVolumeArr);
    }
    
    // 최소한의 상자 개수를 계산하는 함수
    private static int countMinBoxes(int candies, List<Integer> boxVolumeArr) {
        int count = 0;
        while (candies > 0) {
            // 가장 큰 상자의 부피를 사용하여 사탕을 포장하고 사탕 개수를 업데이트
            candies -= boxVolumeArr.get(boxVolumeArr.size() - 1 - count);
            count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        // 테스트 케이스 개수 입력
        int testCase = sc.nextInt();
        
        for (int t = 0; t < testCase; t++) {
             // 각 테스트 케이스에서 사용할 상자 부피 리스트 초기화
            List<Integer> boxVolumeArr = new ArrayList();
            
            // 사탕 개수와 상자 개수 입력
            int candies = sc.nextInt();
            int boxes = sc.nextInt();
            
            // 상자 부피를 계산하고 정렬
            sortBoxesArr(boxes, boxVolumeArr);
            
            // 최소한의 상자 개수를 계산하고 출력
            int result = countMinBoxes(candies, boxVolumeArr);
            
            System.out.println(result);
        }
    }
    
}
