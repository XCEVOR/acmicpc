import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int testCases = sc.nextInt();  // 테스트 케이스 수를 입력
    
    // 각 테스트 케이스에 대해 반복
    for (int t = 0; t < testCases; t++) {
      int n = sc.nextInt();  // 의상의 수를 입력
      sc.nextLine();  // 개행 문자 처리
      
      Map<String, Integer> clothesMap = new HashMap<>();  // 의상 종류와 개수를 저장할 HashMap 생성
      
      // 의상 정보를 입력받아 의상 종류별 개수를 카운트
      for (int i = 0; i < n; i++) {
        String[] input = sc.nextLine().split(" ");  // 의상 이름과 종류를 공백으로 나누어 입력
        String clothType = input[1];  // 의상 종류를 가져옴
        // 의상 종류의 개수를 증가시킴
        clothesMap.put(clothType, clothesMap.getOrDefault(clothType, 0) + 1);
      }
      
      // 의상 조합 수 계산
      int combinations = calculateCombinations(clothesMap);
      
      // 결과 출력
      System.out.println(combinations);
    }
  }
  
  // 의상 종류별 조합 수를 계산하는 메서드
  private static int calculateCombinations(Map<String, Integer> clothesMap) {
    int combinations = 1; // 조합 수를 계산하기 위한 변수, 기본값은 1로 설정
    
    // 각 의상 종류의 개수를 기반으로 조합 수 계산
    for (int count : clothesMap.values()) {
      combinations *= (count + 1); // 입지 않는 경우를 포함하기 위해 1을 더함
    }
    
    // 알몸이 아닌 경우의 수를 반환하기 위해 1을 빼고 반환
    return combinations - 1;
  }
}
