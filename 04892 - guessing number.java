import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int caseNumber = 1; // 테스트 케이스 번호 초기화
        
        while (true) {
            int n0 = sc.nextInt(); // n0 입력 받기
            if (n0 == 0) { // 입력이 0이면 반복문 종료
                break;
            }
            
            String n1Type = checkN1(n0); // n1이 홀수인지 짝수인지 판별
            int n4 = calculateN4(n0); // n4 계산
            
            System.out.println(caseNumber + ". " + n1Type + " " + n4); // 결과 출력
            caseNumber++; // 테스트 케이스 번호 증가
        }
    }
    
    // n1이 홀수인지 짝수인지 판별하는 함수
    public static String checkN1(int n0) {
        int n1 = 3 * n0;
        if (n1 % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
    
    // n4를 계산하는 함수
    public static int calculateN4(int n0) {
        int n1 = 3 * n0;
        int n2;
        if (n1 % 2 == 0) {
            n2 = n1 / 2;
        } else {
            n2 = (n1 + 1) / 2;
        }
        int n3 = 3 * n2;
        int n4 = n3 / 9;
        return n4;
    }
    
}
