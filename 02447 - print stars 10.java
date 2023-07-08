import java.util.Scanner;
import java.util.Arrays;

public class RecursivePattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        printPattern(N);
    }

    public static void printPattern(int N) {
        char[][] pattern = new char[N][N];
        for (char[] row : pattern) {
            Arrays.fill(row, ' ');
        }

        drawPattern(pattern, 0, 0, N);

        for (char[] row : pattern) {
            System.out.println(row);
        }
    }

    public static void drawPattern(char[][] pattern, int row, int col, int size) {
        if (size == 1) {
            pattern[row][col] = '*';
        } else {
            int newSize = size / 3;
            drawPattern(pattern, row, col, newSize);
            drawPattern(pattern, row, col + newSize, newSize);
            drawPattern(pattern, row, col + newSize * 2, newSize);

            drawPattern(pattern, row + newSize, col, newSize);
            drawPattern(pattern, row + newSize, col + newSize * 2, newSize);

            drawPattern(pattern, row + newSize * 2, col, newSize);
            drawPattern(pattern, row + newSize * 2, col + newSize, newSize);
            drawPattern(pattern, row + newSize * 2, col + newSize * 2, newSize);
        }
    }
    
}
