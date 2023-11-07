import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // 테스트 케이스 수 입력
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();  // 시작 숫자 입력
            int M = sc.nextInt();  // 끝 숫자 입력
            
            int result = countZeros(N, M);  // countZeros 함수를 호출하여 0의 개수 계산
            
            System.out.println(result);  // 결과 출력
        }
    }
    
    // N부터 M까지의 수 중에서 0의 개수를 계산하는 함수
    public static int countZeros(int N, int M) {
        int count = 0;  // 0의 개수를 저장하는 변수 초기화
        
        for (int num = N; num <= M; num++) {
            int currentNum = num;  // 현재 숫자를 저장하는 변수
            if (currentNum == 0) {
                count++;  // 현재 숫자가 0이면 count를 증가
            } else {
                while (currentNum > 0) {
                    int digit = currentNum % 10;  // 현재 숫자의 마지막 자릿수
                    if (digit == 0) {
                        count++;  // 현재 자릿수가 0이면 count를 증가
                    }
                    currentNum /= 10;  // 다음 자릿수로 이동
                }
            }
        }
        
        return count;  // 0의 개수 반환
    }
    
}
