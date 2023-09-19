import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력으로 M과 N을 받음
        int M = sc.nextInt(); // M은 범위의 시작 값
        int N = sc.nextInt(); // N은 범위의 끝 값
        
        // 합과 최소 완전제곱수를 초기화
        int sum = 0;
        int minPerfectSquare = -1;
        
        // M부터 N까지의 범위에서 완전제곱수를 찾음
        for (int i = M; i <= N; i++) {
            int sqrt = (int) Math.sqrt(i); // i의 제곱근을 계산
            if (sqrt * sqrt == i) { // i가 완전제곱수인 경우
                if (minPerfectSquare == -1) {
                    minPerfectSquare = i; // 첫 번째 완전제곱수를 찾으면 최솟값으로 설정
                }
                sum += i; // 완전제곱수를 합에 추가
            }
        }
        
        // 완전제곱수가 없을 경우 -1을 출력, 아닌 경우 합과 최솟값을 출력
        if (minPerfectSquare == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPerfectSquare);
        }
    }
    
}
