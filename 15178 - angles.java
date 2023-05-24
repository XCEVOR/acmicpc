import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            int angle_1 = sc.nextInt();
            int angle_2 = sc.nextInt();
            int angle_3 = sc.nextInt();
            
            if (angle_1 + angle_2 + angle_3 == 180) {
                System.out.println(angle_1 + " " + angle_2 + " " +  angle_3 + " Seems OK");
            }
            else {
                System.out.println(angle_1 + " " + angle_2 + " " +  angle_3 + " Check");
            }
        }
    }
}
