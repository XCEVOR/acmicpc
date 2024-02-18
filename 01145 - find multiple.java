import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 다섯 개의 자연수 입력 받기
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // MultipleFinder 객체 생성하여 적어도 대부분의 배수 찾기
        MultipleFinder multipleFinder = new MultipleFinder(numbers);
        int result = multipleFinder.findMultiple();
        
        // 결과 출력
        System.out.println(result);
    }
}

class MultipleFinder {
    private int[] numbers;
    
    // Constructor: 주어진 배열로 초기화
    public MultipleFinder(int[] numbers) {
        this.numbers = numbers;
    }
    
    // 적어도 대부분의 배수를 찾는 메서드
    public int findMultiple() {
        int multiple = 1; // 시작은 1부터
        while (true) {
            int count = 0;
            // 다섯 개의 수로 나누어 떨어지는지 검사
            for (int i = 0; i < 5; i++) {
                if (multiple % numbers[i] == 0) {
                    count++;
                }
            }
            // 적어도 3개의 수로 나누어지면 반복 중단
            if (count >= 3) {
                break;
            }
            multiple++; // 다음 배수로 이동
        }
        return multiple; // 적어도 대부분의 배수 반환
    }
}
