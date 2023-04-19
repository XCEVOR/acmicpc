import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int inputBit = -1;
        boolean isBit = true;
        
        for (int i = 0; i < 8; i++) {
            inputBit = sc.nextInt();
            if (inputBit == 9) isBit = false;
        }
        
        if (isBit == true) {
            System.out.print("S");
        }
        else if (isBit == false) {
            System.out.print("F");
        }

    }
}
