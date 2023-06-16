import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        
        int[] aCount = new int[k + 1];
        int[] bCount = new int[k + 1];
        
        countTheNumberOfAB(k, aCount, bCount);
        
        System.out.println(aCount[k] + " " + bCount[k]);
    }
    
    public static void countTheNumberOfAB(int k, int[] aCount, int[] bCount) {
        aCount[1] = 0;
        bCount[1] = 1;

        for (int i = 2; i <= k; i++) {
            aCount[i] = bCount[i - 1];
            bCount[i] = aCount[i - 1] + bCount[i - 1];
        }
    }
    
}
