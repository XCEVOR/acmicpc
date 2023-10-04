import java.util.Scanner;
import java.util.HashMap;


class MajorGPACalculator {
    private HashMap<String, Double> gradeMap;
    private double totalGradePoints;
    private double totalCredits;
    
    public MajorGPACalculator() {
        gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);
        
        totalGradePoints = 0.0;
        totalCredits = 0;
    }
    
    public void calculateGPA(Scanner sc) {
        int numCourses = 20;
        
        for (int i = 0; i < numCourses; i++) {
            String courseName = sc.next();
            double credits = sc.nextDouble();
            String grade = sc.next();
            
            Double gradePoints = gradeMap.get(grade);
            
            if (grade.equals("P")) {
                continue;
            }
            
            totalGradePoints += gradePoints * credits;
            totalCredits += credits;
        }
    }
    
    public double getMajorGPA() {
        return totalGradePoints / totalCredits;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        MajorGPACalculator calculator = new MajorGPACalculator();
        calculator.calculateGPA(sc);
        
        double majorGPA = calculator.getMajorGPA();
        
        System.out.println(majorGPA);
    }
}
