import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numArr = new int[3];
        for (int i = 0; i < 3; i++) {
            numArr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(numArr)); // TEST PRINT
        
        Arrays.sort(numArr);
//        System.out.println(Arrays.toString(numArr)); // TEST PRINT
        
        for (int i = 0; i < 3; i++) {
            System.out.print(numArr[i] + " ");
            
        }
    }
}
