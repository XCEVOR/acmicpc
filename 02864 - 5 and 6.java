import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        char[] firstNum = sc.next().toCharArray();
        char[] secondNum = sc.next().toCharArray();
        
        String fst_minNum = "";
        String fst_maxNum = "";
        for (int i = 0; i < firstNum.length; i++) {
            if (firstNum[i] == '5' || firstNum[i] == '6') {
                fst_minNum += "5";
                fst_maxNum += "6";
            }
            else {
                fst_minNum += firstNum[i] + "";
                fst_maxNum += firstNum[i] + "";
            }
        }
        // System.out.println(fst_minNum);  // TEST PRINT
        // System.out.println(fst_maxNum);  // TEST PRINT
        
        String snd_minNum = "";
        String snd_maxNum = "";
        for (int i = 0; i < secondNum.length; i++) {
            if (secondNum[i] == '5' || secondNum[i] == '6') {
                snd_minNum += "5";
                snd_maxNum += "6";
            }
            else {
                snd_minNum += secondNum[i] + "";
                snd_maxNum += secondNum[i] + "";
            }
        }
        // System.out.println(snd_minNum);  // TEST PRINT
        // System.out.println(snd_maxNum);  // TEST PRINT
                
        int minSum = Integer.parseInt(fst_minNum) + Integer.parseInt(snd_minNum);
        int maxSum = Integer.parseInt(fst_maxNum) + Integer.parseInt(snd_maxNum);
        
        System.out.print(minSum + " " + maxSum);

    }
}
