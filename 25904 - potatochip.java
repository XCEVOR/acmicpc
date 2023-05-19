import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int[] voice = new int[n];
        
        for (int i = 0; i < n; i++) {
            voice[i] = sc.nextInt();
        }
        
        int index = 0;
        while (true) {
            // System.out.println("  " + voice[index % n]);  // TEST PRINT
            if (voice[index % n] < x) {
                System.out.print(index % n + 1);
                break;
            }
            index += 1;
            x += 1;
        }
        
    }
}
