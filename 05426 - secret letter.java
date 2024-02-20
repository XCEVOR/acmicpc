import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // 테스트 케이스의 개수 입력
        
        // 각 테스트 케이스에 대해 실행
        for (int i = 0; i < t; i++) {
            String encryptedMessage = sc.next(); // 암호화된 편지 입력
            
            // Decryption 객체 생성하여 암호화된 편지 해독
            Decryption decryption = new Decryption(encryptedMessage);
            String originalMessage = decryption.decryptOriginalMessage();
            
            // 원래 메시지 출력
            System.out.println(originalMessage);
        }
    }
}

class Decryption {
    private String encryptedMessage; // 암호화된 편지
    
    // constructor: 암호화된 편지를 받아서 저장
    public Decryption(String encryptedMessage) {
        this.encryptedMessage = encryptedMessage;
    }
    
    // 원래 메시지를 해독하여 반환하는 메서드
    public String decryptOriginalMessage() {
        int length = encryptedMessage.length(); // 암호화된 편지의 길이
        int n = (int) Math.sqrt(length); // 편지의 길이의 제곱근을 구함
        
        char[][] grid = new char[n][n]; // 정사각형 그리드 생성
        
        // 암호화된 편지를 그리드에 채우기
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                grid[row][col] = encryptedMessage.charAt(row * n + col);
            }
        }
        
        StringBuilder originalMessageBuilder = new StringBuilder(); // 원래 메시지를 저장할 StringBuilder 생성
        
        // 그리드를 시계 방향으로 90도 회전하여 원래 메시지 작성
        for (int col = n - 1; col >= 0; col--) {
            for (int row = 0; row < n; row++) {
                originalMessageBuilder.append(grid[row][col]);
            }
        }
        
        return originalMessageBuilder.toString(); // 문자열 형태로 원래 메시지 반환
    }
}
