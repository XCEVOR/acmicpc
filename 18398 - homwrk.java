import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            int numOfQuestions = sc.nextInt();
            
            for (int j = 0; j < numOfQuestions; j++) {
                int num_1 = sc.nextInt();
                int num_2 = sc.nextInt();
                
                System.out.println(num_1 + num_2 + " " + num_1 * num_2);
            }
        }
     
    }
}
