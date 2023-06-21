import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 시와 분 입력 받기
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        
        // 45분을 뺀 시간 계산
        String result = calcTheTime45MinAgo(hour, minute);
        
        // 결과 출력
        System.out.print(result);
    }
    
    public static String calcTheTime45MinAgo(int hour, int minute) {
        if (minute >= 45) {
            minute -= 45;
        } else {
            minute += 15;
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
        }
        return hour + " " + minute;
    }
    
}
