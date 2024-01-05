import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] plugCounts = new int[N];
        
        for (int i = 0; i < N; i++) {
            plugCounts[i] = sc.nextInt();
        }
        
        int maxComputer = calculateMaxComputer(N, plugCounts);
        
        System.out.println(maxComputer);
    }
    
    public static int calculateMaxComputer(int N, int[] plugCounts) {
        int totalPlugs = 0;
        
        for (int plugCount : plugCounts) {
            totalPlugs += plugCount;
        }
        
        int maxComputer = totalPlugs - (N - 1);
        
        return maxComputer;
    }
    
}
