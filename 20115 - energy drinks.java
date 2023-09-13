import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;


// 주어진 숫자 배열에서 최댓값을 제외한 나머지 숫자의 합을 계산하는 클래스
class DrinkCalculator {
    public static double calculateMaxDrink(long[] drinks) {
        // 숫자 배열을 정렬
        Arrays.sort(drinks);
        
        int n = drinks.length;
        
        // 최댓값을 찾음
        long max = drinks[n - 1];
        
        // 최댓값을 제외한 나머지 숫자들의 합을 계산
        double sum = Arrays.stream(drinks).limit(n - 1).sum();
        
        // 최댓값과 나머지 숫자들의 합을 2로 나누고 최댓값을 더하여 결과를 반환
        return max + (sum / 2);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader와 StringTokenizer를 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 숫자의 개수 N을 읽어옴
        int n = Integer.parseInt(st.nextToken());
        
        // 숫자들을 저장할 배열을 생성
        long[] drinks = new long[n];
        // 숫자들을 읽어와 배열에 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            drinks[i] = Long.parseLong(st.nextToken());
        }
        
        // DrinkCalculator 클래스를 사용하여 최댓값을 계산하고 결과를 출력
        double result = DrinkCalculator.calculateMaxDrink(drinks);
        
        System.out.println(result);
    }
}
