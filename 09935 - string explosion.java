import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 받기
        String original = br.readLine();  // 원본 문자열
        String explosion = br.readLine();  // 폭발 문자열
        
        // 문자열 폭발 객체 생성
        StringExplosion stringExplosion = new StringExplosion(original, explosion);
        
        // 문자열 폭발 수행
        String result = stringExplosion.explode();
        
        // 결과 출력
        if (result.isEmpty()) {
            System.out.println("FRULA");
        } else {
            System.out.println(result);
        }
    }
}

// 문자열 폭발을 처리하는 클래스스
class StringExplosion {
    private String original;  // 원본 문자열
    private String explosion;  // 폭발 문자열
    
    // constructor
    public StringExplosion(String original, String explosion) {
        this.original = original;
        this.explosion = explosion;
    }
    
    // 문자열 폭발 메서드
    public String explode() {
        // 문자 스택 생성
        Stack<Character> stack = new Stack<>();
        // 폭발 문자열의 길이 저장
        int explosionLength = explosion.length();
        // 폭발 문자열의 마지막 문자 저장
        char lastExplosionChar = explosion.charAt(explosionLength - 1);
        
        // 원본 문자열을 순회하며 폭발 문자열을 처리
        for (char ch : original.toCharArray()) {
            stack.push(ch);  // 스택에 문자 추가
            
            // 폭발 문자열의 마지막 문자와 현재 문자가 같고, 폭발이 일어나는지 확인
            if (ch == lastExplosionChar && isExplosion(stack, explosion)) {
                // 폭발 문자열이 있는 경우 해당 문자열 제거
                for (int i = 0; i < explosionLength; i++) {
                    stack.pop();
                }
            }
        }
        
        // 결과 문자열을 저장할 StringBuilder 객체 생성
        StringBuilder result = new StringBuilder();
        // 스택이 빌 때까지 문자를 꺼내어 result 문자열에 추가
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        // result 문자열을 뒤집어 반환
        return result.reverse().toString();
    }
    
    // 폭발이 일어나는지 확인하는 메서드
    private boolean isExplosion(Stack<Character> stack, String explosion) {
        if (stack.size() < explosion.length()) {
            return false;
        }
        
        // 스택의 마지막에서 폭발 문자열의 길이만큼 문자열을 비교하여 폭발 여부 확인
        for (int i = 0; i < explosion.length(); i++) {
            if (stack.get(stack.size() - explosion.length() + i) != explosion.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}
