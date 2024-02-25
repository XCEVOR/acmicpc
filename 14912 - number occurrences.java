import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 자연수 n과 한 자리 숫자 d 입력
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        // DigitCounter 객체 생성
        DigitCounter digitCounter = new DigitCounter(n, d);
        
        // 숫자 d의 빈도수 계산
        int count = digitCounter.countOccurrences();
        
        // 결과 출력
        System.out.println(count);
    }
}

// DigitCounter 클래스 선언
class DigitCounter {
    private int n;  // 범위의 상한값
    private int d;  // 찾고자 하는 숫자

    // constructor
    public DigitCounter(int n, int d) {
        this.n = n;
        this.d = d;
    }
    
    // 숫자 d의 빈도수를 계산하는 메서드
    public int countOccurrences() {
        int count = 0;  // 빈도수를 저장할 변수 초기화
        for (int i = 1; i <= n; i++) {  // 1부터 n까지 반복
            String numberAsString = String.valueOf(i);  // 현재 숫자를 문자열로 변환
            for (int j = 0; j < numberAsString.length(); j++) {  // 각 자리수를 검사
                if (numberAsString.charAt(j) - '0' == d) {  // 현재 자리수가 d와 일치하면
                    count++;  // 빈도수 증가
                }
            }
        }
        return count;  // 최종 빈도수 반환
    }
}
