import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 숫자 뒤집기 기능을 포함한 NumberReverser 객체 생성
        NumberReverser numberReverser = new NumberReverser();
        
        // 입력값으로 주어지는 숫자의 개수 입력
        int n = sc.nextInt();
        
        // 입력된 숫자를 저장할 ArrayList 생성
        List<Long> list = new ArrayList<>();
        
        // n개의 숫자를 입력받아 뒤집은 후 list에 추가
        for (int i = 0; i < n; i++) {
            // long 자료형으로 입력 받음
            long num = sc.nextLong();
            // 입력 받은 숫자를 뒤집어서 list에 추가
            list.add(numberReverser.reverseNumber(num));
        }
        
        // list를 오름차순으로 정렬
        Collections.sort(list);
        
        // 정렬된 list를 출력
        for (long num : list) {
            System.out.println(num);
        }
    }
}

// 숫자 뒤집기 기능을 담은 NumberReverser 클래스 정의
class NumberReverser {
    // 주어진 숫자를 뒤집어 반환하는 메서드
    public long reverseNumber(long num) {
        // 뒤집힌 숫자를 저장할 변수
        long reversed = 0;
        // 주어진 숫자가 0보다 큰 동안 반복
        while (num > 0) {
            // 뒤집힌 숫자에 현재 숫자의 일의 자리를 추가
            reversed = reversed * 10 + num % 10;
            // 현재 숫자의 일의 자리를 제거
            num /= 10;
        }
        // 뒤집힌 숫자 반환
        return reversed;
    }
}
