import java.util.Scanner;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수를 입력
        int T = sc.nextInt();
        
        // 테스트 케이스 개수만큼 반복
        for (int t = 0; t < T; t++) {
            // 방의 개수를 입력
            int n = sc.nextInt(); 
            // 방의 상태를 저장할 해시맵
            HashMap<Integer, Boolean> rooms = new HashMap<>();
            
            // 모든 방을 처음에 닫힌 (false) 상태로 초기화
            for (int i = 1; i <= n; i++) {
                rooms.put(i, false);
            }
            
            // 라운드 진행
            for (int round = 1; round <= n; round++) {
                // 해당 라운드에서 문을 열거나 닫음
                for (int room = round; room <= n; room += round) {
                    boolean isOpen = rooms.get(room);
                    rooms.put(room, !isOpen);
                }
            }
            
            int escapedStudents = 0;
            // 탈출한 학생 수 계산
            for (boolean isOpen : rooms.values()) {
                // 문이 열린 (true) 상태인 경우
                if (isOpen) {
                    escapedStudents++;
                }
            }
            
            // 탈출한 학생 수 출력
            System.out.println(escapedStudents); 
        }
    }
    
}
