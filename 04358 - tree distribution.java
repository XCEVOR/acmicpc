import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TreeCounter 객체를 생성
        TreeCounter treeCounter = new TreeCounter();
        
        // countTrees 메서드를 호출하여 입력된 나무의 종을 세고 저장
        treeCounter.countTrees(sc);
        
        // displayDistribution 메서드를 호출하여 나무의 분포를 출력
        treeCounter.displayDistribution();
    }
}

// TreeCounter 클래스 정의
class TreeCounter {
    // TreeMap을 사용하여 나무의 종을 저장하고 해당 나무의 개수를 저장할 변수를 정의
    private TreeMap<String, Integer> treeCount;
    // 전체 나무 개수를 저장할 변수를 정의
    private int totalTrees;
    
    // constructor
    public TreeCounter() {
        // TreeMap과 totalTrees 변수를 초기화
        treeCount = new TreeMap<>();
        totalTrees = 0;
    }
    
    // 입력된 나무의 종을 세는 메서드
    public void countTrees(Scanner sc) {
        // 입력이 더 이상 없을 때까지 반복
        while (sc.hasNextLine()) {
            // 한 줄씩 나무 입력
            String treeName = sc.nextLine();
            
            // TreeMap에 나무의 종을 저장하고 해당 나무의 개수를 증가
            treeCount.put(treeName, treeCount.getOrDefault(treeName, 0) + 1);
            // 전체 나무의 개수를 증가
            totalTrees++;
        }
    }
    
    // 나무의 분포를 출력하는 메서드
    public void displayDistribution() {
        // TreeMap에 저장된 각각의 나무의 종에 대해 반복
        for (Map.Entry<String, Integer> entry : treeCount.entrySet()) {
            // 나무의 종과 해당 나무의 개수를 가져옴
            String treeName = entry.getKey();
            int count = entry.getValue();
            
            // 해당 나무의 분포를 계산
            double percentage = (double) count / totalTrees * 100;
            
            // 나무의 종과 해당 나무의 분포를 출력
            System.out.printf("%s %.4f\n", treeName, percentage);
        }
    }
}
