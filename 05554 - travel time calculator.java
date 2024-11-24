import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int totalTimeInSeconds = getTotalTravelTime(sc);
    
    printTravelTime(totalTimeInSeconds);
  }

  private static int getTotalTravelTime(Scanner sc) {
    int timeToSchool = sc.nextInt();
    int timeToPCBang = sc.nextInt();
    int timeToAcademy = sc.nextInt();
    int timeToHome = sc.nextInt();
    
    return timeToSchool + timeToPCBang + timeToAcademy + timeToHome;
  }

  private static void printTravelTime(int totalTimeInSeconds) {
    int minutes = totalTimeInSeconds / 60;
    int seconds = totalTimeInSeconds % 60;
    
    System.out.println(minutes);
    System.out.println(seconds);
  }
}
