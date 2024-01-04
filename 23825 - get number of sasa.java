import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();
        int a = sc.nextInt();
        
        int result = getNumberOfSASA(s, a);
        
        System.out.print(result);
    }
    
    private static int getNumberOfSASA(int s, int a) {
        int result = Math.min((s / 2), (a / 2));
        return result;
    }
}
