import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        int k = sc.nextInt();
        
        int shiftySum = Integer.parseInt(n);
        for (int i = 1; i <= k; i++) {
            shiftySum += Integer.parseInt(n + "0".repeat(i));
        }
        
        System.out.print(shiftySum);

    }
}
