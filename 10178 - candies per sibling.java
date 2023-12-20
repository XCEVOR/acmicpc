import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            int candyCount = sc.nextInt();
            int siblingsCount = sc.nextInt();
            
            int candiesPerSibling = candyCount / siblingsCount;
            
            int dadGets = candyCount % siblingsCount;
            
            System.out.println("You get " + candiesPerSibling + " piece(s) and your dad gets " + dadGets + " piece(s).");
        }
    }
    
}
