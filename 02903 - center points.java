import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] sideArr = new int[16];
        
        sideArr[0] = 2;
        for (int i = 1; i <= 15; i++) {
            sideArr[i] = (sideArr[i - 1]) + (sideArr[i - 1] - 1);
        }
        
        System.out.println(sideArr[n] * sideArr[n]);
    }
    
}
