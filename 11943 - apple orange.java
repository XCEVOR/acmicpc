import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int apple1 = sc.nextInt();
        int orange1 = sc.nextInt();
        int apple2 = sc.nextInt();
        int orange2 = sc.nextInt();
        
        int case1 = apple1 + orange2;
        int case2 = orange1 + apple2;
        
        System.out.println(Math.min(case1, case2));
    }
    
}
