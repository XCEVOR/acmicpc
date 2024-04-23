import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // break가 나올 때까지 반복
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 상근이가 가지고 있는 CD의 수
            int m = Integer.parseInt(st.nextToken()); // 선영이가 가지고 있는 CD의 수
            
            // 입력의 마지막 줄인 0 0 경우 반복 종료
            if (n == 0 && m == 0) break;
            
            HashMap<Integer, Boolean> map = new HashMap<>(); // CD 번호를 저장할 해시맵
            
            // 상근이가 가지고 있는 CD 번호를 해시맵에 저장
            for (int i = 0; i < n; i++) {
                int cdNum = Integer.parseInt(br.readLine());
                map.put(cdNum, true);
            }
            
            // 동시에 가지고 있는 CD의 개수를 구함
            int count = countCommonCDs(map, br, m);
            
            // 결과 개수 출력
            System.out.println(count);
        }
    }
    
    // 동시에 가지고 있는 CD의 개수를 구하는 메서드
    private static int countCommonCDs(HashMap<Integer, Boolean> map, BufferedReader br, int m) throws IOException {
        int count = 0; // 동시에 가지고 있는 CD의 개수
        
        // 선영이가 가지고 있는 CD를 입력 받으면서 상근이가 가지고 있는지 확인하고 카운트
        for (int i = 0; i < m; i++) {
            int cdNum = Integer.parseInt(br.readLine());
            if (map.containsKey(cdNum)) {
                count++; // CD 번호가 존재하면 개수 증가
            }
        }
        
        return count;
    }
}
