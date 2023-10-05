import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 n을 입력
        int n = sc.nextInt();
        
        // sideArr 배열을 선언하고 초기화
        int[] sideArr = new int[16];
        
        // sideArr 배열의 첫 번째 요소를 2로 초기화
        sideArr[0] = 2;
        
        // 반복문을 통해 sideArr 배열의 나머지 요소를 계산
        for (int i = 1; i <= 15; i++) {
            sideArr[i] = (sideArr[i - 1]) + (sideArr[i - 1] - 1);
        }
        
        // n번째 요소의 제곱을 출력
        System.out.println(sideArr[n] * sideArr[n]);
    }
    
}



/*

1, 2 + 1 = 3
input: 1, output: 9

2, 3 + 2 = 5
input: 2, output: 25

3, 5 + 4 = 9
input: 1, output: 81

4, 9 + 8 = 17
input: 1, output: 289

5, 17 + 16 = 33
input: 1, output: 1089

.
.
.

15, 16385 + 16384 = 32769
input: 1, output: 1073807361

*/
