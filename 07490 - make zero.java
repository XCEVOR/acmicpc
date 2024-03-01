import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수 입력
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            // 자연수 N 입력
            int N = sc.nextInt();
            
            // ZeroMaker 객체 생성
            ZeroMaker zeroMaker = new ZeroMaker(N);
            
            // 수식 생성
            zeroMaker.generateExpressions();
            
            // ASCII 순서대로 결과 출력
            zeroMaker.printResultsInAsciiOrder();
            System.out.println();
        }
    }
}

class ZeroMaker {
    private int[] arr;
    private int N;
    private ArrayList<String> results;
    
    public ZeroMaker(int N) {
        this.N = N;
        this.arr = new int[N];
        this.results = new ArrayList<>();
        // 수열 초기화
        for (int i = 0; i < N; i++) {
            this.arr[i] = i + 1;
        }
    }
    
    // 수식 생성 메서드
    public void generateExpressions() {
        dfs(1, 0, arr[0], String.valueOf(arr[0]));
    }
    
    // ASCII 순서대로 결과 출력 메서드
    public void printResultsInAsciiOrder() {
        Collections.sort(results);
        
        for (String result : results) {
            System.out.println(result);
        }
    }
    
    // DFS를 통한 모든 수식 탐색 메서드
    private void dfs(int index, int sum, int prevNum, String str) {
        if (index == N) {
            if (sum + prevNum == 0) {
                results.add(str);
            }
            return;
        }
        
        // 현재 숫자를 '+'로 처리하는 경우
        dfs(index + 1, sum + prevNum, arr[index], str + "+" + arr[index]);
        // 현재 숫자를 '-'로 처리하는 경우
        dfs(index + 1, sum + prevNum, -arr[index], str + "-" + arr[index]);
        // 현재 숫자를 공백으로 처리하는 경우 (이어붙이기)
        dfs(index + 1, sum, prevNum * 10 + (prevNum > 0 ? arr[index] : -arr[index]), str + " " + arr[index]);
    }
}
