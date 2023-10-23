import java.util.Scanner;
import java.util.HashMap;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            HashMap<String, Integer> scores = readTestCase(sc);
            
            String result = calculateResult(scores);
            
            System.out.println(result);
        }
    }
    
    private static HashMap<String, Integer> readTestCase(Scanner sc) {
        HashMap<String, Integer> scores = new HashMap<>();
        
        for (int j = 0; j < 9; j++) {
            int Y = sc.nextInt();
            int K = sc.nextInt();
            
            scores.put("Yonsei", scores.getOrDefault("Yonsei", 0) + Y);
            scores.put("Korea", scores.getOrDefault("Korea", 0) + K);
        }
        
        return scores;
    }
    
    private static String calculateResult(HashMap<String, Integer> scores) {
        if (scores.get("Yonsei") > scores.get("Korea")) {
            return "Yonsei";
        } else if (scores.get("Yonsei") < scores.get("Korea")) {
            return "Korea";
        } else {
            return "Draw";
        }
    }
    
}
