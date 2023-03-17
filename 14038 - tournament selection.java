import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int win_count = 0;
        for (int i = 0; i < 6; i++) {
            String game = sc.next();
            if (game.equals("W")) {
                win_count += 1;
            }
        }
        
        if (win_count >=5 ) {
            System.out.print("1");
        }
        else if (win_count >=3 ) {
            System.out.print("2");
        }
        else if (win_count >=1 ) {
            System.out.print("3");
        }
        else if (win_count == 0 ) {
            System.out.print("-1");
        }
        
    }
}
