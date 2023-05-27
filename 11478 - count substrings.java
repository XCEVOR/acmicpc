import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String inputStr = sc.next();
        
        int count = countDistinctSubstrings(inputStr);
        
        System.out.print(count);  // "서로 다른 부분 문자열 개수"
    }
    
    
    public static int countDistinctSubstrings(String inputStr) {
        
        int n = inputStr.length();
        
        Set<String> mySet = new HashSet<>();  // 결과를 저장할 Set.

        // 모든 가능한 부분 문자열 생성.
        for (int i = 0; i < n; i++) {  // 문자의 시작 위치.
            for (int j = i + 1; j <= n; j++) {  // 문자의 끝 위치.
                String substring = inputStr.substring(i, j);  // 현재 loop 의 문자 추출.
                mySet.add(substring);  // 생성한 mySet 에 추가.
                // System.out.println(mySet);  // TEST PRINT
            }
        }

        return mySet.size();  // mySet 에 담긴 개수를 반환.
    }
    
}
