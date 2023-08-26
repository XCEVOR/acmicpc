import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

// Kindergarten 클래스: 원생들을 관리하고 최소 비용을 계산하는 역할
class Kindergarten {
    private int N;  // 원생의 수
    private int K;  // 나눌 조의 개수
    private int[] heights;  // 원생들의 키 배열
    
    // Constructor: Kindergarten 클래스
    public Kindergarten(int N, int K, int[] heights) {
        this.N = N;
        this.K = K;
        this.heights = heights;
    }
    
    // 최소 비용을 계산하는 메서드
    public int calculateMinCost() {
        int[] differences = new int[N - 1];  // 인접한 두 원생의 키 차이를 저장할 배열
        for (int i = 0; i < N - 1; i++) {
            // 인접한 원생들의 키 차이를 계산하여 differences 배열에 저장
            differences[i] = heights[i + 1] - heights[i];
        }
        
        // 키 차이 배열을 오름차순으로 정렬
        Arrays.sort(differences);
        
        int totalCost = 0;  // 전체 비용 초기화
        for (int i = 0; i < N - K; i++) {
            // 가장 키 차이가 큰 K-1개를 제외한 오름차순 정렬된 나머지 키 차이의 합을 계산
            totalCost += differences[i];
        }
        
        // 최소 비용 반환
        return totalCost;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());  // 원생의 수 입력
        int K = Integer.parseInt(st.nextToken());  // 나눌 조의 개수 입력
        
        int[] heights = new int[N];  // N명의 원생들의 키를 저장하는 배열
        
        // br.readLine()으로 입력받은 문자열을 공백을 기준으로 토큰으로 분리하는 StringTokenizer 생성
        st = new StringTokenizer(br.readLine());  // 한 줄로 주어지는 원생들의 키 입력
        
        // N명의 원생들의 키를 입력받아서 heights 배열에 저장
        for (int i = 0; i < N; i++) {
            // st.nextToken()으로 다음 토큰(문자열)을 가져와서 Integer.parseInt()로 정수로 변환 후 heights 배열에 저장
            heights[i] = Integer.parseInt(st.nextToken());  // 원생들의 키 배열에 입력
        }
        
        // Kindergarten 클래스를 사용하여 최소 비용 계산
        Kindergarten kindergarten = new Kindergarten(N, K, heights);
        int minCost = kindergarten.calculateMinCost();
        
        // 최소 비용 출력
        System.out.println(minCost);
    }
}
