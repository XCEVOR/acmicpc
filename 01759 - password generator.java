import java.util.Scanner;
import java.util.Arrays;

public class Main {
  static int L, C;  // L: 암호의 길이, C: 주어진 문자 수
  static char[] characters;  // 주어진 문자를 저장할 배열
  static StringBuilder result = new StringBuilder();  // 결과를 저장할 StringBuilder

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    L = sc.nextInt();  // 암호의 길이 L을 입력 받음
    C = sc.nextInt();  // 주어진 문자 수 C를 입력 받음

    characters = new char[C];  // C개의 문자를 저장할 배열 초기화
    for (int i = 0; i < C; i++) {  // C개의 문자를 입력 받음
      characters[i] = sc.next().charAt(0);  // 각 문자를 배열에 저장
    }

    Arrays.sort(characters);  // 입력된 문자를 사전식으로 정렬

    generatePassword(0, 0, "", 0, 0);  // 암호 생성 메서드 호출

    System.out.print(result.toString());  // 생성된 암호를 출력
  }

  // 재귀적으로 가능한 암호를 생성하는 메서드
  static void generatePassword(int index, int length, String current, int vowelCount, int consonantCount) {
    if (length == L) {
    // 현재 길이가 L에 도달한 경우
      if (vowelCount >= 1 && consonantCount >= 2) {
      // 최소 한 개의 모음과 두 개의 자음이 포함된 경우
        result.append(current).append("\n");  // 결과에 현재 조합을 추가
      }
      return; // 함수 종료
    }

    // 가능한 문자 조합 생성
    for (int i = index; i < C; i++) {  // 현재 인덱스부터 C까지 반복
      char ch = characters[i];  // 현재 문자를 선택
      if (isVowel(ch)) {  // 현재 문자가 모음인지 확인
      // 모음인 경우, 모음 카운트를 증가시켜 재귀 호출
        generatePassword(i + 1, length + 1, current + ch, vowelCount + 1, consonantCount);
      } else {
      // 자음인 경우, 자음 카운트를 증가시켜 재귀 호출
        generatePassword(i + 1, length + 1, current + ch, vowelCount, consonantCount + 1);
      }
    }
  }

  // 주어진 문자가 모음인지 확인하는 함수
  static boolean isVowel(char ch) {
    // 모음의 경우 true, 그렇지 않으면 false 반환
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }
}
