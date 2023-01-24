import java.util.Scanner;

public class Main {
    
    public static Scanner sc = new Scanner(System.in);
		
	static int numStar = sc.nextInt();


	public static void main(String[] args) {
		
		int count = 0;
		String star = " ".repeat(numStar); // 입력된 숫자만큼 빈 공간을 초기값으로 설정.
		
		fnRecursiveStar(count, star);
		
	}
	
	
	public static void fnRecursiveStar(int count, String star) {
	    
	    if (numStar == count) {
	        return;
	    }
	    
	    star = star.substring(1) + "*"; // 맨 앞 한자리를 지우기 위해 .substring(int) 을 이용하여 index 1 부터 마지막까지 가져온 후 "*" 를 맨 뒤에 추가.
	    System.out.println(star);
	    
	    fnRecursiveStar(count + 1, star);
	    
	}


}

