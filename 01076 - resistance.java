import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ResistorValue {
    
    private static Map<String, Integer> colorValues;

    public static void main(String[] args) {
        initializeColorValues();

        Scanner sc = new Scanner(System.in);

        String firstColor = sc.nextLine();
        String secondColor = sc.nextLine();
        String multiplierColor = sc.nextLine();

        long resistanceValue = calculateResistanceValue(firstColor, secondColor, multiplierColor);

        System.out.println(resistanceValue);
    }

    private static void initializeColorValues() {
        colorValues = new HashMap<>();
        colorValues.put("black", 0);
        colorValues.put("brown", 1);
        colorValues.put("red", 2);
        colorValues.put("orange", 3);
        colorValues.put("yellow", 4);
        colorValues.put("green", 5);
        colorValues.put("blue", 6);
        colorValues.put("violet", 7);
        colorValues.put("grey", 8);
        colorValues.put("white", 9);
    }

    private static long calculateResistanceValue(String firstColor, String secondColor, String multiplierColor) {
        long firstValue = colorValues.get(firstColor);
        long secondValue = colorValues.get(secondColor);
        long multiplierValue = (long) Math.pow(10, colorValues.get(multiplierColor));

        return (firstValue * 10 + secondValue) * multiplierValue;
    }
    
}
