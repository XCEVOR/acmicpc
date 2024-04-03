import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열의 길이 입력
        int L = sc.nextInt();
        // 문자열 입력
        String str = sc.next();
        
        // 해시 함수에 사용될 r과 M 값 정의
        int r = 31;
        long M = 1234567891;
        
        // 해시 값 초기화
        long hashValue = 0;
        // 문자열의 각 문자에 대해 해시 값 계산
        for (int i = 0; i < L; i++) {
            // 문자열에서 i번째 문자 가져오기
            char ch = str.charAt(i);
            
            // 알파벳 소문자를 1부터 26까지의 번호로 치환하여 값 계산
            long value = ch - 'a' + 1;
            
            // 각 항에 해당하는 값에 r^i를 곱하여 해시값에 더하고 M으로 나눈 나머지를 취함
            hashValue = (hashValue + (value * pow(r, i, M))) % M;
        }
        
        // 계산된 해시 값 출력
        System.out.println(hashValue);
    }
    
    // 거듭제곱을 빠르게 계산하는 메서드
    public static long pow(long x, long y, long p) {
        // 결과 값 초기화
        long res = 1;
        // x를 p로 나눈 나머지 구함
        x %= p;
        
        // y가 0보다 클 때까지 반복
        while (y > 0) {
            // y의 가장 낮은 비트가 1인 경우에만 해당 항을 결과에 곱함
            if ((y & 1) == 1)
                res = (res * x) % p;
            // y를 오른쪽으로 1 비트씩 이동하여 거듭제곱을 계산
            y >>= 1;
            // x를 제곱하여 다음 항을 구함
            x = (x * x) % p;
        }
        
        return res;
    }
}
