import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Read a long integer from the console representing the area of the square courtyard
        long area = scanner.nextLong();
        
        // Calculate the perimeter of the courtyard using the given area
        double perimeter = calculatePerimeter(area);
        
        // Print the calculated perimeter with six decimal places of precision
        printPerimeter(perimeter);
    }
    
    // Function to calculate the perimeter of a square given its area
    private static double calculatePerimeter(long area) {
        // Calculate the side length of the square by taking the square root of the area
        double sideLength = Math.sqrt(area);
        // The perimeter of the square is 4 times the side length
        return 4 * sideLength;
    }
    
    // Function to print the perimeter with six decimal places of precision
    private static void printPerimeter(double perimeter) {
        // Print the perimeter formatted to six decimal places
        System.out.printf("%.6f%n", perimeter);
    }
}
