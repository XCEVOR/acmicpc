import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int calcT = T;

        int countA = calcT / 300;
        calcT %= 300;

        int countB = calcT / 60;
        calcT %= 60;

        int countC = calcT / 10;

        int totalTime = countA * 300 + countB * 60 + countC * 10;

        if (totalTime == T) {
            System.out.println(countA + " " + countB + " " + countC);
        } else {
            System.out.println("-1");
        }
    }
    
}
