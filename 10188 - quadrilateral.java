import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            
            for (int h = 0; h < height; h++) {
                System.out.println("X".repeat(width));
            }
            System.out.println();
        }
        
    }
}
