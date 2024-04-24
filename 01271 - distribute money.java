import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 가진 돈(n)과 생명체의 수(m)를 입력
        BigDecimal n = sc.nextBigDecimal();
        BigDecimal m = sc.nextBigDecimal();
        
        // distributeMoney 함수를 호출하여 돈을 분배하고 남는 돈을 계산
        BigDecimal[] result = distributeMoney(n, m);
        
        // 생명체 하나에게 돌아가는 돈과 남는 돈을 출력
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    
    // 생명체들에게 돈을 분배하고 남는 돈을 계산하는 메서드
    private static BigDecimal[] distributeMoney(BigDecimal n, BigDecimal m) {
        BigDecimal[] result = new BigDecimal[2];
        
        // 돈을 분배하여 생명체 하나에게 돌아가는 돈 계산
        result[0] = n.divide(m, 0, BigDecimal.ROUND_DOWN);
        
        // 남는 돈 계산
        result[1] = n.remainder(m);
        
        return result;
    }
}
