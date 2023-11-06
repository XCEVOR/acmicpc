import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();  // 테스트 케이스의 개수를 입력
        
        for (int i = 0; i < testCase; i++) {  // 각 테스트 케이스에 대해 반복
            int[] numbers = new int[7];  // 7개의 자연수를 저장하는 배열
            
            // 7개의 자연수를 입력받아 배열에 저장
            for (int j = 0; j < 7; j++) {
                numbers[j] = sc.nextInt();
            }
            
            // 짝수의 합과 최솟값을 계산하는 함수 호출
            int[] result = calculateEvenSumAndMin(numbers);
            
            // 결과 출력
            System.out.println(result[0] + " " + result[1]);
        }
    }
    
    static int[] calculateEvenSumAndMin(int[] numbers) {
        int sumOfEvens = 0;  // 짝수의 합을 저장하는 변수
        int minEven = 100;  // 최솟값을 저장하는 변수 (초기값 100)
        
        for (int number : numbers) {  // 배열의 각 숫자에 대해 반복
            if (number % 2 == 0) {  // 현재 숫자가 짝수인 경우
                sumOfEvens += number;  // 짝수의 합에 현재 숫자를 더함
                minEven = Math.min(minEven,  number);  // 최솟값 업데이트
            }
        }
        
        int[] result = { sumOfEvens, minEven };  // 계산된 짝수의 합과 최솟값을 배열로 반환
        return result;
    }
    
}
