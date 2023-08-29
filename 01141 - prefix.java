import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        
        // N개의 단어를 List에 입력
        List<String> words = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            words.add(sc.nextLine());
        }
        
        // List에 담긴 단어를 사전 순으로 정렬
        Collections.sort(words);
        
        // 접두사X 집합인 부분집합의 최대 크기 찾기
        int maxSize = 1;  // 어떠한 하나의 집합은 존재
        for (int i = 1; i < N; i++) {
            // 정렬된 두 단어를 선택해 "접두사X"인지 확인
            if ( !isPrefix( words.get(i - 1), words.get(i) ) ) {
                // false가 리턴되어 !false가 되면 maxSize +1
                maxSize++;
            }
        }
        
        // 결과 출력
        System.out.println(maxSize);
    }
    
    // 두 단어가 접두사 관계인지 확인하는 함수
    private static boolean isPrefix(String word1, String word2) {
        // word2 기준으로 word1으로 시작을 한다면 접두사O -> true
        // 겹치는 단어로 시작하지 않는다면 접두사X -> false
        return word2.startsWith(word1);
    }
}
