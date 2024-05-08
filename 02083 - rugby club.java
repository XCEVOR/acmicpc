import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();
            
            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }
            
            String category = classifyMembership(age, weight);
            
            System.out.println(name + " " + category);
        }
    }
    
    private static String classifyMembership(int age, int weight) {
        if (age > 17 || weight >= 80) {
            return "Senior";
        } else {
            return "Junior";
        }
    }
}
