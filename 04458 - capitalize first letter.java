import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt(); // 첫째 줄에 줄의 수 N을 입력
    sc.nextLine(); // 개행 문자 소비하여 다음 입력 준비
    
    // N개의 줄을 반복하여 입력
    for (int i = 0; i < N; i++) {
      String line = sc.nextLine(); // 각 줄의 문장을 입력
      String capitalizedLine = capitalizeFirstLetter(line); // 첫 글자를 대문자로 변환
      
      System.out.println(capitalizedLine); // 변환된 문장을 출력
    }
  }
  
  // 주어진 문자열의 첫 글자를 대문자로 변환하는 메소드
  private static String capitalizeFirstLetter(String line) {
    // 첫 글자를 대문자로 변환
    char firstChar = Character.toUpperCase(line.charAt(0));
    // 대문자로 변환된 첫 글자와 나머지 문자열을 결합하여 반환
    return firstChar + line.substring(1);
  }
}
