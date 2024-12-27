import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // 입력된 문자열을 공백으로 나누어 각 막대기의 길이로 변환
    String[] input = br.readLine().split(" ");
    int a = Integer.parseInt(input[0]); // 첫 번째 막대기의 길이
    int b = Integer.parseInt(input[1]); // 두 번째 막대기의 길이
    int c = Integer.parseInt(input[2]); // 세 번째 막대기의 길이
    
    // 막대기로 만들 수 있는 삼각형의 유형을 판단하여 결과 출력
    System.out.println(determineTriangleType(a, b, c));
  }
  
  // 주어진 막대기의 길이에 따라 삼각형의 유형을 판단하는 메서드
  private static int determineTriangleType(int a, int b, int c) {
    // 정삼각형 조건: 세 막대기의 길이가 모두 같은 경우
    boolean isEquilateral = (a == b) && (b == c);
    
    // 직각삼각형 조건: 피타고라스의 정리를 이용하여 직각삼각형인지 판단
    boolean isRight = (a * a + b * b == c * c) ||  // a와 b가 직각을 이루는 경우
                      (a * a + c * c == b * b) ||  // a와 c가 직각을 이루는 경우
                      (b * b + c * c == a * a);    // b와 c가 직각을 이루는 경우
    
    // 결과에 따라 반환
    if (isEquilateral) {
      return 2; // 정삼각형만 가능
    } else if (isRight) {
      return 1; // 직각삼각형만 가능
    } else {
      return 0; // 두 삼각형 모두 불가능
    }
  }
}
