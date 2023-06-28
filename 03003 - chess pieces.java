import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] currentPieces = new int[6];
        
        for (int i = 0; i < 6; i++) {
            currentPieces[i] = sc.nextInt();
        }
        
        determineTheNumberOfChessPiecesNeeded(currentPieces);
    }
    
    public static void determineTheNumberOfChessPiecesNeeded(int[] currentPieces) {
        int[] requiredPieces = {1, 1, 2, 2, 2, 8};
        
        for (int i = 0; i < 6; i++) {
            int difference = requiredPieces[i] - currentPieces[i];
            System.out.print(difference + " ");
        }
    }
    
}
