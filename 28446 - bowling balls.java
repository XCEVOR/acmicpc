import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 위한 BufferedWriter 객체 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 요청의 개수를 입력 받음
        int M = Integer.parseInt(br.readLine());
        
        // 볼링공과 사물함 번호를 저장할 HashMap 생성
        HashMap<Integer, Integer> bowlingBalls = new HashMap<>();
        
        // 요청의 개수만큼 반복
        for (int i = 0; i < M; i++) {
            // 입력을 공백을 기준으로 나누어 배열로 저장
            String[] input = br.readLine().split(" ");
            // 요청 유형을 정수로 변환하여 저장
            int command = Integer.parseInt(input[0]);
            int weight;
            
            // 요청 유형에 따라 처리
            if (command == 1) {
                // 1번 요청인 경우
                // 볼링공을 넣을 사물함 번호와 무게를 입력 받음
                int lockerNumber = Integer.parseInt(input[1]);
                weight = Integer.parseInt(input[2]);
                // HashMap에 볼링공의 무게와 사물함 번호를 저장
                bowlingBalls.put(weight, lockerNumber);
            } else if (command == 2) {
                // 2번 요청인 경우
                // 찾고자 하는 볼링공의 무게를 입력 받음
                weight = Integer.parseInt(input[1]);
                // 해당 무게의 볼링공이 들어 있는 사물함 번호를 출력
                bw.write(bowlingBalls.get(weight) + "\n");
            }
        }
        
        // BufferedReader와 BufferedWriter를 닫음
        br.close();
        bw.flush();
        bw.close();
    }
}
