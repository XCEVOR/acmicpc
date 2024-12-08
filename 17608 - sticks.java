import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] heights = new int[N];
    
    for (int i = 0; i < N; i++) {
      heights[i] = sc.nextInt();
    }
    
    int visibleCount = countVisibleBars(heights);
    
    System.out.println(visibleCount);
  }
  
  private static int countVisibleBars(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    int count = 0;
    
    for (int i = heights.length - 1; i >= 0; i--) {
      if (stack.isEmpty() || heights[i] > stack.peek()) {
        count++;
        stack.push(heights[i]);
      }
    }
    
    return count;
  }
}
