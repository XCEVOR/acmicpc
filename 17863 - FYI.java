import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        String inputNumber = sc.next();
        String subStrNumber = inputNumber.substring(0, 3);
//        System.out.println(subStrNumber);  // TEXT PRINT.
        
        if (subStrNumber.equals("555")) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
