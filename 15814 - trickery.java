import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        char[] textArr = sc.next().toCharArray();
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            char temp = textArr[a];
            textArr[a] = textArr[b];
            textArr[b] = temp;
        }
        
        for (char c : textArr) {
            System.out.print(c);
        }

    }
}
