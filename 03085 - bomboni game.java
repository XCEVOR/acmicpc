import java.util.Scanner;

public class Main {
  static char[][] board; // 게임 보드를 저장할 2차원 배열
  static int N; // 보드의 크기 (N x N)
  static int maxCandies; // 최대 사탕 개수

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    N = sc.nextInt(); // 보드의 크기 N 입력
    board = new char[N][N]; // N x N 크기의 보드 초기화
    
    // 보드에 사탕 색상 입력
    for (int i = 0; i < N; i++) {
      board[i] = sc.next().toCharArray(); // 각 행을 문자 배열로 변환
    }
    
    // 모든 인접한 두 칸을 교환하여 최대 사탕 개수 계산
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        // 오른쪽 칸과 교환
        if (j + 1 < N) {
          swapAndCalculate(i, j, i, j + 1);
        }
        // 아래쪽 칸과 교환
        if (i + 1 < N) {
          swapAndCalculate(i, j, i + 1, j);
        }
      }
    }
    
    // 최대 사탕 개수 출력
    System.out.println(maxCandies);
  }
  
  // 두 칸의 사탕을 교환하고 최대 사탕 개수를 계산하는 메서드
  private static void swapAndCalculate(int x1, int y1, int x2, int y2) {
    // 사탕 교환
    char temp = board[x1][y1]; // 첫 번째 칸의 사탕 저장
    board[x1][y1] = board[x2][y2]; // 두 번째 칸의 사탕을 첫 번째 칸으로 이동
    board[x2][y2] = temp; // 저장한 첫 번째 칸의 사탕을 두 번째 칸으로 이동
    
    // 최대 사탕 개수 계산 후 업데이트
    int currentMax = Math.max(countMaxCandies(), countMaxCandies());
    maxCandies = Math.max(maxCandies, currentMax);
    
    // 원래 상태로 복구
    board[x2][y2] = board[x1][y1]; // 두 번째 칸 복구
    board[x1][y1] = temp; // 첫 번째 칸 복구
  }
  
  // 보드에서 최대 사탕 개수를 세는 메서드
  private static int countMaxCandies() {
    int maxCount = 1; // 최대 연속 사탕 개수 초기화
    
    // 가로 방향에서 연속된 사탕 개수 세기
    for (int i = 0; i < N; i++) {
      int count = 1; // 연속된 사탕 개수 초기화
      for (int j = 1; j < N; j++) {
        if (board[i][j] == board[i][j - 1]) { // 현재 사탕과 이전 사탕이 같으면
          count++; // 연속 개수 증가
        } else {
          maxCount = Math.max(maxCount, count); // 최대 개수 업데이트
          count = 1; // 연속 개수 초기화
        }
      }
      maxCount = Math.max(maxCount, count); // 마지막 연속 개수 체크
    }
    
    // 세로 방향에서 연속된 사탕 개수 세기
    for (int j = 0; j < N; j++) {
      int count = 1; // 연속된 사탕 개수 초기화
      for (int i = 1; i < N; i++) {
        if (board[i][j] == board[i - 1][j]) { // 현재 사탕과 이전 사탕이 같으면
          count++; // 연속 개수 증가
        } else {
          maxCount = Math.max(maxCount, count); // 최대 개수 업데이트
          count = 1; // 연속 개수 초기화
        }
      }
      maxCount = Math.max(maxCount, count); // 마지막 연속 개수 체크
    }
    
    return maxCount; // 최대 연속 사탕 개수 반환
  }
}
