import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
        
        int N = sc.nextInt();  // 문제 개수 입력
        
        solveProblems(N, sc);  // 문제 해결 메서드 호출
    }
    
    // 주어진 문제를 해결하고 결과를 출력하는 메서드
    public static void solveProblems(int N, Scanner sc) {
        for (int i = 0; i < N; i++) {
            String problem = sc.next();  // 문제 입력
            
            if (problem.equals("P=NP")) {  // 문제가 "P=NP"인 경우
                System.out.println("skipped");  // skipped 출력
            } else {
                int result = solveAdditionProblem(problem);  // 덧셈 문제 해결
                
                System.out.println(result);  // 결과 출력
            }
        }
    }
    
    // 덧셈 문제를 해결하는 메서드
    public static int solveAdditionProblem(String problem) {
        String[] numbers = problem.split("\\+");  // "+"를 기준으로 숫자 분리
        int a = Integer.parseInt(numbers[0]);  // 첫 번째 숫자
        int b = Integer.parseInt(numbers[1]);  // 두 번째 숫자
        
        return a + b;  // 덧셈 결과 반환
    }
}
