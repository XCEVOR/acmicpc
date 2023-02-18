import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String inputStr = sc.next();
        
        String[] sNum = inputStr.split(",");
        
        int total_sum = 0;
        for (String n : sNum) {
//            System.out.println(n);  // TEST PRINT
            total_sum += Integer.parseInt(n);
        }
        
        System.out.print(total_sum);
    }
}
