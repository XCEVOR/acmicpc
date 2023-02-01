import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        int[] numArr = new int[testCase];
        
        for (int i = 0; i < testCase; i++) {
            numArr[i] = sc.nextInt();
        }
        
        int findNum = sc.nextInt();
        int count = 0;
        for (int i = 0; i < testCase; i++) {
            if (findNum == numArr[i]) {
                count += 1;
            }
        }
        
        System.out.print(count);
        
    }
}
