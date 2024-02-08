import java.util.Scanner;
import java.util.Arrays;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스 개수 입력
        sc.nextLine(); // 개행 문자 처리
        
        // 테스트 케이스 반복
        for (int t = 0; t < T; t++) {
            String A = sc.nextLine(); // 테스트 케이스 입력
            String nextNumber = findNextNumber(A); // 다음 숫자 계산
            System.out.println(nextNumber); // 결과 출력
        }
    }
    
    // 다음 숫자 계산하는 메서드
    private static String findNextNumber(String A) {
        char[] digits = A.toCharArray(); // 문자열을 문자 배열로 변환
        
        // 가장 오른쪽에서부터 탐색하여 가장 작은 인덱스를 찾음
        int i = findIndexOfDecreasingSuffix(digits);
        
        // 더 이상 큰 수가 없는 경우
        if (i < 0) {
            return "BIGGEST"; // "BIGGEST" 반환
        }
        
        // i보다 큰 가장 작은 인덱스를 찾음
        int j = findIndexOfNextLargerDigit(digits, i);
        
        // digits[i]와 digits[j]를 swap
        swap(digits, i, j);
        
        // i+1 부터 마지막까지 오름차순 정렬
        Arrays.sort(digits, i + 1, digits.length);
        
        // 정렬된 배열을 문자열로 변환하여 반환
        return new String(digits);
    }
    
    // 가장 오른쪽에서부터 탐색하여 가장 작은 인덱스를 찾는 메서드
    private static int findIndexOfDecreasingSuffix(char[] digits) {
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                return i;
            }
        }
        return -1; // 찾지 못한 경우 -1 반환
    }
    
    // i보다 큰 가장 작은 인덱스를 찾는 메서드
    private static int findIndexOfNextLargerDigit(char[] digits, int i) {
        for (int j = digits.length - 1; j > i; j--) {
            if (digits[j] > digits[i]) {
                return j;
            }
        }
        return -1; // 찾지 못한 경우 -1 반환
    }
    
    // 두 문자를 swap하는 메서드
    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
}
