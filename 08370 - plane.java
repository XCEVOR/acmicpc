import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt(); // Business class의 행 수
        int k1 = sc.nextInt(); // Business class의 각 행의 좌석 수
        int n2 = sc.nextInt(); // Economic class의 행 수
        int k2 = sc.nextInt(); // Economic class의 각 행의 좌석 수
        
        int totalSeats = (n1 * k1) + (n2 * k2);
        
        System.out.println(totalSeats);
    }
}
