import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] names = new String[N];
        for (int i = 0; i < N; i++) {
            names[i] = sc.nextLine();
        }

        String result = determineOrder(names);

        System.out.print(result);
    }

    public static String determineOrder(String[] names) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < names.length; i++) {
            if (names[i].compareTo(names[i - 1]) < 0) {
                increasing = false;
            } else if (names[i].compareTo(names[i - 1]) > 0) {
                decreasing = false;
            }
        }

        if (increasing) {
            return "INCREASING";
        } else if (decreasing) {
            return "DECREASING";
        } else {
            return "NEITHER";
        }
    }
    
}
