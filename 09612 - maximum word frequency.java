import java.util.Scanner;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어 개수 입력
        
        // 단어 빈도를 저장할 HashMap 선언
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            // 한 줄에 하나의 단어를 입력받음
            String word = sc.nextLine();
            
            // HashMap에 단어를 키로 저장하고, 이미 존재하는 경우에는 빈도를 증가시킴
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        
        int maxFrequency = 0; // 가장 높은 빈도 저장 변수
        String mostFrequentWord = ""; // 가장 빈도가 높은 단어 저장 변수
        
        for (HashMap.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency || (entry.getValue() == maxFrequency && entry.getKey().compareTo(mostFrequentWord) > 0)) {
                // 만약 현재 단어의 빈도가 최댓값보다 크거나, 빈도가 같으면서 렉시컬 순서상 나중에 나오는 경우
                mostFrequentWord = entry.getKey(); // 가장 빈도가 높은 단어 업데이트
                maxFrequency = entry.getValue(); // 최댓값 업데이트
            }
        }
        
        System.out.println(mostFrequentWord + " " + maxFrequency); // 결과 출력
    }
    
}
