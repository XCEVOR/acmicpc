import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


public class Main {
    
    public static void main(String[] args) throws IOException {
        // 입력과 출력을 위한 BufferedReader와 BufferedWriter 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 단어의 개수
        int M = Integer.parseInt(st.nextToken()); // 외울 단어의 최소 길이
        
        // 단어와 빈도수를 저장하기 위한 리스트와 맵 생성
        List<String> words = new ArrayList<>();
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        // 단어 입력과 빈도수 계산
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            words.add(word);
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            // 1. frequencyMap에서 현재 단어 word를 찾음.
            // 2. 만약 word가 이미 frequencyMap에 존재한다면, 해당 단어의 빈도수를 가져옴
            // 3. 그 빈도수에 1을 더하고, 다시 frequencyMap에 word와 업데이트된 빈도수를 저장
            // 4. 만약 word가 frequencyMap에 존재하지 않는다면, getOrDefault 메서드를 사용하여 0을 기본값으로 가져온 뒤, 1을 더하고 word와 빈도수 1을 저장
        }
        
        // 단어 정렬 함수 호출
        sortWords(words, frequencyMap);
        
        // 중복을 제거하고 출력하는 함수 호출
        Set<String> printedWords = new HashSet<>();
        printWords(words, printedWords, M, bw);
        
        // 출력 버퍼 비우고 닫기
        bw.flush();
        bw.close();
        br.close();
    }
    
    // 단어 정렬 함수
    private static void sortWords(List<String> words, Map<String, Integer> frequencyMap) {
        // Collections.sort를 사용하여 words 리스트를 정렬
        // Comparator를 사용하여 단어의 정렬 기준을 지정
        Collections.sort(words, (a, b) -> {
            // 각 단어의 빈도수를 가져옴
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            
            // 1. 자주 나오는 단어가 먼저 오도록 빈도수를 비교
            if (freqA != freqB) {
                return Integer.compare(freqB, freqA);  // freqB가 freqA보다 크면 freqB가 앞에 위치
            }
            // 2. 빈도수가 같은 경우, 길이가 긴 단어가 먼저 오도록 길이를 비교
            else if (a.length() != b.length()) {
                return Integer.compare(b.length(), a.length());  // b의 길이가 a의 길이보다 크면 b가 앞에 위치
            }
            // 3. 길이도 같은 경우, 알파벳 순서로 정렬
            else {
                return a.compareTo(b);  // a와 b를 알파벳 순서로 비교하여 정렬
            }
        });
    }
    
    // 중복을 제거하고 출력하는 함수
    private static void printWords(List<String> words, Set<String> printedWords, int M, BufferedWriter bw)
            throws IOException {
        for (String word : words) {
            if (word.length() >= M && !printedWords.contains(word)) {
                bw.write(word + "\n");  // 출력
                printedWords.add(word);  // 이미 출력한 단어 기록
            }
        }
    }
    
}
