import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String inputdata = sc.next();
        
        int quotient = inputdata.length() / 10; // 문자의 길이를 10 으로 나눈 몫 저장.
        
        for (int i = 0; i < quotient; i++) { // 몫의 크기만큼 반복.
            String result = inputdata.substring(10 * i, 10 * i + 10); // 계산된 몫을 이용하여 10 개 묶음별 반복 출력.
            System.out.println(result); // 출력 형식에 맞추기 위해 출력하고 줄바꿈.
        }
        String result = inputdata.substring(10 * quotient); // 계산된 몫을 이용하여 10 개로 분리되지 않은 남은 문자 출력.
        System.out.print(result); // 출력 형식에 맞추기 위해 출력하고 줄바꿈 안함.
    }
    
}
