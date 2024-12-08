import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 막대기의 개수를 입력
    int N = sc.nextInt();
    int[] heights = new int[N]; // 막대기의 높이를 저장할 배열
    
    // 각 막대기의 높이를 입력받아 배열에 저장
    for (int i = 0; i < N; i++) {
      heights[i] = sc.nextInt();
    }
    
    // 보이는 막대기의 개수를 계산
    int visibleCount = countVisibleBars(heights);
    
    // 결과 출력
    System.out.println(visibleCount);
  }
  
  // 오른쪽에서 보이는 막대기의 개수를 계산하는 메서드
  private static int countVisibleBars(int[] heights) {
    Stack<Integer> stack = new Stack<>(); // 막대기의 높이를 저장할 스택
    int count = 0; // 보이는 막대기의 개수 카운트
    
    // 막대를 오른쪽에서 왼쪽으로 확인
    for (int i = heights.length - 1; i >= 0; i--) {
      // 스택이 비어 있거나 현재 막대기가 스택의 top보다 높으면 보이는 막대기
      if (stack.isEmpty() || heights[i] > stack.peek()) {
        count++; // 보이는 막대기 개수 증가
        stack.push(heights[i]); // 현재 막대기의 높이를 스택에 추가
      }
    }
    
    // 보이는 막대기의 개수를 반환
    return count;
  }
}
