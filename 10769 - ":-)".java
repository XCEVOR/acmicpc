import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        String input = sc.nextLine();
        
        // 각 이모티콘 개수 세기
        int happyCount = countEmoticons(input, ":-)");
        int sadCount = countEmoticons(input, ":-(");
        
        // 결과 출력
        printResult(happyCount, sadCount);
    }
    
    // 이모티콘 개수를 세는 함수
    public static int countEmoticons(String input, String emoticon) {
        int count = 0;
        for (int i = 0; i < input.length() - emoticon.length() + 1; i++) {
            // 이모티콘과 일치하는 경우 개수 증가
            if (input.substring(i, i + emoticon.length()).equals(emoticon)) {
                count++;
            }
        }
        return count;
    }
    
    // 결과를 출력하는 함수
    public static void printResult(int happyCount, int sadCount) {
        // 각 경우에 따라 결과 출력
        if (happyCount == 0 && sadCount == 0) {
            System.out.print("none");
        } else if (happyCount == sadCount) {
            System.out.print("unsure");
        } else if (happyCount > sadCount) {
            System.out.print("happy");
        } else {
            System.out.print("sad");
        }
    }
    
}
