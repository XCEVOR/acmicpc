import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int odd_sum = 0;
        int min_num = 111;
        
        for (int i = 0; i < 7; i++) {
            int input_num = sc.nextInt();
            if (input_num % 2 == 1) {
                odd_sum += input_num;
                if (input_num < min_num) {
                    min_num = input_num;
                }
            }
        }
        
        if (odd_sum == 0) {
            System.out.print(-1);
        } else {
            System.out.println(odd_sum);
            System.out.print(min_num);
        }
        
    }
}
