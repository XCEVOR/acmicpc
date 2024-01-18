import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();  // X사의 1리터당 요금
        int B = sc.nextInt();  // Y사의 기본요금
        int C = sc.nextInt();  // Y사의 기본요금이 되는 사용량의 상한
        int D = sc.nextInt();  // Y사의 1리터 당 추가요금
        int P = sc.nextInt();  // JOI군의 집에서 사용하는 한 달간 수도의 양
        
        int xBill = A * P;  // X사의 요금 계산
        
        int yBill = (P <= C) ? B : B + (P - C) * D;  // Y사의 요금 계산
        
        int minBill = Math.min(xBill, yBill);  // 더 저렴한 수도회사 선택
        
        System.out.println(minBill);  // 결과 출력
    }
}
