import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of datasets

        for (int i = 0; i < n; i++) {
            int A1 = sc.nextInt(); // Area of pizza slice
            int P1 = sc.nextInt(); // Price of pizza slice
            int R1 = sc.nextInt(); // Radius of circular pizza
            int P2 = sc.nextInt(); // Price of circular pizza

            // Calculate pizza area per dollar for both options
            double areaPerDollarSlice = (double) A1 / P1;
            double areaPerDollarWholePizza = Math.PI * R1 * R1 / P2;

            // Compare and output the better deal
            if (areaPerDollarSlice > areaPerDollarWholePizza) {
                System.out.println("Slice of pizza");
            } else {
                System.out.println("Whole pizza");
            }
        }
    }
    
}
