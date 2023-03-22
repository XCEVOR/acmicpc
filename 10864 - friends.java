import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] numberOfFriends = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int relationship_1 = sc.nextInt();
            int relationship_2 = sc.nextInt();
            
            numberOfFriends[relationship_1] += 1;
            numberOfFriends[relationship_2] += 1;
        }
        
        for (int j = 1; j < numberOfFriends.length; j++) {
            System.out.println(numberOfFriends[j]);
        }
        
    }
}
