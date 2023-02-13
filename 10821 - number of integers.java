import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        char[] arr = sc.next().toCharArray();
        int count = 1;
        for (char a : arr) {
            if (a - '0' == ',' - '0') {
                count += 1;
            }
        }
        
        System.out.print(count);
    }
}
