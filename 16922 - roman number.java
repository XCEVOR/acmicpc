import java.util.Scanner;
import java.util.HashSet;


public class Main {
    
    // 로마 숫자에 대응하는 문자와 값들을 배열로 저장
    static char[] symbols = {'I', 'V', 'X', 'L'};
    static int[] values = {1, 5, 10, 50};
    
    // 중복을 허용하지 않는 HashSet을 사용하여 유일한 숫자를 저장
    static HashSet<Integer> uniqueNumbers = new HashSet<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용할 문자의 개수를 입력 받음
        int N = sc.nextInt();
        
        // 현재 로마 문자열 빌더
        StringBuilder current = new StringBuilder();
        
        // 로마 숫자 생성하는 함수 호출
        generateNumbers(N, current, 0);
        
        // 생성된 서로 다른 숫자의 개수를 출력
        System.out.println(uniqueNumbers.size());
        
        // TEST PRINT
        // printHashSet(uniqueNumbers);
    }
    
    // 로마 숫자를 생성하는 재귀 함수
    public static void generateNumbers(int N, StringBuilder current, int index) {
        if (N == 0) {  // N이 0이면 재귀 종료
            int sum = 0;
            
            // 현재 로마 숫자의 합을 계산
            for (int i = 0; i < current.length(); i++) {
                char c = current.charAt(i);
                int idx = findIndex(c);
                sum += values[idx];
            }
            
            // 중복되지 않는 유일한 숫자로 HashSet에 추가
            uniqueNumbers.add(sum);
            return;
        }
        
        // 재귀적으로 로마 숫자 생성
        // 인덱스(index)부터 시작하여 symbols 배열의 길이까지 반복
        for (int i = index; i < symbols.length; i++) {
            // 현재 숫자 조합에 symbols[i]를 추가하여 문자열을 생성
            current.append(symbols[i]);
            // generateNumbers 함수를 재귀적으로 호출하여 남은 문자 개수(N - 1)를 줄이고, index는 i로 설정
            generateNumbers(N - 1, current, i);
            // 재귀 호출이 끝나면 마지막으로 추가한 문자를 삭제하여 이전 상태로 되돌림
            current.deleteCharAt(current.length() - 1);
        }
    }
    
    // 문자에 대응하는 인덱스를 찾는 함수
    public static int findIndex(char c) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == c) {
                return i;
            }
        }
        
        // 문자에 해당하는 인덱스가 없는 경우 -1 반환
        return -1;
    }
    
    // HashSet 내용을 출력하는 함수
    public static void printHashSet(HashSet<Integer> hashSet) {
    System.out.println("Contents of the HashSet:");
        for (int num : hashSet) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
