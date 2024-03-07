import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 수 입력
        int T = sc.nextInt();
        
        // 각 테스트 케이스에 대해 처리
        for (int t = 0; t < T; t++) {
            // 여행 횟수 입력
            int n = sc.nextInt();
            
            // AliceTripCounter 객체 생성
            AliceTripCounter tripCounter = new AliceTripCounter();
            
            // 각 여행에 대해 처리
            for (int i = 0; i < n; i++) {
                // 도시 이름 입력
                String city = sc.next();
                // 도시를 여행 기록에 추가
                tripCounter.addTrip(city);
            }
            
            // 여행한 도시의 수 출력
            System.out.println(tripCounter.countDistinctCities());
        }
    }
}

// Alice의 여행 기록을 관리하는 클래스
class AliceTripCounter {
    // 도시 방문 기록을 저장하는 해시맵
    private HashMap<String, Integer> visitedCities;
    
    // constructor
    public AliceTripCounter() {
        this.visitedCities = new HashMap<>();
    }
    
    // 새로운 여행을 기록하는 메서드
    public void addTrip(String city) {
        // 해당 도시를 방문한 것으로 기록
        visitedCities.put(city, 1);
    }
    
    // 여행한 도시의 수를 반환하는 메서드
    public int countDistinctCities() {
        // 방문한 도시의 수 반환
        return visitedCities.size();
    }
}
