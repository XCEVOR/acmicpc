import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 에라토스테네스 클래스의 인스턴스 생성
        Eratosthenes eratosthenes = new Eratosthenes();
        // K번째 지워진 수를 찾는 메서드 호출
        eratosthenes.findKthRemovedNumber();
    }
}

class Eratosthenes {
    private int N; // 입력으로 받은 수
    private int K; // K번째 지워지는 수
    private boolean[] isPrime; // 소수 판별 배열

    public Eratosthenes() {
        Scanner scanner = new Scanner(System.in);
        this.N = scanner.nextInt(); // N 입력 받음
        this.K = scanner.nextInt(); // K 입력 받음
        this.isPrime = new boolean[N + 1]; // 소수 판별 배열 초기화
        Arrays.fill(isPrime, true); // 모든 수를 소수로 초기화
    }

    public void findKthRemovedNumber() {
        int count = 0; // 지워진 수를 카운트하는 변수
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) { // 현재 수가 소수인 경우
                for (int j = i; j <= N; j += i) { // 현재 수의 배수를 지움
                    if (!isPrime[j]) continue; // 이미 지워진 수인 경우 건너뜀
                    count++; // 지워진 수 카운트 증가
                    if (count == K) { // K번째 지워진 수인 경우
                        System.out.println(j); // 결과 출력
                        return; // 메서드 종료
                    }
                    isPrime[j] = false; // 지워진 수를 표시
                }
            }
        }
    }
}
