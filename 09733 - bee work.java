import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 각 작업 횟수를 추적할 해시맵 초기화
        HashMap<String, Integer> workCounts = initializeWorkCounts();
        
        // 입력 처리 및 총 작업 수 계산
        int total = processInput(sc, workCounts);
        
        // 각 작업의 비율을 계산하고 출력
        printWorkRatios(workCounts, total);
    }
    
    // 각 작업의 횟수를 추적하는 해시맵을 초기화하는 메서드
    private static HashMap<String, Integer> initializeWorkCounts() {
        // 해시맵 생성
        HashMap<String, Integer> workCounts = new HashMap<>();
        
        // 각 작업 키와 초기 값 설정
        workCounts.put("Re", 0);
        workCounts.put("Pt", 0);
        workCounts.put("Cc", 0);
        workCounts.put("Ea", 0);
        workCounts.put("Tb", 0);
        workCounts.put("Cm", 0);
        workCounts.put("Ex", 0);
        
        return workCounts;
    }
    
    // 입력을 처리하고 총 작업 수를 반환하는 메서드
    private static int processInput(Scanner sc, HashMap<String, Integer> workCounts) {
        // 총 작업 수를 저장할 변수 초기화
        int total = 0;
        
        // 입력이 있는 동안 반복
        while (sc.hasNextLine()) {
            // 한 줄씩 입력 받음
            String line = sc.nextLine();
            // 빈 줄을 만나면 입력 종료
            if (line.isEmpty()) {
                break;
            }
            // 공백을 기준으로 작업 분리
            String[] works = line.split(" ");
            // 각 작업의 횟수를 해시맵에 업데이트하고 총 작업 수 증가
            for (String work : works) {
                workCounts.put(work, workCounts.getOrDefault(work, 0) + 1);
                total++;
            }
        }
        
        return total;
    }
    
    // 각 작업의 비율을 계산하고 출력하는 메서드
    private static void printWorkRatios(HashMap<String, Integer> workCounts, int total) {
        // 각 작업 키를 순회하며 비율 계산 및 출력
        for (String key : Arrays.asList("Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex")) {
            // 각 작업의 횟수
            int count = workCounts.getOrDefault(key, 0);
            // 작업의 비율 계산
            double ratio = (double) count / total;
            // 출력
            System.out.printf("%s %d %.2f\n", key, count, ratio);
        }
        
        // 총 작업 수와 비율 1.00 출력
        System.out.printf("Total %d 1.00", total);
    }
}
