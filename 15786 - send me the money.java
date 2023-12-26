import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 기억하는 알파벳의 수(N)와 포스트잇의 개수(M)를 입력 받음
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 기억하는 알파벳을 입력 받음
        String rememberedAlphabets = sc.next();
        
        // 각 포스트잇에 대해 비밀번호 가능성을 확인하고 출력
        for (int i = 0; i < M; i++) {
            // 각 포스트잇의 문자열을 입력 받음
            String postIt = sc.next();
            // 비밀번호 가능성을 확인하고 결과를 출력
            boolean isPossiblePassword = isPossiblePassword(rememberedAlphabets, postIt);
            
            System.out.println(isPossiblePassword);
        }
    }
    
    // 비밀번호 가능성을 확인하는 함수
    public static boolean isPossiblePassword(String rememberedAlphabets, String postIt) {
        int index = 0;
        
        // 포스트잇의 각 문자에 대해 기억하는 알파벳과 일치하는지 확인
        for (char ch : postIt.toCharArray()) {
            // 기억하는 알파벳과 일치하는 문자를 찾으면 인덱스 증가
            if (index < rememberedAlphabets.length() && ch == rememberedAlphabets.charAt(index)) {
                index++;
            }
        }
        
        // 포스트잇에 기억하는 알파벳의 문자가 모두 포함되었는지 확인 후 결과 반환
        return index == rememberedAlphabets.length();
    }
}
