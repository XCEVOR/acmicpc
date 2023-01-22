import java.util.Arrays;

public class Main {
    
    public static void main (String[] args){
        
        int[] tenthousandArr = new int[11_000];
        
        int num = 0;
        while (num <= 10_000) {
            char[] chrNum = new char[String.valueOf(num).length()];
            chrNum = Integer.toString(num).toCharArray();
            
            // System.out.println(Arrays.toString(chrNum)); // TEST PRINT
            
            int sumNum = fnSumChar (chrNum);
            // System.out.println(sumNum); // TEST PRINT
            
            int selfNumber = num + sumNum;
            // System.out.println(selfNumber); // TEST PRINT
            
            tenthousandArr[selfNumber] = 1;
            
            num += 1;
        }
        // System.out.println(Arrays.toString(tenthousandArr)); // TEST PRINT
        
        for (int i = 0; i < 10_000; i++) {
            if (tenthousandArr[i] == 0) {
                System.out.println(i);
            }
            
        }
    
    }
    
    public static int fnSumChar (char[] strNum){
        
        int total_sum = 0;
        for (int n : strNum) {
            total_sum += n - '0';
        }
        return total_sum;
        
    }
    
}
