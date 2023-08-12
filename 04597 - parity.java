import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String bitString = sc.next();
            
            if (bitString.equals("#")) break;
            
            char correctedBit = correctLastBit(bitString);
            
            System.out.println(bitString.substring(0, bitString.length() - 1) + correctedBit);
        }
    }
            
    static char correctLastBit(String bitString) {
        char parity = bitString.charAt(bitString.length() - 1);
        int countOnes = countOnes(bitString);
        
        if ((countOnes % 2 == 0 && parity == 'e') || (countOnes % 2 == 1 && parity == 'o')) {
            return '0';
        } else {
            return '1';
        }
    }
    
    static int countOnes(String bitString) {
        int count = 0;
        
        for (int i = 0; i < bitString.length() - 1; i++) {
            if (bitString.charAt(i) == '1') {
                count++;
            }
        }
        
        return count;
    }
    
}
