import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        char[] s = sc.next().toCharArray();
        
        for (char c : s) {
            // System.out.println((c - 0)+"");  // TEXT PRINT
            char[] charDec = ((c - 0)+"").toCharArray();
            
            int tempSum = 0;
            for (char cDec : charDec) {
                tempSum += cDec - '0';
                // System.out.println(cDec);  // TEXT PRINT
            }
            // System.out.println(tempSum);  // TEXT PRINT
            
            System.out.println((c + "").repeat(tempSum));
        }

    }
}
