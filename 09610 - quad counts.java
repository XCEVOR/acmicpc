import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] quadCounts = new int[4];
        int x_axis_count = 0;
        int y_axis_count = 0;
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x > 0 && y > 0) {
                quadCounts[0]++;
            } else if (x < 0 && y > 0) {
                quadCounts[1]++;
            } else if (x < 0 && y < 0) {
                quadCounts[2]++;
            } else if (x > 0 && y < 0) {
                quadCounts[3]++;
            } else if (x == 0) {
                x_axis_count++;
            } else if (y == 0) {
                y_axis_count++;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Q" + (i + 1) + ": " + quadCounts[i]);
        }
        System.out.println("AXIS: " + (x_axis_count + y_axis_count));
    }
    
}
