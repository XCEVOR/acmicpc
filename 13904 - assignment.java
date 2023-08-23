import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;



class Assignment implements Comparable<Assignment> {
    int deadline;
    int score;

    public Assignment(int deadline, int score) {
        this.deadline = deadline;
        this.score = score;
    }

    @Override
    public int compareTo(Assignment other) {
        // 마감일이 빠른 순서대로 정렬하기 위한 비교 메서드
        return Integer.compare(this.deadline, other.deadline);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 과제의 개수 입력

        List<Assignment> assignments = new ArrayList<>();

        // 과제 정보 입력 및 리스트에 저장
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt(); // 마감일까지 남은 일수
            int w = sc.nextInt(); // 과제의 점수
            assignments.add(new Assignment(d, w)); // 과제 객체 생성하여 리스트에 추가
        }

        // 마감일이 빠른 순서로 과제들을 정렬
        Collections.sort(assignments);

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 과제의 점수를 저장하기 위한 우선순위 큐 (기본은 최소 힙)

        int totalScore = 0; // 얻을 수 있는 총 점수
        int currentDay = 0; // 현재 날짜 (처리한 과제 수)

        // 모든 과제에 대해 처리
        for (Assignment assignment : assignments) {
            currentDay = assignment.deadline; // 현재 날짜 갱신
            pq.offer(assignment.score); // 가능한 과제의 점수를 우선순위 큐에 추가

            // 현재 날짜가 가능한 과제의 수보다 작을 때까지 과제 제거
            while (!pq.isEmpty() && currentDay < pq.size()) {
                pq.poll(); // 가능한 과제 중에서 가장 작은 점수의 과제를 제거
            }
        }

        // 가능한 과제 중에서 최대 점수 계산
        while (!pq.isEmpty()) {
            totalScore += pq.poll(); // 가능한 과제 중에서 가장 큰 점수를 누적
        }

        // 얻을 수 있는 총 점수 출력
        System.out.println(totalScore);
    }
}
