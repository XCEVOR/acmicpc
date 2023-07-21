import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

        if (canFormUCPC(input)) {
            System.out.print("I love UCPC");
        } else {
            System.out.print("I hate UCPC");
        }
    }

    private static boolean canFormUCPC(String input) {
        int index1stU = input.indexOf('U');
        int index2ndC = input.indexOf('C', index1stU + 1);
        int index3rdP = input.indexOf('P', index2ndC + 1);
        int index4thC = input.indexOf('C', index3rdP + 1);

        if (index1stU != -1 && index2ndC != -1 && index3rdP != -1 && index4thC != -1) {
            return true;
        } else {
            return false;
        }
    }
    
}
