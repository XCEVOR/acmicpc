import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 토핑의 개수 입력
        int n = sc.nextInt();
        
        // PizzaMaker 객체 생성
        PizzaMaker pizzaMaker = new PizzaMaker();
        
        // 토핑 추가
        for (int i = 0; i < n; i++) {
            String inputTopping = sc.next();
            pizzaMaker.addTopping(inputTopping);
        }
        
        // 콰트로치즈피자 만들기 가능 여부 확인 및 출력
        if (pizzaMaker.canMakeQuattroCheesePizza()) {
            System.out.println("yummy");
        } else {
            System.out.println("sad");
        }
    }
}

// 피자를 만드는 클래스
class PizzaMaker {
    // 중복이 없는 토핑을 저장하기 위한 HashSet
    private HashSet<String> uniqueToppings;
    
    // constructor
    public PizzaMaker() {
        uniqueToppings = new HashSet<>();
    }
    
    // 토핑 추가 메서드
    public void addTopping(String topping) {
        uniqueToppings.add(topping);
    }
    
    // 콰트로치즈피자를 만들 수 있는지 확인하는 메서드
    public boolean canMakeQuattroCheesePizza() {
        // 치즈 토핑의 개수를 저장하기 위한 변수
        int cheeseCount = 0;
        
        // 토핑 목록을 순회하며 치즈 토핑의 개수 계산
        for (String topping : uniqueToppings) {
            if (topping.endsWith("Cheese")) {  // 토핑이 "Cheese"로 끝나면
                cheeseCount++;  // 치즈 토핑 개수 증가
                // System.out.println(cheeseCount);
            }
        }
        
        // 치즈 토핑 개수가 4개 이상이면 콰트로치즈피자를 만들 수 있음
        return cheeseCount >= 4;
    }
}
