import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cookingTime = sc.nextInt();

        String result = calcTheTimeAfterCooking(hour, minute, cookingTime);

        System.out.print(result);
    }
    
    public static String calcTheTimeAfterCooking(int hour, int minute, int cookingTime) {
        int totalMinute = hour * 60 + minute;
        int newMinute = (totalMinute + cookingTime) % 1440;  // 24 * 60 = 1440
        int newHour = newMinute / 60;
        int newMinuteRemainder = newMinute % 60;
        return newHour + " " + newMinuteRemainder;
    }
    
}
