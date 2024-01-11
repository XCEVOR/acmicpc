import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            // 알파벳 입력
            char target = sc.next().charAt(0);
            
            // 입력의 마지막인 '#'이면 반복 종료
            if (target == '#') {
                break;
            }
            
            // 문장 입력
            String sentence = sc.nextLine();
            
            // 문장을 소문자로 변환
            sentence = sentence.toLowerCase();
            
            // 알파벳이 나타난 횟수 계산
            int count = countOccurrences(target, sentence);
            
            // 결과 출력
            System.out.println(target + " " + count);
        }
    }
    
    // 알파벳이 나타난 횟수 계산하는 메소드
    private static int countOccurrences(char target, String sentence) {
        int count = 0;
        // 문장을 돌면서 알파벳이 나타날 때마다 카운트 증가
        for (char c : sentence.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        // 최종 결과 반환
        return count;
    }
    
}
