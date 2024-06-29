import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static char[][] map; // 별을 저장할 2차원 문자 배열

  public static void main(String[] args) throws IOException {
    // 입력을 받기 위한 BufferedReader 생성
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // 첫 줄에 입력된 N을 정수로 변환하여 저장
    int N = Integer.parseInt(br.readLine());
    
    // N x (2*N - 1) 크기의 2차원 배열을 생성
    map = new char[N][2 * N - 1];
    
    // 배열을 공백 문자로 초기화
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 2 * N - 1; j++) {
        map[i][j] = ' '; // 모든 위치에 공백 문자를 채움
      }
    }
    
    // 첫 번째 별 패턴을 그리기 위한 재귀 함수 호출
    drawStars(0, N - 1, N);
    
    // 출력 결과를 저장할 StringBuilder 생성
    StringBuilder sb = new StringBuilder();
    
    for (char[] line : map) {
      sb.append(line).append('\n'); // 각 줄을 StringBuilder에 추가
    }
    
    // 최종 결과 출력
    System.out.print(sb);
  }
  
  // 별을 그리는 재귀 함수
  private static void drawStars(int x, int y, int n) {
    if (n == 3) { // 기본 패턴인 높이 3의 삼각형을 그림
      map[x][y] = '*'; // 첫 번째 줄의 중앙
      map[x + 1][y - 1] = '*'; // 두 번째 줄의 왼쪽
      map[x + 1][y + 1] = '*'; // 두 번째 줄의 오른쪽
      map[x + 2][y - 2] = '*'; // 세 번째 줄의 가장 왼쪽
      map[x + 2][y - 1] = '*'; // 세 번째 줄의 왼쪽 두 번째
      map[x + 2][y] = '*'; // 세 번째 줄의 중앙
      map[x + 2][y + 1] = '*'; // 세 번째 줄의 오른쪽 두 번째
      map[x + 2][y + 2] = '*'; // 세 번째 줄의 가장 오른쪽
    } else {
      int m = n / 2; // 현재 삼각형을 반으로 나눈 크기
      drawStars(x, y, m); // 위쪽 중앙 삼각형
      drawStars(x + m, y - m, m); // 왼쪽 아래 삼각형
      drawStars(x + m, y + m, m); // 오른쪽 아래 삼각형
    }
  }
}



/*

예제 입력 1
24

예제 출력 1
                       *                        
                      * *                       
                     *****                      
                    *     *                     
                   * *   * *                    
                  ***** *****                   
                 *           *                  
                * *         * *                 
               *****       *****                
              *     *     *     *               
             * *   * *   * *   * *              
            ***** ***** ***** *****             
           *                       *            
          * *                     * *           
         *****                   *****          
        *     *                 *     *         
       * *   * *               * *   * *        
      ***** *****             ***** *****       
     *           *           *           *      
    * *         * *         * *         * *     
   *****       *****       *****       *****    
  *     *     *     *     *     *     *     *   
 * *   * *   * *   * *   * *   * *   * *   * *  
***** ***** ***** ***** ***** ***** ***** *****

*/
