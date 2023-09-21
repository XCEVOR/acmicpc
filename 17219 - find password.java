import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // 입력 스트림과 출력 스트림을 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // N과 M 값을 입력
        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]); // 저장된 사이트 주소의 수
        int M = Integer.parseInt(nm[1]); // 비밀번호를 찾으려는 사이트 주소의 수
        
        // 저장된 사이트 주소와 비밀번호를 저장하는 Map을 생성
        Map<String, String> passwordMap = readPasswordMap(br, N);
        
        // 비밀번호를 찾고 출력
        findAndPrintPasswords(br, bw, passwordMap, M);
        
        // 출력 버퍼를 비우고 입력/출력 스트림 종료
        bw.flush();
        br.close();
        bw.close();
    }

    // 저장된 사이트 주소와 비밀번호를 입력받아 Map에 저장하는 함수
    private static Map<String, String> readPasswordMap(BufferedReader br, int N) throws IOException {
        Map<String, String> passwordMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            // 각 줄에서 사이트 주소와 비밀번호를 읽어와 Map에 저장
            String[] siteInfo = br.readLine().split(" ");
            String site = siteInfo[0]; // 사이트 주소
            String password = siteInfo[1]; // 비밀번호
            passwordMap.put(site, password);
        }
        return passwordMap;
    }

    // 비밀번호를 찾고 출력하는 함수
    private static void findAndPrintPasswords(BufferedReader br, BufferedWriter bw, Map<String, String> passwordMap, int M) throws IOException {
        for (int i = 0; i < M; i++) {
            // 비밀번호를 찾으려는 사이트 주소를 읽어옴
            String siteToFind = br.readLine();
            
            // 사이트 주소를 키로 사용하여 비밀번호를 찾음
            String password = passwordMap.get(siteToFind);
            
            // 찾은 비밀번호를 출력 버퍼에 기록
            bw.write(password + "\n");
        }
    }
    
}
