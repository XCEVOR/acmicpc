import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        String result = outputTheInputText();
        
        System.out.print(result);
    }
    
    public static String outputTheInputText() {
        Scanner sc = new Scanner(System.in);

        StringBuilder output = new StringBuilder();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            output.append(line);
            if (sc.hasNextLine()) {
                output.append(System.lineSeparator());
            }
        }

        return output.toString();
    }
}
