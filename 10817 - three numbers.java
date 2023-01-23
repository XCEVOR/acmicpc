import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
		    int num = sc.nextInt();
		    numList.add(num);
		}
// 		System.out.println(numList.toString()); //  TEST PRINT.
		
		Collections.sort(numList, Collections.reverseOrder());
// 		System.out.println(numList.toString()); // TEST PRINT.
		
		System.out.print(numList.get(1));
		
		sc.close();
	}

}
