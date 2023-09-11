import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받을 수 있도록 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 숫자의 개수 N을 입력 받음
        int N = Integer.parseInt(br.readLine());
        
        // 첨탑의 높이를 저장할 배열 heights 선언
        int[] heights = new int[N];
        // 두 번째 줄에서 공백으로 구분된 숫자들을 읽어서 배열에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }
        
        // 첨탑의 높이를 비교하면서 앞의 수가 뒤의 수보다 작거나 같은 경우 카운트를 증가
        int count = 1;  // 초기 카운트를 1로 설정하여 첫 번째 첨탑은 항상 포함
        for (int i = 1; i < N; i++) {
            if (heights[i - 1] <= heights[i]) {
                count++;
            }
        }
        
        // 결과를 출력
        System.out.println(count);
    }
    
}
