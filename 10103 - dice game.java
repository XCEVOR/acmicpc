import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int scoreA = 100;
        int scoreB = 100;
        
        playGame(sc, n, scoreA, scoreB);
    }
    
    public static void playGame(Scanner sc, int n, int scoreA, int scoreB) {
        for (int i = 0; i < n; i++) {
            int diceA = sc.nextInt();
            int diceB = sc.nextInt();
            
            if (diceA > diceB) {
                scoreB -= diceA;
            } else if (diceA < diceB) {
                scoreA -= diceB;
            }
        }
        
        displayScores(scoreA, scoreB);
    }
    
    public static void displayScores(int scoreA, int scoreB) {
        System.out.println(scoreA);
        System.out.println(scoreB);
    }
    
}
