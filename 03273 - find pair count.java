import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int x = sc.nextInt();
        
        int pairCount = findPairCount(arr, x);
        
        System.out.println(pairCount);
    }
    
    static int findPairCount(int[] arr, int x) {
        int pairCount = 0;
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == x) {
                pairCount++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
        
        return pairCount;
    }
    
}
