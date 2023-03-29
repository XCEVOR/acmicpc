import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        int nums = sc.nextInt();
        int tempNum = 0;
        int result = 0;
        
        for (int i = 0; i < nums; i++) {
            tempNum = sc.nextInt();
            result += Math.pow((tempNum / 10), (tempNum % 10));
        }
        
        System.out.print(result);
    }
}
