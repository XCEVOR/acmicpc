import java.util.Scanner;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];
        
        // 10개의 자연수 입력 받기
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 평균을 계산하기 위한 AverageCalculator 객체 생성
        AverageCalculator averageCalculator = new AverageCalculator();
        // 평균 계산
        double average = averageCalculator.calculateAverage(numbers);
        
        // 최빈값을 계산하기 위한 ModeCalculator 객체 생성
        ModeCalculator modeCalculator = new ModeCalculator();
        // 최빈값 계산
        int mode = modeCalculator.calculateMode(numbers);
        
        // 평균 출력 (소수 부분은 자연수로 변환하여 출력)
        System.out.println((int)average);
        // 최빈값 출력
        System.out.println(mode);
    }
    
}

class AverageCalculator {
    // 배열의 평균을 계산하는 메서드
    public double calculateAverage(int[] numbers) {
        int sum = 0;
        
        // 배열의 모든 원소를 합산
        for (int number : numbers) {
            sum += number;
        }
        // 평균 반환 (소수 부분을 유지하기 위해 double 형태로 반환)
        return (double)sum/ numbers.length;
    }
}

class ModeCalculator {
    // 배열에서 최빈값을 계산하는 메서드
    public int calculateMode(int[] numbers) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;
        
        // 각 숫자의 빈도수를 저장하고 최빈값을 찾음
        for (int number : numbers) {
            // 'put' 메서드를 사용하여 해당 숫자를 맵에 추가하고, 빈도수를 1 증가
            // 만약 맵에 해당 숫자가 없으면, 'getOrDefault' 메서드로 기본값 0을 사용하여 빈도수 1로 초기화
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
            // 'frequency' 변수에 현재 숫자의 빈도수를 저장
            int frequency = frequencyMap.get(number);
            
            // 현재 숫자의 빈도수가 최대 빈도수보다 큰 경우, 새로운 최빈값으로 업데이트
            if ( frequency > maxFrequency) {
                // 'maxFrequency'에 최대 빈도수를 업데이트
                maxFrequency = frequency;
                // 'mode'에 현재 숫자를 최빈값으로 설정
                mode = number;
            }
        }
        // 최빈값 반환
        return mode;
    }
}
