import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int i = sc.nextInt();
        
        int songs = findAtLeastCopyrightMelodies(a, i);
        
        System.out.println(songs);
    }
    
    private static int findAtLeastCopyrightMelodies(int a, int i) {
        // 평균 버림일 경우 (i - 1)
        return a * (i - 1) + 1;
    }
}
