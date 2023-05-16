import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int index = 0;
        double minJunk = Math.pow(10, 9);
        
        for (int i = 0; i < n; i++) {
            int junk = sc.nextInt();
            if (junk < minJunk) {
                index = i;
                minJunk = junk;
            }
        }
        
        System.out.print(index);
        
    }
}
