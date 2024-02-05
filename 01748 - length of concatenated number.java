import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 사용자로부터 입력값 N을 받음
        int N = Integer.parseInt(br.readLine());
        
        // 새로운 수의 자릿수를 계산하는 메서드 호출
        long length = getLengthOfConcatenatedNumber(N);
        
        // 결과 출력
        System.out.println(length);
    }
    
    // 주어진 수 N에 대해 새로운 수의 자릿수를 계산하는 메서드
    private static long getLengthOfConcatenatedNumber(int N) {
        // 결과로 반환할 자릿수 변수
        long length = 0;
        // 현재 자릿수
        int digit = 1;
        // 현재 자릿수의 시작값
        int start = 1;
        // 현재 자릿수의 끝값
        int end = 9;
        
        // 현재 자릿수의 범위가 N을 넘을 때까지 반복
        while (start <= N) {
            // 현재 자릿수에서의 숫자의 개수를 더하여 자릿수 계산
            length += (Math.min(end, N) - start + 1) * digit;
            // 다음 자릿수로 이동
            digit++;
            start *= 10;
            end = end * 10 + 9;
        }
        
        // 최종 결과 반환
        return length;
    }
    
}
