import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int theNth = 3;
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int result = findTheNthLargestNunber(theNth);
            
            System.out.println(result);
        }
    }
    
    public static int findTheNthLargestNunber(int theNth) {
        int[] arr = new int[10];
        for (int j = 0; j < 10; j++) {
            arr[j] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int result = arr[10 - theNth];
        
        return result;
    }
    
}
