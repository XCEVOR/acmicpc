import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] grid = new int[1 + 9][1 + 9];
        
        getTheTwoDimensionalArray(grid);
        
        findMaxValueAndPosition(grid);
    }
    
    private static void getTheTwoDimensionalArray(int[][] grid) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 9; i++) {
            String[] row = sc.nextLine().split(" ");
            for (int j = 1; j <= 9; j++) {
                grid[i][j] = Integer.parseInt(row[j - 1]);
            }
        }
        
        sc.close();
    }
    
    private static void findMaxValueAndPosition(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.print(row + " " + col);
    }
    
}
