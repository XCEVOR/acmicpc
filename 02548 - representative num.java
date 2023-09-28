import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int minSum = Integer.MAX_VALUE;
        int representative = 0;
        
        for (int i = 0; i < N; i++) {
            int currentSum = 0;
            for (int j = 0; j < N; j++) {
                currentSum += Math.abs(numbers[i] - numbers[j]);
            }
            
            if (currentSum < minSum || (currentSum == minSum && numbers[i] < representative)) {
                minSum = currentSum;
                representative = numbers[i];
            }
        }
        
        System.out.println(representative);
    }
    
}
