import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String school = sc.next();
        
        if (school.equals("NLCS")) {
            System.out.print("North London Collegiate School");
        }
        else if (school.equals("BHA")) {
            System.out.print("Branksome Hall Asia");
        }
        else if (school.equals("KIS")) {
            System.out.print("Korea International School");
        }
        else if (school.equals("SJA")) {
            System.out.print("St. Johnsbury Academy");
        }

    }
}
