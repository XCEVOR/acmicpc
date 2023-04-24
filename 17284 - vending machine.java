import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String inputLine = sc.nextLine();
        String[] numArr = inputLine.split(" ");
        
        int totalSum = 0;
        for (String num : numArr) {
            if (num.equals("1")) {
                totalSum += 500;
            }
            else if (num.equals("2")) {
                totalSum += 800;
            }
            else if (num.equals("3")) {
                totalSum += 1000;
            }
        }
        
        System.out.print(5000 - totalSum);

    }
}
