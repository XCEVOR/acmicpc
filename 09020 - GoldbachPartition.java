import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
  // 소수를 저장할 배열
  static boolean[] isPrime;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int maxN = 10000;  // 소수를 찾을 최대 값 설정
    
    isPrime = new boolean[maxN + 1];  // 최대 값 + 1 크기의 boolean 배열 생성
    Arrays.fill(isPrime, true);  // 배열을 모두 true로 초기화 (소수로 가정)
    isPrime[0] = isPrime[1] = false;  // 0과 1은 소수가 아니므로 false로 설정
    
    // 에라토스테네스의 체 알고리즘으로 소수 판별
    for (int i = 2; i * i <= maxN; i++) {  // i의 제곱이 maxN 이하일 때까지 반복
      if (isPrime[i]) {  // i가 소수일 경우
        for (int j = i * i; j <= maxN; j += i) {  // i의 배수를 false로 설정
          isPrime[j] = false;  // j는 소수가 아님
        }
      }
    }
    
    List<Integer> primes = new ArrayList<>();  // 소수를 저장할 리스트 생성
    
    // 소수를 리스트에 추가
    for (int i = 2; i <= maxN; i++) {  // 2부터 maxN까지 반복
      if (isPrime[i]) {  // i가 소수이면
        primes.add(i);  // 리스트에 추가
      }
    }
    
    int T = sc.nextInt();  // 테스트 케이스 수 입력
    
    // 각 테스트 케이스에 대해 골드바흐 파티션 찾기
    for (int t = 0; t < T; t++) {  // T번 만큼 반복
      int n = sc.nextInt();  // 짝수 n 입력
      findGoldbachPartition(n);  // 해당 n의 골드바흐 파티션 찾기
    }
  }
  
  // 주어진 짝수 n의 골드바흐 파티션을 찾는 메서드
  private static void findGoldbachPartition(int n) {
    int a = 0, b = 0;  // 소수 a와 b 초기화
    int minDiff = Integer.MAX_VALUE;  // 두 소수의 차이를 최대로 초기화
    
    // n의 절반까지 반복하며 소수 쌍 찾기
    for (int i = 2; i <= n / 2; i++) {  // 2부터 n/2까지 반복
      if (isPrime[i] && isPrime[n - i]) {  // i와 n-i가 모두 소수일 때
        int diff = Math.abs(i - (n - i));  // 두 소수의 차이 계산
        if (diff < minDiff) {  // 현재 차이가 최소 차이보다 작으면
          minDiff = diff;  // 최소 차이 업데이트
          a = i;  // 소수 a 업데이트
          b = n - i;  // 소수 b 업데이트
        }
      }
    }
    
    // 찾은 소수 a와 b 출력
    System.out.println(a + " " + b);
  }
}
