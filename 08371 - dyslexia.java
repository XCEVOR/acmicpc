import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String[] origiText = sc.next().split("");
        String[] rewriText = sc.next().split("");
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!origiText[i].equals(rewriText[i])) count += 1;
        }
        
        System.out.print(count);
    }
}
