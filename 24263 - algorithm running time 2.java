import java.util.Scanner;

public class Main {
    
    // 단일 for문의 수행 횟수와 수행 시간(시간복잡도)를 출력하는 문제.
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(n);  // MenOfPassion 실행은 n 에 비례
        System.out.println(1);  // 수행 시간은 항상 1
    }
    
    // MenOfPassion 알고리즘은 다음과 같다.
    private static int menOfPassion(int A[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + A[i];
        }
        
        return sum;
    }
    
}
