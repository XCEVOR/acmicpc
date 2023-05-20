import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        String[] strArr = sc.next().split("");
        
        int b = 0;
        int c = 0;
        
        for (String s : strArr) {
            if (s.equals("B")) b += 1;
            else if (s.equals("C")) c += 1;
        }

        System.out.print(b / 2 + c / 2);

    }
}
