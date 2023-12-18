import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next();  // 사용자로부터 문자열 입력 받기
        
        int[] counts = countHandPrints(input);  // countHandPrints 함수 호출하여 잔상 수 계산
        
        System.out.print(counts[0] + " " + counts[1]);  // 결과 출력
    }
    
    // 왼손의 잔상 수와 오른손의 잔상 수를 계산하는 함수
    public static int[] countHandPrints(String input) {
        int leftCount = 0;  // 왼손의 잔상 수 초기화
        int rightCount = 0;  // 오른손의 잔상 수 초기화
        boolean isLeft = true;  // 왼손 여부를 나타내는 플래그 초기화
        
        for (char c : input.toCharArray()) {  // 문자열을 한 글자씩 반복하여 처리
            if (c == '0') {  // 문자가 '0'인 경우
                isLeft = false;  // 왼손 플래그를 false로 변경
                continue;  // 다음 문자 처리로 넘어감
            }
            
            if (c == '@') {  // 문자가 '@'인 경우
                if (isLeft) {  // 왼손의 잔상인 경우
                    leftCount++;  // 왼손의 잔상 수 증가
                } else {  // 오른손의 잔상인 경우
                    rightCount++;  // 오른손의 잔상 수 증가
                }
            }
        }
        
        return new int[] { leftCount, rightCount };  // 왼손과 오른손의 잔상 수 배열로 반환
    }
    
}



/*

@===@==@=@==(^0^)==@=@===@

4 3

*/
