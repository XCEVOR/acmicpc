import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String str = sc.next();
        
        char[] result = restorePalindrome(N, str);
        
        // 완성된 팰린드롬 문자열 출력
        for (char c : result) {
            System.out.print(c);
        }
    }
    
    // 주어진 문자열을 팰린드롬으로 복구하는 함수
    public static char[] restorePalindrome(int N, String str) {
        // 문자열을 문자 배열로 변환
        char[] chars = str.toCharArray();
        
        int left = 0;  // 문자열 왼쪽 인덱스
        int right = N - 1;  // 문자열 오른쪽 인덱스
        
        // 문자열 양 끝에서부터 가운데로 이동하면서 처리
        while (left < right) {
            if (chars[left] == '?' && chars[right] == '?') {
                // 양 끝 문자가 '?'인 경우 해당 문자를 'a'로 대체하여 팰린드롬 완성
                chars[left] = 'a';
                chars[right] = 'a';
            } else if (chars[left] == '?') {
                // 왼쪽이 '?'인 경우 오른쪽 문자로 대체
                chars[left] = chars[right];
            } else if (chars[right] == '?') {
                // 오른쪽이 '?'인 경우 왼쪽 문자로 대체
                chars[right] = chars[left];
            }
            
            left++;  // 왼쪽 인덱스 이동
            right--;  // 오른쪽 인덱스 이동
        }
        
        // 홀수 길이의 경우 가운데 문자가 '?'인 경우 'v'로 대체
        if (N % 2 != 0 && chars[N / 2] == '?') {
            chars[N / 2] = 'v';
        }
        
        return chars;
    }
}
