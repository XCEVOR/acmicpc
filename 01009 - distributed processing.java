import java.util.Scanner;

class Computer {
    private int a;
    private int b;

    public Computer(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculateLastComputer() {
        int lastComputer = (int) (Math.pow(a % 10, (b % 4 + 4)) % 10);
        if (lastComputer == 0) {
            lastComputer = 10;
        }
        return lastComputer;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            Computer computer = new Computer(a, b);
            int lastComputer = computer.calculateLastComputer();

            System.out.println(lastComputer);
        }
    }
}
