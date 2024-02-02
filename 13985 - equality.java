import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        if (isSumCorrect(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    private static boolean isSumCorrect(String input) {
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        int c = Integer.parseInt(parts[4]);
        
        return a + b == c;
    }
}
