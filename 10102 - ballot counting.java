import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt();
        char[] vote = sc.next().toCharArray();
        
        int countA = 0;
        int countB = 0;
        for (char vt : vote) {
            if (vt - '0' == 'A' - '0') {
                countA += 1;
            }
            else if (vt - '0' == 'B' - '0') {
                countB += 1;
            }
        }
        
        if (countA > countB) {
            System.out.print("A");
        }
        else if (countA < countB) {
            System.out.print("B");
        }
        else {
            System.out.print("Tie");
        }
    }
}
