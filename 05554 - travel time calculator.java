import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 총 이동 시간을 계산하기 위한 메서드를 호출
    int totalTimeInSeconds = getTotalTravelTime(sc);
    
    // 계산된 총 이동 시간을 분과 초로 출력하는 메서드를 호출
    printTravelTime(totalTimeInSeconds);
  }

  // 이동 시간을 입력받아 총 이동 시간을 초 단위로 계산하는 메서드
  private static int getTotalTravelTime(Scanner sc) {
    // 각 이동 시간(초 단위)을 입력
    int timeToSchool = sc.nextInt();  // 집에서 학교까지의 이동 시간
    int timeToPCBang = sc.nextInt();   // 학교에서 PC방까지의 이동 시간
    int timeToAcademy = sc.nextInt();  // PC방에서 학원까지의 이동 시간
    int timeToHome = sc.nextInt();     // 학원에서 집까지의 이동 시간
    
    // 모든 이동 시간을 합산하여 반환
    return timeToSchool + timeToPCBang + timeToAcademy + timeToHome;
  }

  // 총 이동 시간을 분과 초로 변환하여 출력하는 메서드
  private static void printTravelTime(int totalTimeInSeconds) {
    // 총 시간을 분과 초로 변환
    int minutes = totalTimeInSeconds / 60;  // 총 분
    int seconds = totalTimeInSeconds % 60;   // 총 초
    
    // 변환된 분과 초를 각각 출력
    System.out.println(minutes);
    System.out.println(seconds);
  }
}
