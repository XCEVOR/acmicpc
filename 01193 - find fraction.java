import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자로부터 X 값을 입력
        int x = sc.nextInt();
        
        // FractionFinder 객체를 생성
        FractionFinder fractionFinder = new FractionFinder();
        // findFraction 메서드를 호출하여 X번째 분수를 찾음
        String result = fractionFinder.findFraction(x);
        
        // 결과를 출력
        System.out.println(result);
    }
}

class FractionFinder {
    public String findFraction(int x) {
        // 현재 줄 번호를 1로 초기화
        int line = 1;
        
        // X가 현재 줄 번호보다 클 때까지 반복
        while (x > line) {
            // X에서 현재 줄 번호를 뺍
            x -= line;
            // 줄 번호를 1 증가
            line++;
        }
        
        // 현재 줄 번호가 짝수인 경우 분자/분모 형태로 분수를 반환
        if (line % 2 == 0) {
            return x + "/" + (line - x + 1);
        } else { // 현재 줄 번호가 홀수인 경우 분모/분자 형태로 분수를 반환
            return (line - x + 1) + "/" + x;
        }
    }
}
