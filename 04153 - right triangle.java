import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a + b + c == 0) break;
            
            String result = isRightTriangle(a, b, c);
            
            System.out.println(result);
        }
    }
    
    public static String isRightTriangle (int a, int b, int c) {
        int[] sideArr = {a, b, c};
        
        Arrays.sort(sideArr);
        
        if (Math.pow(sideArr[0], 2) + Math.pow(sideArr[1], 2) == Math.pow(sideArr[2], 2)) {
            return "right";
        }
        return "wrong";
    }
    
}
