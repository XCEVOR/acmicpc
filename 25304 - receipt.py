package boj_25304;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total_amount = sc.nextInt();
        int product = sc.nextInt();

        int sum_amount = 0;
        for (int i = 0; i < product; i++) {
            int amount = sc.nextInt();
            int ea = sc.nextInt();
            sum_amount += amount * ea;
        }

        if (total_amount == sum_amount) {
            System.out.println("Yes");
        } else if (total_amount != sum_amount) {
            System.out.println("No");
        }

        sc.close();
    }
}
