import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 팀 수 입력
        int n = sc.nextInt();
        
        // 학생들의 코딩 역량을 저장할 배열 생성
        int[] abilities = new int[2 * n];
        // 학생들의 코딩 역량 입력
        for (int i = 0; i < 2 * n; i++) {
            abilities[i] = sc.nextInt();
        }
        
        // TeamFormation 객체 생성하여 코딩 역량 배열 전달
        TeamFormation teamFormation = new TeamFormation(abilities);
        // 팀을 구성하고 최소 합을 찾아서 result에 저장
        int result = teamFormation.findMinSum();
        
        // 결과 출력
        System.out.println(result);
    }
}

// TeamFormation 클래스 정의
class TeamFormation {
    private int[] abilities; // 코딩 역량을 저장할 배열
    
    // constructor: 코딩 역량 배열을 받아서 정렬
    public TeamFormation(int[] abilities) {
        this.abilities = abilities;
        Arrays.sort(this.abilities); // 코딩 역량 배열을 오름차순으로 정렬
    }
    
    // 최소 합을 찾는 메서드
    public int findMinSum() {
        int n = abilities.length / 2; // 팀의 수
        int minSum = Integer.MAX_VALUE; // 최소 합을 저장할 변수 초기화
        // 가장 작은 코딩 역량과 가장 큰 코딩 역량을 가진 학생을 각 팀에 넣었을 때의 합을 구하고 최소값 갱신
        for (int i = 0; i < n; i++) {
            int sum = abilities[i] + abilities[abilities.length - i - 1];
            minSum = Math.min(minSum, sum);
        }
        return minSum; // 최소 합 반환
    }
}
