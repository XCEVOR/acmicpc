import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] minsScores = new int[4];
        for (int i = 0; i < 4; i++) {
            minsScores[i] = sc.nextInt();
        }
        
        int[] mansScores = new int[4];
        for (int i = 0; i < 4; i++) {
            mansScores[i] = sc.nextInt();
        }
        
        int minsTotal = calculateTotal(minsScores);
        int mansTotal = calculateTotal(mansScores);
        
        if (minsTotal >= mansTotal) {
            System.out.println(minsTotal);
        } else {
            System.out.println(mansTotal);
        }
    }
    
    public static int calculateTotal(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }
    
}
