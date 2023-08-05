import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int[] sides = new int[3];
        
        for (int t = 1; t <= T; t++) {
            for (int i = 0; i < 3; i++) {
                sides[i] = sc.nextInt();
            }
            
            Arrays.sort(sides);
            
            if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
                System.out.println("Scenario #" + t + ":");
                System.out.println("yes");
            } else {
                System.out.println("Scenario #" + t + ":");
                System.out.println("no");
            }
            System.out.println();
        }
    }
    
}
