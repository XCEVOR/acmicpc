import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] helmetDefense = new int[N];
        for (int i = 0; i < N; i++) {
            helmetDefense[i] = sc.nextInt();
        }
        
        int[] vestDefense = new int[M];
        for (int i = 0; i < M; i++) {
            vestDefense[i] = sc.nextInt();
        }
        
        int maxHelmetDefense = Arrays.stream(helmetDefense).max().orElse(0);
        int maxVestDefense = Arrays.stream(vestDefense).max().orElse(0);
        
        int totalMaxDefense = maxHelmetDefense + maxVestDefense;
        System.out.println(totalMaxDefense);
    }
}
