import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 입력 받기
        String score = sc.next();
        
        // 럭키 스트레이트 여부 확인
        String result = checkLucky(score);
        
        // 결과 출력
        System.out.println(result);
    }
    
    // 럭키 스트레이트 여부를 확인하는 함수
    private static String checkLucky(String score) {
        // 점수의 길이와 반으로 나눈 값 계산
        int length = score.length();
        int halfLength = length / 2;
        
        // 왼쪽 부분의 합과 오른쪽 부분의 합 초기화
        int leftSum = 0;
        int rightSum = 0;
        
        // 각 부분의 합 계산
        for (int i = 0; i < halfLength; i++) {
            // char를 int로 변환하여 더함
            leftSum += score.charAt(i) - '0';
            // 오른쪽 부분의 시작 인덱스는 halfLength부터 시작, char를 int로 변환하여 더함
            rightSum += score.charAt(halfLength + i) - '0';
        }
        
        // 왼쪽 부분의 합과 오른쪽 부분의 합이 같으면 "LUCKY", 아니면 "READY" 반환
        if (leftSum == rightSum) {
            return "LUCKY";
        } else {
            return "READY";
        }
    }
}
