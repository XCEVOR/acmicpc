import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 28) {
            int number = sc.nextInt();
            numbers.add(number);
        }
        // System.out.println(numbers);  // TEST PRINT
        
        List<Integer> result = findMissingNumbers(numbers);
        
        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }
    
    public static List<Integer> findMissingNumbers(Set<Integer> numbers) {
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            if (!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }
        
        return missingNumbers;
    }
    
}
