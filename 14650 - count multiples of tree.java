import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();
        
        // 0으로 시작하는 수는 만들 수 없으므로 첫 번째 자리는 1 또는 2만 가능
        long count = countValidMultiples(N, 1) + countValidMultiples(N, 2);
        
        System.out.println(count);
    }

    // 재귀 함수를 사용하여 가능한 N자리 3의 배수를 생성하고 세는 함수
    private static long countValidMultiples(int N, int currentNumber) {
        if (N == 1) {
            // 마지막 자리에 도달한 경우 3의 배수인지 확인하고 3의 배수면 1을 반환, 아니면 0 반환
            return (currentNumber % 3 == 0) ? 1 : 0;
        }
        
        long totalCount = 0;
        // 현재 숫자 뒤에 0, 1, 2를 붙여가며 재귀 호출
        for (int nextDigit = 0; nextDigit <= 2; nextDigit++) {
            int nextNumber = currentNumber * 10 + nextDigit;
            totalCount += countValidMultiples(N - 1, nextNumber);
        }
        
        return totalCount;
    }
}
