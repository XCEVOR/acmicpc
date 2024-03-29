import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 채팅 기록의 수를 입력
        int N = sc.nextInt(); 
        
        // 곰곰티콘을 사용한 사용자들을 저장할 HashSet 생성
        HashSet<String> gomGomUsers = new HashSet<>();
        
        // 곰곰티콘 사용 횟수 계산
        int totalGomGomCount = countGomGom(N, sc, gomGomUsers);
        
        // 결과 출력
        System.out.println(totalGomGomCount);
    }
    
    // 곰곰티콘 사용 횟수를 계산하는 메서드
    private static int countGomGom(int N, Scanner sc, HashSet<String> gomGomUsers) {
        // 총 곰곰티콘 사용 횟수를 저장할 변수 초기화
        int totalGomGomCount = 0;
        
        // 채팅 기록의 수만큼 반복하여 채팅 내용을 처리
        for (int i = 0; i < N; i++) {
            // 입력 받은 문자열을 변수에 저장
            String input = sc.next();
            
            if (input.equals("ENTER")) {
                // 만약 입력이 "ENTER"이면
                // 이미 인사한 사람들의 수를 더함
                totalGomGomCount += gomGomUsers.size();
                // 인사한 사람들 초기화
                gomGomUsers.clear();
            } else {
                // "ENTER"가 아닌 경우, 즉 채팅을 입력한 경우
                // 인사한 사람을 HashSet에 추가
                gomGomUsers.add(input);
            }
        }
        
        // 마지막으로 인사한 사람들의 수를 더함
        totalGomGomCount += gomGomUsers.size();
        
        // 총 곰곰티콘 사용 횟수 반환
        return totalGomGomCount;
    }
}
