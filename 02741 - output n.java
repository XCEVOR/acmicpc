import java.util.Scanner;

public class Main {
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int inputNum = sc.nextInt();
        
        outputNumbersFromOneToN(inputNum);
    }
    
    public static void outputNumbersFromOneToN (int inputNum) {
        for (int num = 1; num <= inputNum; num++) {
            System.out.println(num);
        }
    }
    
}
