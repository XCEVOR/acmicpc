import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int cooking = sc.nextInt();
        
        String result = calcCookingEndTime(h, m, s, cooking);
        
        System.out.print(result);
    }
    
    private static String calcCookingEndTime(int h, int m, int s, int cooking) {
        int total = h * 3600 + m * 60 + s + cooking;
        
        int end_h = (total / 3600) % 24;
        int end_m = (total % 3600) / 60;
        int end_s = total % 60;
        
        return (end_h + " " + end_m + " " + end_s);
    }
    
}
