import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // N 입력

        // 입력되는 명령들을 배열에 저장
        int[] operations = new int[N];
        for (int i = 0; i < N; i++) {
            operations[i] = sc.nextInt();  // 명령 입력
        }

        // 명령 시행
        processOperations(N, operations);
    }

    public static void processOperations(int N, int[] operations) {
        // 우선순위 큐를 사용. 우선 순위를 낮은 숫자 순으로 부여.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 각 명령어를 순차적으로 실행
        for (int i = 0; i < N; i++) {
            int x = operations[i];

            if (x == 0) {
                if (minHeap.isEmpty()) {
                    // 배열이 비어 있는 경우
                    System.out.println(0);
                } else {
                    // 그 외 가장 작은 값을 출력하고 제거
                    System.out.println(minHeap.poll());
                }
            } else {
                // 자연수를 배열에 추가
                minHeap.add(x);
            }
        }
    }
    
}
