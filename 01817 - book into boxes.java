import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 책의 개수
        int M = sc.nextInt(); // 박스의 최대 무게
        LinkedList<Integer> books = new LinkedList<>(); // 책의 무게를 저장할 LinkedList
        
        // 책의 무게 입력 받기
        for (int i = 0; i < N; i++) {
            int weight = sc.nextInt();
            books.add(weight); // 입력받은 책의 무게를 LinkedList에 추가
        }
        
        int boxes = 0; // 필요한 박스의 개수
        int currentWeight = 0; // 현재 박스에 담긴 무게
        
        while (!books.isEmpty()) {
            int bookWeight = books.poll(); // 책을 꺼냄 (첫 번째 요소를 제거하고 반환)
            
            // 현재 박스에 책을 넣을 수 있으면 넣음
            if (currentWeight + bookWeight <= M) {
                currentWeight += bookWeight;
            } else {
                // 새로운 박스에 넣을 수 없다면 새로운 박스에 넣음
                currentWeight = bookWeight;
                boxes++;
            }
        }
        
        // 마지막 박스에 남은 책들을 처리
        if (currentWeight > 0) {
            boxes++;
        }
        
        System.out.println(boxes); // 필요한 박스의 개수 출력
    }
    
}
