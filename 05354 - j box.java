import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();  // 테스트 케이스 개수 입력
        
        // 각 테스트 케이스에 대해 반복
        for (int i = 0; i < testCases; i++) {
            int size = sc.nextInt();  // 박스 크기 입력
            
            // J박스 출력
            printJBox(size);
            
            if (i < testCases - 1) {
                // 테스트 케이스 사이에 빈 줄 출력
                System.out.println();
            }
        }
    }
    
    public static void printJBox(int size) {
        // 박스 크기가 1인 경우
        if (size == 1) {
            System.out.println("#");  // '#' 하나만 출력하고 함수 종료
            return;
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print("#");  // 상단 가로선 출력
        }
        System.out.println();
        
        for (int i = 0; i < size - 2; i++) {
            System.out.print("#");  // 좌측 세로선 출력
            for (int j = 0; j < size - 2; j++) {
                System.out.print("J");  // 중간 'J' 출력
            }
            System.out.println("#");  // 우측 세로선 출력
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print("#"); // 하단 가로선 출력
        }
        System.out.println();
    }
    
}



/*


5
1
2
3
5
4



#

##
##

###
#J#
###

#####
#JJJ#
#JJJ#
#JJJ#
#####

####
#JJ#
#JJ#
####


*/
