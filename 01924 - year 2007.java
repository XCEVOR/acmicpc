import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int year = 2007;
        int x = sc.nextInt();  // x월
        int y = sc.nextInt();  // y일

        String result = findWhatDayOfTheWeek(year, x, y);
        
        System.out.println(result);  // 요일 출력
    }
    
    public static String findWhatDayOfTheWeek(int year, int x, int y) {
        // 1월과 2월은 이전 연도의 13월과 14월로 간주
        if (x == 1 || x == 2) {
            x += 12;
            year -= 1;
        }

        // Zeller's Congruence를 사용하여 요일 계산
        int z = (y + (13 * (x + 1) / 5) + year + (year / 4) - (year / 100) + (year / 400)) % 7;

        // 요일을 숫자에서 문자열로 변환
        String dayOfWeek = "";
        switch (z) {
            case 0:
                dayOfWeek = "SAT";
                break;
            case 1:
                dayOfWeek = "SUN";
                break;
            case 2:
                dayOfWeek = "MON";
                break;
            case 3:
                dayOfWeek = "TUE";
                break;
            case 4:
                dayOfWeek = "WED";
                break;
            case 5:
                dayOfWeek = "THU";
                break;
            case 6:
                dayOfWeek = "FRI";
                break;
        }
        
        return dayOfWeek;
    }
    
}
