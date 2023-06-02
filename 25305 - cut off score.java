import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String args[]) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int result = findCutOffScore(n, k);
        
        System.out.print(result);
    }
    
    public static int findCutOffScore (int n, int k) {
        List<Integer> scoreList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            scoreList.add(score);
        }
        
        Collections.sort(scoreList, Collections.reverseOrder());
        
        return scoreList.get(k - 1);
    }
    
}
