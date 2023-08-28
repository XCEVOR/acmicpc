import java.util.Arrays;
import java.util.Scanner;

class Pizza {
    private int toppingsCount;
    private int doughPrice;
    private int toppingPrice;
    private int doughCalories;
    private int[] toppingsCalories;

    public Pizza(int toppingsCount, int doughPrice, int toppingPrice, int doughCalories, int[] toppingsCalories) {
        this.toppingsCount = toppingsCount;
        this.doughPrice = doughPrice;
        this.toppingPrice = toppingPrice;
        this.doughCalories = doughCalories;
        this.toppingsCalories = toppingsCalories;
    }

    public int calculateMaxCaloriesPerPrice() {
        Arrays.sort(toppingsCalories);

        int maxCaloriesPerPrice = doughCalories / doughPrice;

        for (int i = toppingsCount - 1; i >= 0; i--) {
            int totalPrice = doughPrice + (toppingPrice * (toppingsCount - i));
            int totalCalories = doughCalories + Arrays.stream(Arrays.copyOfRange(toppingsCalories, i, toppingsCount)).sum();

            int caloriesPerPrice = totalCalories / totalPrice;

            if (caloriesPerPrice > maxCaloriesPerPrice) {
                maxCaloriesPerPrice = caloriesPerPrice;
            }
        }

        return maxCaloriesPerPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] toppingsCalories = new int[N];
        for (int i = 0; i < N; i++) {
            toppingsCalories[i] = sc.nextInt();
        }

        Pizza pizza = new Pizza(N, A, B, C, toppingsCalories);
        int result = pizza.calculateMaxCaloriesPerPrice();

        System.out.println(result);
    }
}
