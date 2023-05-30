import java.util.Scanner;

public class Main {
    
    public static void main (String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            // 문자 , 로 분리하여 array 에 저장.
            String[] numArr = sc.next().split("[,]");
            
            int result = sumFunc(numArr[0], numArr[1]);
            
            System.out.println(result);
        }
        
    }
    
    // String 숫자 두 개를 받아 Intger 로 변환 후 합을 return.
    public static int sumFunc (String strNumA, String strNumB) {
        int numA = Integer.parseInt(strNumA);
        int numB = Integer.parseInt(strNumB);
        
        return numA + numB;
    }
    
}
