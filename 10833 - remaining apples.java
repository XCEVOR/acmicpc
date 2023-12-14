import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int totalRemainingApples = 0;
        
        for (int i = 0; i < N; i++) {
            int students = sc.nextInt();
            int apples = sc.nextInt();
            
            int remainingApples = apples % students;
            totalRemainingApples += remainingApples;
        }
        
        System.out.println(totalRemainingApples);
    }
    
}
