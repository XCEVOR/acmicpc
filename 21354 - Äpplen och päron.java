import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int p = sc.nextInt();
        
        if (a * 7 == p * 13) {
            System.out.print("lika");
        }
        else if (a * 7 > p * 13) {
            System.out.print("Axel");
        }
        else if (a * 7 < p * 13) {
            System.out.print("Petra");
        }
        
    }
}
