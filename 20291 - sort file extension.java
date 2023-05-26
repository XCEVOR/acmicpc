import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]) {
        
        int n = sc.nextInt();
        
        ArrayList<String> extensionList = sortExtension(n);
        
        int count = 1;
        for (int i = 1; i < extensionList.size(); i++) {
            if ( i == extensionList.size() -1 && !extensionList.get(i).equals(extensionList.get(i - 1)) ) {
                System.out.println(extensionList.get(i - 1) + " " + count);
                count = 1;
                System.out.println(extensionList.get(i) + " " + count);
            }
            else if ( i == extensionList.size() - 1 && extensionList.get(i).equals(extensionList.get(i - 1)) ) {
                System.out.println(extensionList.get(i) + " " + (count + 1));
            }
            else if ( extensionList.get(i).equals(extensionList.get(i - 1)) ) {
                count += 1;
            }
            else {
                System.out.println(extensionList.get(i - 1) + " " + count);
                count = 1;
            }
        }

    }
    
    public static ArrayList sortExtension (int n) {
        
        ArrayList<String> extensionList = new ArrayList<String>();
        
        for (int i = 0; i < n; i++) {
            String fileExtension = sc.next().split("[.]")[1];
            // System.out.println((fileExtension));  // TEST PRINT
            extensionList.add(fileExtension);
        }
        
        Collections.sort(extensionList);
        // System.out.println(extensionList);  // TEST PRINT
        
        return extensionList;
        
    }
    
}
