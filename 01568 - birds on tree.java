import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();  // 입력으로 새의 수 N을 받음
        
        long time = calculateTimeToFly(N);  // calculateTimeToFly 함수를 호출하여 시간을 계산
        
        System.out.println(time);  // 결과를 출력
    }
    
    public static long calculateTimeToFly(long N) {
        long time = 0;  // 날아가는데 걸리는 시간을 저장할 변수
        long currentNumber = 1;  // 현재 노래해야 할 숫자
        long birdsOnTree = N;  // 나무에 앉아 있는 새의 수
        
        while (birdsOnTree > 0) {
            if (birdsOnTree >= currentNumber) {  // 나무에 앉아 있는 새의 수가 현재 노래해야 할 숫자 이상이면
                birdsOnTree -= currentNumber;  // 현재 노래해야 할 숫자만큼 새가 날아감
                currentNumber++;  // 다음 숫자로 이동
                time++;  // 시간 증가
            } else {
                currentNumber = 1;  // 나머지 새가 현재 숫자보다 적을 경우, 다시 1부터 시작
            }
        }
        
        return time;  // 계산된 시간 반환
    }
    
}
