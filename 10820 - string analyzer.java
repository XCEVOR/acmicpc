import java.util.Scanner;

class StringAnalyzer {
    private String input;
    private int lowerCaseCount;
    private int upperCaseCount;
    private int digitCount;
    private int spaceCount;
    
    // constuctor: 입력 문자열을 받아 필드 초기화
    public StringAnalyzer(String input) {
        this.input = input;
        lowerCaseCount = 0;
        upperCaseCount = 0;
        digitCount = 0;
        spaceCount = 0;
    }
    
    // 문자열을 분석하여 각 카운트 변수를 증가시킴
    public void analyze() {
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            }
        }
    }
    
    // 분석 결과를 출력
    public void printAnalysis() {
        System.out.println(lowerCaseCount + " " + upperCaseCount + " " + digitCount + " " + spaceCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력이 없을 때까지 반복
        while (sc.hasNextLine()) {
            // 입력 문자열 받음
            String input = sc.nextLine();
            
            // 문자열 분석을 위한 객체 생성
            StringAnalyzer analyzer = new StringAnalyzer(input);
            
            // 문자열 분석 수행
            analyzer.analyze();
            
            // 분석 결과 출력
            analyzer.printAnalysis();
        }
    }
}

