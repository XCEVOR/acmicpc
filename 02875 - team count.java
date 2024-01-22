import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 여학생 수 입력
        int N = sc.nextInt();
        
        // 남학생 수 입력
        int M = sc.nextInt();
        
        // 인턴쉽에 참여해야 하는 인원 수 입력
        int K = sc.nextInt();
        
        // 팀의 개수 초기화
        int teamCount = 0;
        
        // 여학생이 2명 이상이고, 남학생이 1명 이상이며, 팀을 만들 수 있는 인원이 존재하는 경우 반복
        while (N >= 2 && M >= 1 && N + M >= K + 3) {
            N -= 2;
            M -= 1;
            
            teamCount++;
        }
        
        // 만들 수 있는 최대 팀의 개수 출력
        System.out.println(teamCount);
    }
}
