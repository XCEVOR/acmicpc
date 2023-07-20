import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();

        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            long number = sc.nextLong();
            numbers.add(number);
        }

        long mostFrequentNumber = findMostFrequentNumber(numbers);
        System.out.print(mostFrequentNumber);
    }

    private static long findMostFrequentNumber(List<Long> numbers) {
        HashMap<Long, Integer> countMap = new HashMap<>();
        long maxNumber = 0;
        int maxCount = 0;

        for (long number : numbers) {
            int count = countMap.getOrDefault(number, 0) + 1;
            countMap.put(number, count);

            if (count > maxCount || (count == maxCount && number < maxNumber)) {
                maxCount = count;
                maxNumber = number;
            }
        }

        return maxNumber;
    }
    
}
