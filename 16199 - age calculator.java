import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 생일 정보 입력
        String[] birthDateStr = sc.nextLine().split(" ");
        int birthYear = Integer.parseInt(birthDateStr[0]);
        int birthMonth = Integer.parseInt(birthDateStr[1]);
        int birthDay = Integer.parseInt(birthDateStr[2]);
        
        // 기준 날짜 정보 입력
        String[] currentDateStr = sc.nextLine().split(" ");
        int currentYear = Integer.parseInt(currentDateStr[0]);
        int currentMonth = Integer.parseInt(currentDateStr[1]);
        int currentDay = Integer.parseInt(currentDateStr[2]);
        
        // 만 나이 계산
        int ageInYears = currentYear - birthYear;
        // 현재 월이 생일 월보다 작거나, 현재 월이 생일 월과 같고 현재 일이 생일 일보다 작으면 한 살 빼기
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            ageInYears--;
        }
        
        // 세는 나이 계산
        int ageInKorean = currentYear - birthYear + 1;
        
        // 연 나이 계산
        int ageInYear = currentYear - birthYear;
        
        // 결과 출력
        System.out.println(ageInYears); // 만 나이 출력
        System.out.println(ageInKorean); // 세는 나이 출력
        System.out.println(ageInYear); // 연 나이 출력
    }
}
