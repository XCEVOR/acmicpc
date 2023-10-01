import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // input, output을 위한 BufferedReader, BufferedWrither 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스 T를 읽음
        int T = Integer.parseInt(br.readLine());
        
        // 매 테스트 케이스 loop
        for (int i = 0; i < T; i++) {
            // 입력되는 두 수를 공백으로 구분하여 입력
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            
            // a + b 게산
            int sum = a + b;
            
            // Write the result of A + B to the BufferedWriter.
            // BufferedWriter로 a + b 결과 기록
            bw.write(Integer.toString(a + b));  // integer를 string으로 변환 후 기록
            bw.newLine();  // 다음 테스트 케이스를 위해 다음 라인으로 이동
        }
        
        // output buffer에 기록된 모든 데이터는 내보냄
        bw.flush();
        
        // Close the BufferedWriter and BufferedReader to release resources
        bw.close();
        br.close();
    }
}
