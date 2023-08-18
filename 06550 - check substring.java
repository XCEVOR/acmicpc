import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().split(" ");
            String s = input[0];
            String t = input[1];

            if (isSubstring(s, t)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean isSubstring(String s, String t) {
        int sIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            if (sIndex < s.length() && s.charAt(sIndex) == t.charAt(i)) {
                sIndex++;
            }
        }
        
        return sIndex == s.length();
    }
    
}
