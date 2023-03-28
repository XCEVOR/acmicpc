import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int numberOfPlayers = sc.nextInt();
        
        boolean isAnj = false;
        for (int i = 0; i < numberOfPlayers; i++) {
            String name = sc.next();
            if (name.equals("anj")) {
                isAnj = true;
            }
        }
        
        if (isAnj == true) {
            System.out.print("뭐야;");
        }
        else if (isAnj == false) {
            System.out.print("뭐야?");
        }
        
    }
}
