import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 숫자와 해당 숫자의 개수를 저장하는 HashMap 생성
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        // 두 수의 합이 target이 되는 쌍을 저장하는 ArrayList 생성
        ArrayList<String> pairs = new ArrayList<>();
        
        // 입력받은 숫자들을 numberMap에 저장
        int count = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            numberMap.put(num, numberMap.getOrDefault(num, 0) + 1);
        }
        
        // target 값 입력 받기
        int target = Integer.parseInt(br.readLine());
        
        // numberMap에 저장된 숫자들 중 target - 현재 숫자가 존재하는지 확인
        // 단, 현재 숫자가 complement보다 작거나, 현재 숫자와 complement가 같은 경우에는 현재 숫자의 개수가 2 이상인 경우에만 추가
        for (int num : numberMap.keySet()) {
            int complement = target - num;
            if (numberMap.containsKey(complement) && (num < complement || (num == complement && numberMap.get(num) > 1))) {
                pairs.add(num + " " + complement);
                count++;
            }
        }
        
        // 쌍을 오름차순으로 정렬
        Collections.sort(pairs);
        
        // 쌍을 출력
        for (String pair : pairs) {
            System.out.println(pair);
        }
        
        // 쌍의 개수 출력
        System.out.println(count);
    }
}
