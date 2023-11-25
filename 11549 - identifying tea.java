import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 차의 종류를 나타내는 정수 T
        int count = 0; // 정답을 맞춘 참가자의 수를 저장하는 변수
        
        for (int i = 0; i < 5; i++) {
            int answer = sc.nextInt(); // 참가자의 답변을 입력
            
            if (answer == T) {
                count++;
            }
        }
        
        System.out.println(count); // 정답을 맞춘 참가자의 수 출력
    }
}
