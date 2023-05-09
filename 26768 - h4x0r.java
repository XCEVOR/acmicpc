import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String inputText= sc.next();
        
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == 'a') System.out.print("4");
            else if (inputText.charAt(i) == 'e') System.out.print("3");
            else if (inputText.charAt(i) == 'i') System.out.print("1");
            else if (inputText.charAt(i) == 'o') System.out.print("0");
            else if (inputText.charAt(i) == 's') System.out.print("5");
            else System.out.print(inputText.charAt(i));
        }
        
    }
}
