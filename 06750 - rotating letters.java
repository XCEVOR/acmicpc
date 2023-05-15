import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] inputText = sc.next().split("");
        
        boolean isSign = true;
        for (String t : inputText) {
            if (t.equals("I") 
                || t.equals("O") 
                || t.equals("S") 
                || t.equals("H") 
                || t.equals("Z") 
                || t.equals("X") 
                || t.equals("N")) continue;
            else isSign = false;
        }
        
        if (isSign == true) System.out.print("YES");
        else if (isSign == false) System.out.print("NO");

    }
}
