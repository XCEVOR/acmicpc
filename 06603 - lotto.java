import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            // 테스트 케이스의 첫 번째 수로 k를 입력
            int k = sc.nextInt();
            
            // 입력된 k가 0이면 반복 종료
            if (k == 0) break;
            
            // 집합 S의 원소를 입력받아 정렬
            int[] set = new int[k];
            for (int i = 0; i < k; i++) {
                set[i] = sc.nextInt();
            }
            Arrays.sort(set);
            
            // 조합 생성 함수 호출 및 결과 출력
            generateCombinations(set, new int[6], 0, 0);
            
            // 테스트 케이스 사이에 빈 줄 출력
            System.out.println();
        }
    }
    
    // 조합 생성을 위한 재귀 함수
    private static void generateCombinations(int[] set, int[] combination, int index, int selected) {
        // 6개가 선택되었을 때, 조합을 출력하고 함수 종료
        if (selected == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.print(combination[i] + " ");
            }
            System.out.println();
            return;
        }
        
        // 현재 인덱스부터 시작하여 조합을 생성하는 재귀 호출
        for (int i = index; i < set.length; i++) {
            combination[selected] = set[i];
            generateCombinations(set, combination, i + 1, selected + 1);
        }
    }
    
}
