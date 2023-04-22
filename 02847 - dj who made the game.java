import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int totalLevel = sc.nextInt();  // 전체 레벨 입력.
        
        int[] levelArr = new int[totalLevel];  // 레벨 개수 만큼 array 생성.
        
        for (int i = 0; i < totalLevel; i++) {  // 생성된 array 낮은 레벨 순서로 점수 입력.
            levelArr[i] = sc.nextInt();
        }
        
        int count = 0;  // 문제가 있는 점수에 대해 낮춰야 하는 횟수를 count 로 초기화.
        for (int j = totalLevel - 1; j > 0; j--) {  // array 의 가장 높은 레벨인 맨 뒷 index 부터 검사.
            if (levelArr[j - 1] >= levelArr[j]) {  // 높은 레벨이 바로 그 아래 레벨보다 작거나 같으면.
                count += levelArr[j - 1] - levelArr[j] + 1;  // 점수차 + 1 만큼 카운트 증가. (바로 아래 array 의 value 를 바꿀것이기에 먼저 코드 적용.)
                levelArr[j - 1] = levelArr[j] - 1;  // 낮은 레벨의 점수를 높은 레벨의 점수 - 1 로 변경.
            }
        }
        
        System.out.print(count);

    }
}
