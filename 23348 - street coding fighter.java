import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int group = sc.nextInt();
        
        int max_score = 0;
        for (int i = 0; i < group; i++) {
            
            int score = 0;
            for (int j = 0; j < 3; j++) {
                score += a * sc.nextInt();
                score += b * sc.nextInt();
                score += c * sc.nextInt();
            }

            
            if (max_score < score) max_score = score;
        }
        
        System.out.print(max_score);
        
    }
}
