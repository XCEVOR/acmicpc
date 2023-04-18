import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            int repeatNum = sc.nextInt();
            String repeatCharacter = sc.next();
            
            System.out.println(repeatCharacter.repeat(repeatNum));
        }

    }
}
