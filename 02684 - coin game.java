import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            String[] ht = sc.next().split("");
            
            int[] result = new int[8];
            
            for (int j = 0; j < 38; j++) {
                if (ht[j].equals("T") && ht[j + 1].equals("T") && ht[j + 2].equals("T")) {
                    result[0] += 1;
                }
                else if (ht[j].equals("T") && ht[j + 1].equals("T") && ht[j + 2].equals("H")) {
                    result[1] += 1;
                }
                else if (ht[j].equals("T") && ht[j + 1].equals("H") && ht[j + 2].equals("T")) {
                    result[2] += 1;
                }
                else if (ht[j].equals("T") && ht[j + 1].equals("H") && ht[j + 2].equals("H")) {
                    result[3] += 1;
                }
                else if (ht[j].equals("H") && ht[j + 1].equals("T") && ht[j + 2].equals("T")) {
                    result[4] += 1;
                }
                else if (ht[j].equals("H") && ht[j + 1].equals("T") && ht[j + 2].equals("H")) {
                    result[5] += 1;
                }
                else if (ht[j].equals("H") && ht[j + 1].equals("H") && ht[j + 2].equals("T")) {
                    result[6] += 1;
                }
                else if (ht[j].equals("H") && ht[j + 1].equals("H") && ht[j + 2].equals("H")) {
                    result[7] += 1;
                }
            }
            
            for (int r : result) {
                System.out.print(r + " ");
            }
            System.out.println();
            
        }
        
    }
}
