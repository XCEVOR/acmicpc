import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String inputText = sc.next();
        
        if (inputText.equals("N") || inputText.equals("n")) {
            System.out.print("Naver D2");
        }
        else {
            System.out.print("Naver Whale");
        }
        
    }
}
