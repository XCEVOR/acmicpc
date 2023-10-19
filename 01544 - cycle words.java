import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 입력으로 주어진 단어의 개수
        
        // 단어와 해당 단어가 이미 나왔는지를 저장하기 위한 해시맵
        HashMap<String, Boolean> wordMap = new HashMap<>();
        
        int uniqueWords = 0;  // 서로 다른 단어의 개수를 저장할 변수
        
        for (int i = 0; i < N; i++) {
            String word = sc.next();  // 단어 입력
            
            // 만약 이전에 나온 적이 없는 단어인 경우
            if (!wordMap.containsKey(word)) {
                 // 단어의 원형큐를 생성
                Queue<Character> circularQueue = createCircularQueue(word);
                
                // 원형큐를 이용하여 단어가 고유한지 확인
                boolean isUnique = isUniqueWord(circularQueue, wordMap);
                
                // 고유한 단어라면 개수를 증가하고 해시맵에 단어 등록
                if (isUnique) {
                    uniqueWords++;
                    wordMap.put(word, true);
                }
            }
        }
        // 서로 다른 단어의 개수 출력
        System.out.println(uniqueWords);
    }
    
    // 단어의 원형큐를 생성하는 함수
    private static Queue<Character> createCircularQueue(String word) {
        Queue<Character> circularQueue = new LinkedList<>();
        for (int j = 0; j < word.length(); j++) {
            circularQueue.add(word.charAt(j));
        }
        return circularQueue;
    }
    
    // 단어가 고유한지 확인하는 함수
    private static boolean isUniqueWord(Queue<Character> circularQueue, HashMap<String, Boolean> wordMap) {
        boolean isUnique = true;
        for (int j = 0; j < circularQueue.size(); j++) {
            StringBuilder circularWord = new StringBuilder();
            for (Character c : circularQueue) {
                circularWord.append(c);
            }
            
            // 해시맵에 이미 있는 경우 고유하지 않음
            if (wordMap.containsKey(circularWord.toString())) {
                isUnique = false;
                break;
            }
            
            // 원형큐 회전
            circularQueue.add(circularQueue.poll());
        }
        return isUnique;
    }
    
}
