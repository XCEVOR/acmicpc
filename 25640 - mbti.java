import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String jinho = sc.next();
        int testCase = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < testCase; i++) {
            String friend = sc.next();
            if (jinho.equals(friend)) {
                count += 1;
            }
        }
        
        System.out.print(count);
    }
}
