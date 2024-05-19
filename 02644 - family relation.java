import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // 그래프를 표현하는 인접 리스트
    static ArrayList<Integer>[] graph;
    // 방문 여부를 저장하는 배열
    static boolean[] visited;
    // 촌수를 저장하는 변수, 초기값은 -1
    static int result = -1;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 전체 사람의 수를 입력받음
        int n = sc.nextInt();
        // 촌수를 계산해야 하는 두 사람의 번호를 입력받음
        int person1 = sc.nextInt();
        int person2 = sc.nextInt();
        // 부모 자식 간의 관계의 개수를 입력받음
        int m = sc.nextInt();
        
        // 그래프 초기화
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        
        // 각 사람을 정점으로 하는 리스트 생성
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 부모 자식 관계를 입력받아 그래프를 구성
        for (int i = 0; i < m; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();
            
            // 양방향 간선 추가
            graph[parent].add(child);
            graph[child].add(parent);
        }
        
        // DFS를 이용하여 두 사람 간의 촌수를 계산
        dfs(person1, person2, 0);
        
        // 결과 출력
        System.out.println(result);
    }
    
    // DFS를 이용한 촌수 계산 메서드
    private static void dfs(int current, int target, int count) {
        // 현재 정점을 이미 방문했으면 종료
        if (visited[current]) return;
        
        // 현재 정점을 방문 처리
        visited[current] = true;
        
        // 현재 정점이 목표 정점이면 촌수를 결과에 저장
        if (current == target) {
            result = count;
            return;
        }
        
        // 인접한 정점을 순회하며 DFS 탐색
        for (int neighbor : graph[current]) {
            if (!visited[neighbor]) {
                dfs(neighbor, target, count + 1);
            }
        }
    }
}
