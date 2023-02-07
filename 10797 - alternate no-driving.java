import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int plateNum = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int dateNum = sc.nextInt();
            if (plateNum == dateNum) {
                count += 1;
            }
        }
        
        System.out.print(count);
        
    }
}
