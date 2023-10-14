import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 단어의 개수 N을 입력받음
        
        HashMap<String, Integer> groups = new HashMap<>();  // 그룹화를 위한 HashMap 선언
        
        for (int i = 0; i < N; i++) {
            String word = sc.next();  // 다음 단어를 입력받음
            String sortedWord = sortString(word);  // 알파벳 정렬된 단어를 얻음
            // System.out.println(sortedWord);  // TEST PRINT
            
            // HashMap에 sortedWord가 이미 존재한다면 해당 값에 1을 더하고, 없다면 1을 설정
            groups.put(sortedWord, groups.getOrDefault(sortedWord, 0) + 1);
        }
        
        // TEST PRINT
        // for (HashMap.Entry<String, Integer> entry : groups.entrySet()) {
        //     String key = entry.getKey();
        //     Integer value = entry.getValue();
        //     System.out.println("Key: " + key + ", Value: " + value);
        // }
        
        // HashMap의 크기를 구하여 그룹의 최소 개수를 얻음
        int groupCount = groups.size();
        System.out.println(groupCount);
    }
    
    // 문자열을 알파벳 순으로 정렬하는 메서드
    private static String sortString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);  // 문자열을 알파벳 순으로 정렬
        return new String(chars);  // 정렬된 문자열을 반환
    }
    
}



/*

4
cat
dog
god
tca

Key: act, Value: 2
Key: dgo, Value: 2
2

*/
