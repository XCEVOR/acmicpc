import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] a_array = new int[n][m];
        int[][] b_array = new int[n][m];
        int[][] result_array = new int[n][m];
        
        for (int i = 0; i < a_array.length; i++) {
            for (int j = 0; j < a_array[i].length; j++) {
                a_array[i][j] = sc.nextInt();
            }
            // System.out.println(Arrays.toString(a_array[i]));            // TEST PRINT
        }
        // System.out.println();                                           // TEST PRINT
        
        for (int i = 0; i < b_array.length; i++) {
            for (int j = 0; j < b_array[i].length; j++) {
                b_array[i][j] = sc.nextInt();
            }
            // System.out.println(Arrays.toString(b_array[i]));            // TEST PRINT
        }
        // System.out.println();                                           // TEST PRINT
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result_array[i][j] = a_array[i][j] + b_array[i][j];
            }
            // System.out.println(Arrays.toString(result_array[i]));       // TEST PRINT
        }
        // System.out.println();                                           // TEST PRINT
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result_array[i][j] = a_array[i][j] + b_array[i][j];
                System.out.print(result_array[i][j] + " ");
            }
            System.out.println();
        }

      sc.close();
    }
}
