import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char[] inputtext = sc.next().toCharArray();
        
        int count = 0;
        for (char t : inputtext) {
            // System.out.println(t);
            if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {
                count += 1;
            }
        }
        
        System.out.println(count);
    }
}
