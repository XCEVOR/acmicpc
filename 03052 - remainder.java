import java.util.Scanner;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 나머지 값과 그 값의 빈도를 저장하는 해시맵을 생성
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        
        // 10번 반복문
        for (int i = 0; i < 10; i++) {
            // 사용자로부터 정수를 입력받아서 변수 number에 저장
            int number = scanner.nextInt();
            
            // 입력받은 정수를 42로 나눈 나머지를 계산하여 변수 remainder에 저장
            int remainder = number % 42;
            
            // 해시맵에 나머지 값을 키로 사용하여 빈도를 기록
            // 나머지 값이 이미 해시맵에 존재하면 해당 키의 값을 가져와 1을 더하고,
            // 없으면 기본값 0을 사용하고 0에 1을 더한 값을 저장
            remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
        }
        
        // 해시맵의 크기를 출력하여 서로 다른 나머지 값의 개수를 표시
        System.out.println(remainderMap.size());

    }
    
}
