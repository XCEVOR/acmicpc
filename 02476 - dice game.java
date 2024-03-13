import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int maxPrize = 0;
        for (int i = 0; i < N; i++) {
            int[] dice = new int[3];
            for (int j = 0; j < 3; j++) {
                dice[j] = sc.nextInt();
            }
            int prize = DiceGame.calculatePrize(dice);
            maxPrize = Math.max(maxPrize, prize);
        }
        
        System.out.println(maxPrize);
    }
}

class DiceGame {
    public static int calculatePrize(int[] dice) {
        int[] counts = new int[7];
        
        for (int i = 0; i < 3; i++) {
            counts[dice[i]]++;
        }
        
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 3) {
                return 10000 + i * 1000;
            }
        }
        
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                return 1000 + i * 100;
            }
        }
        
        int maxDice = 0;
        for (int i = 0; i < 3; i++) {
            maxDice = Math.max(maxDice, dice[i]);
        }
        return maxDice * 100;
    }
}
