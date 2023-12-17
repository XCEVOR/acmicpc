import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int round = sc.nextInt();
        
        int total_round = round + 1;
        
        System.out.print(total_round * 2 + " " + total_round * 3);
    }
    
}
