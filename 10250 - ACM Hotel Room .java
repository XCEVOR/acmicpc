import java.util.Scanner;

public class HotelRoom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 테스트 케이스 수 입력
    int T = sc.nextInt();
    
    // 테스트 케이스 수만큼 반복
    for (int i = 0; i < T; i++) {
      // 호텔 층 수, 각 층의 방 수, 손님 번호 입력
      int H = sc.nextInt();
      int W = sc.nextInt();
      int N = sc.nextInt();
      
      // 방 번호 계산
      int roomNumber = calculateRoomNumber(H, W, N);
      
      // 방 번호 출력
      System.out.println(roomNumber);
    }
  }

  // 방 번호 계산 메서드
  private static int calculateRoomNumber(int H, int W, int N) {
    // 층 번호 계산
    int floor = (N - 1) % H + 1;
    
    // 방 번호 계산
    int room = (N - 1) / H + 1;
    
    // 방 번호 반환
    return floor * 100 + room;
  }
}
