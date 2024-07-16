import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 사용자로부터 음계 입력
    int[] notes = readInput();
    
    // 음계가 ascending, descending, mixed 중 어디에 해당하는지 판별
    String result = getResult(notes);
    
    // 결과 출력
    System.out.println(result);
  }
  
  private static int[] readInput() {
    Scanner scanner = new Scanner(System.in);
    
    // 8개의 음계를 저장할 배열 생성
    int[] notes = new int[8];
    
    // 사용자로부터 8개의 음계 입력
    for (int i = 0; i < 8; i++) {
      notes[i] = scanner.nextInt();
    }
    
    // 입력받은 음계 배열 반환
    return notes;
  }
  
  private static String getResult(int[] notes) {
    // 음계가 ascending인지 판별하는 변수
    boolean isAscending = true;
    
    // 음계가 descending인지 판별하는 변수
    boolean isDescending = true;
    
    // 음계가 ascending인지, descending인지 판별
    for (int i = 0; i < 7; i++) {
      if (notes[i] + 1 != notes[i + 1]) {
        isAscending = false;
      }
      if (notes[i] - 1 != notes[i + 1]) {
        isDescending = false;
      }
    }
    
    // 음계가 ascending, descending, mixed 중 어디에 해당하는지 결정
    if (isAscending) {
      return "ascending";
    } else if (isDescending) {
      return "descending";
    } else {
      return "mixed";
    }
  }
}
