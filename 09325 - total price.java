import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();  // 테스트 케이스의 개수 입력
        
        // 각 테스트 케이스에 대한 반복문
        for (int i = 0; i < testCases; i++) {
            int sCar = sc.nextInt();  // 자동차의 가격 입력
            
            int nOption = sc.nextInt();  // 옵션의 개수 입력
            
            int total = sCar;  // 초기 가격은 자동차의 가격으로 설정
            
            // 각 옵션에 대한 반복문
            for (int j = 0; j < nOption; j++) {
                int q = sc.nextInt();  // 옵션의 개수 입력
                int p = sc.nextInt();  // 옵션의 가격 입력
                
                total += q * p;  // 옵션을 추가하여 총 가격 계산
            }
            
            System.out.println(total);  // 최종 가격 출력
        }
    }
}
