import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = 0;
        
        while (true) {
            testCase++;
            
            int r = sc.nextInt();
            if (r == 0) break;
            
            int w = sc.nextInt();
            int l = sc.nextInt();
            
            boolean isPizzaFit = isPizzaFitOnTable(r, w, l);
            
            System.out.println("Pizza " 
                            + testCase 
                            + (isPizzaFit ? " fits on the table." : " does not fit on the table."));
        }
    }
    
    // 피자가 올라가는지 확인하는 메서드
    private static boolean isPizzaFitOnTable(int r, int w, int l) {
        // 대각선의 길이를 계산합니다.
        double diagonal = Math.sqrt(w * w + l * l);
        
        // 원의 지름과 대각선의 길이를 비교하여 피자가 식탁 위에 놓여질 수 있는지 판단합니다.
        return diagonal <= 2 * r;
    }
    
}
