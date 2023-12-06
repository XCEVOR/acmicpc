import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 숫자와 그 숫자를 영어로 읽은 문자열을 저장하는 클래스
class NumberAndRead {
    int number;
    String read;
    
    NumberAndRead(int number, String read) {
        this.number = number;
        this.read = read;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int M = sc.nextInt(); // 범위의 시작 값
        int N = sc.nextInt(); // 범위의 끝 값
        
        // 숫자와 문자열 저장할 리스트
        List<NumberAndRead> numbersList = new ArrayList<>(); 
        
        // M부터 N까지의 숫자와 해당 숫자를 영어로 읽은 문자열을 리스트에 추가
        for (int i = M; i <= N; i++) {
            numbersList.add(new NumberAndRead(i, getRead(i)));
        }
        
        // 문자열을 기준으로 리스트를 사전순으로 정렬
        Collections.sort(numbersList, Comparator.comparing(o -> o.read));
        
        int count = 0;
        for (NumberAndRead pair : numbersList) {
            // 숫자 출력
            System.out.print(pair.number + " ");
            count++;
            if (count % 10 == 0) {
                // 10개씩 출력 후 줄 바꿈
                System.out.println();
            }
        }
    }
    
    // 숫자를 영어로 변환하여 반환하는 메서드
    private static String getRead(int number) {
        // 입력된 정수를 문자열로 변환하여 numStr 변수에 저장
        String numStr = Integer.toString(number);
        
        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder result = new StringBuilder();
        
        // 각 자리수를 순회하며 영어 표현으로 변환하여 result에 추가
        for (int i = 0; i < numStr.length(); i++) {
            // 현재 자리수의 숫자를 가져옴
            int digit = Character.getNumericValue(numStr.charAt(i));
            
            // 숫자를 영어로 읽은 문자열을 numbers 배열에서 가져와 result에 추가
            result.append(numbers[digit].read).append(" ");
        }
        
        // 결과 문자열의 양 끝에 있는 공백 제거 후 반환
        return result.toString().trim();
    }
    
    // 숫자와 해당 숫자를 영어로 읽은 문자열을 미리 정의한 배열
    private static final NumberAndRead[] numbers = {
            new NumberAndRead(0, "zero"),
            new NumberAndRead(1, "one"),
            new NumberAndRead(2, "two"),
            new NumberAndRead(3, "three"),
            new NumberAndRead(4, "four"),
            new NumberAndRead(5, "five"),
            new NumberAndRead(6, "six"),
            new NumberAndRead(7, "seven"),
            new NumberAndRead(8, "eight"),
            new NumberAndRead(9, "nine")
    };
}
