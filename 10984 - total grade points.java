import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int semesters = sc.nextInt();
        
        for (int i = 0; i < semesters; i++) {
            int subjects = sc.nextInt();
            double totalCredits = 0;
            double totalGradePoints = 0;
            
            for (int j = 0; j < subjects; j++) {
                int credit = sc.nextInt();
                double grade = sc.nextDouble();
                
                totalCredits += credit;
                totalGradePoints += credit * grade;
                
            }
            
            double GPA = totalGradePoints / totalCredits;
            System.out.printf("%.0f %.1f\n", totalCredits, GPA);
        }
    }
}
