import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문제의 난이도를 결정할 의견의 개수를 입력
        int n = Integer.parseInt(br.readLine());
        // 각 사용자의 의견을 저장할 배열을 생성
        int[] opinions = new int[n];
        
        // 각 사용자의 의견을 입력
        for (int i = 0; i < n; i++) {
            opinions[i] = Integer.parseInt(br.readLine());
        }
        
        // 문제의 난이도를 계산
        int difficulty = calculateDifficulty(opinions);
        
        // 계산된 난이도를 출력
        bw.write(String.valueOf(difficulty));
        bw.newLine();
        
        // 버퍼에 남아있는 데이터를 출력
        bw.flush();
        
        br.close();
        bw.close();
    }
    
    // 문제의 난이도를 계산하는 메서드
    private static int calculateDifficulty(int[] opinions) {
        // 의견을 오름차순으로 정렬
        Arrays.sort(opinions);
        
        // 제외할 의견 개수를 계산
        int excludeCount = (int) Math.round(opinions.length * 0.15);
        int total = 0;
        
        // 절사평균을 계산하기 위해 제외된 의견을 제외하고 합을 계산
        for (int i = excludeCount; i < opinions.length - excludeCount; i++) {
            total += opinions[i];
        }
        
        // 평균을 계산하여 반환
        double average = (double) total / (opinions.length - 2 * excludeCount);
        return (int) Math.round(average);
    }
}
