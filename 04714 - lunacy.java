import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 지구에서의 무게 변수
        double weightOnEarth;
        
        // 무한 루프 시작
        while (true) {
            // 지구에서의 무게 입력
            weightOnEarth = sc.nextDouble();
            
            // 입력이 음수인 경우 루프 종료
            if (weightOnEarth < 0) break;
            
            // 달에서의 무게 출력하는 함수 호출
            printWeightOnMoon(weightOnEarth);
        }
    }
    
    // 달에서의 무게를 출력하는 함수
    public static void printWeightOnMoon(double weightOnEarth) {
        // 달에서의 무게 계산
        double weightOnMoon = weightOnEarth * 0.167;
        
        // 지구에서의 무게와 달에서의 무게 출력
        System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", weightOnEarth, weightOnMoon);
    }
    
}
