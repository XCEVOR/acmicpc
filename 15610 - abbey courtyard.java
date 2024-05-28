import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long area = scanner.nextLong();
        
        double perimeter = calculatePerimeter(area);
        
        printPerimeter(perimeter);
    }
    
    private static double calculatePerimeter(long area) {
        double sideLength = Math.sqrt(area);
        return 4 * sideLength;
    }
    
    private static void printPerimeter(double perimeter) {
        System.out.printf("%.6f%n", perimeter);
    }
}
