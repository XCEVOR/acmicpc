import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String firstLetter = sc.next();
        
        HashMap<String, String> clubNames = new HashMap<>();
        clubNames.put("M", "MatKor");
        clubNames.put("W", "WiCys");
        clubNames.put("C", "CyKor");
        clubNames.put("A", "AlKor");
        clubNames.put("$", "$clear");
        
        String clubName = clubNames.get(firstLetter);
        
        System.out.println(clubName);
    }
}
