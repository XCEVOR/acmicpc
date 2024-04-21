import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // BigDecimal을 사용하여 정확한 소수 계산을 위한 입력
        BigDecimal A = sc.nextBigDecimal();
        BigDecimal B = sc.nextBigDecimal();
        
        // divide 함수를 사용하여 A를 B로 나눈 결과를 계산
        BigDecimal result = divide(A, B);
        
        // 결과 출력
        System.out.println(result);
    }
    
    // BigDecimal을 이용하여 정확한 소수 계산을 수행하는 divide 메서드
    private static BigDecimal divide(BigDecimal A, BigDecimal B) {
        // 10^-1000의 절대/상대 오차를 허용하기 위해 스케일 값을 1001로 설정하고 ROUND_DOWN 모드 사용
        return A.divide(B, 1001, BigDecimal.ROUND_DOWN);
    }
}
