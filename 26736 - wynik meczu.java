import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] inputText = sc.next().split("");
        
        int count_A = 0;
        int count_B = 0;
        
        for (int i = 0; i < inputText.length; i++) {
            if (inputText[i].equals("A")) count_A += 1;
            else if (inputText[i].equals("B")) count_B += 1;
        }
        
        System.out.print(count_A + " : " + count_B);
        
    }
}
