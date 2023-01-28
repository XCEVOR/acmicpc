import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int sumnum = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            sumnum += num * num;
        }
        
        int verified = sumnum % 10;
        System.out.print(verified);
    }
}
