import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();  // 테스트 케이스 수 입력
        
        for (int t = 0; t < testCases; t++) {  // 각 테스트 케이스에 대해 처리
            int[] A = readArray(sc);  // 배열 A 입력
            int[] B = readArray(sc);  // 배열 B 입력
            int[] C = readArray(sc);  // 배열 C 입력
            
            HashMap<Integer, Integer> luckySums = new HashMap<>();  // 행운의 합을 저장할 해시맵
            
            generateLuckySums(A, B, C, luckySums);  // 가능한 행운의 합 생성
            
            System.out.println(luckySums.size());  // 서로 다른 행운의 수의 개수 출력
        }
    }
    
    // 배열을 입력받는 함수
    private static int[] readArray(Scanner sc) {
        int size = sc.nextInt();  // 배열 크기 입력
        int[] arr = new int[size];  // 입력된 크기의 배열 생성
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();  // 배열 요소 입력
        }
        return arr; // 입력된 배열 반환
    }
    
    // 가능한 행운의 합을 생성하고 해시맵에 저장하는 함수
    private static void generateLuckySums(int[] A, int[] B, int[] C, HashMap<Integer, Integer> luckySums) {
        for (int a : A) {
            for (int b : B) {
                for (int c : C) {
                    int sum = a + b + c;  // 세 수의 합 계산
                    if (isLucky(sum)) {  // 행운의 수인지 확인
                        luckySums.put(sum, luckySums.getOrDefault(sum, 0) + 1);  // 행운의 합을 해시맵에 추가
                    }
                }
            }
        }
    }
    
    // 주어진 수가 행운의 수인지 확인하는 함수
    private static boolean isLucky(int num) {
        while (num > 0) {
            int digit = num % 10;  // 각 자리 숫자 확인
            if (digit != 5 && digit != 8) {  // 5 또는 8이 아닌 경우 행운의 수가 아님
                return false;
            }
            num /= 10; // 다음 자리 숫자로 이동
        }
        return true;  // 모든 자리 숫자가 5 또는 8인 경우 행운의 수
    }
}
