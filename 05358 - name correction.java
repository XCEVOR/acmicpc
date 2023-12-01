import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력이 더 이상 없을 때까지 반복하여 처리
        while (sc.hasNextLine()) {
            // 입력된 이름을 읽음
            String name = sc.nextLine();
            
            // 이름의 철자를 수정하여 correctedName 변수에 저장
            String correctedName = correctSpelling(name);
            
            // 수정된 이름을 출력
            System.out.println(correctedName);
        }
    }

    // 철자를 수정하여 반환하는 메서드
    public static String correctSpelling(String name) {
        char[] charArray = name.toCharArray();
        
        // 이름의 각 문자에 대해 교체 수행
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            
            // 'i'를 'e'로 변경
            if (currentChar == 'i') {
                charArray[i] = 'e';
            } 
            // 'e'를 'i'로 변경
            else if (currentChar == 'e') {
                charArray[i] = 'i';
            } 
            // 'I'를 'E'로 변경
            else if (currentChar == 'I') {
                charArray[i] = 'E';
            } 
            // 'E'를 'I'로 변경
            else if (currentChar == 'E') {
                charArray[i] = 'I';
            }
        }
        
        // 수정된 문자 배열을 문자열로 반환
        return new String(charArray);
    }
    
}
