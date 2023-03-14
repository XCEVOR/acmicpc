import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            
            String strInputNum = sc.next();
            int mid = strInputNum.length() / 2;
            
            String s1 = strInputNum.substring(mid - 1, mid);
            String s2 = strInputNum.substring(mid, mid + 1);
            
//            System.out.println(s1);  // TEST PRINT.
//            System.out.println(s2);  // TEST PRINT.
            
            if (s1.equals(s2)) {
                System.out.println("Do-it");
            }
            else {
                System.out.println("Do-it-Not");
            }
            
        }
        
    }
}
