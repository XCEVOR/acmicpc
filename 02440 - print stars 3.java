import java.util.Scanner;
 
public class Main {
    
    public static Scanner sc = new Scanner(System.in);
		
	static int numStar = sc.nextInt();
 
 
	public static void main(String[] args) {
		
		int count = 0;
		String star = "";
		
		fnRecursiveStar(count, star);
		
	}
	
	
	public static void fnRecursiveStar(int count, String star) {
	    
	    if (numStar == count) {
	        return;
	    }
	    
	    star = star + "*";
	    
	    fnRecursiveStar(count + 1, star);
	    
	    System.out.println(star);
	    
	}
 
 
}
