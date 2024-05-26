import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Stack;

// 원 클래스
class Circle implements Comparable<Circle> {
    int position;  // 원의 위치
    int index;  // 원의 인덱스
    
    // Circle 클래스 constructor
    Circle(int position, int index) {
        this.position = position;
        this.index = index;
    }
    
    // 위치를 기준으로 원들을 정렬하기 위한 compareTo 메서드
    @Override
    public int compareTo(Circle other) {
        return Integer.compare(this.position, other.position);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 원의 개수 입력
        int N = Integer.parseInt(br.readLine());
        
        // 원들을 저장할 배열 생성
        Circle[] circles = new Circle[2 * N];
        
        // 각 원의 정보 입력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            // 원의 중심과 반지름 정보 입력
            int x = Integer.parseInt(st.nextToken());  // 중심의 x 좌표
            int r = Integer.parseInt(st.nextToken());  // 반지름
            
            // 각 원의 왼쪽 끝점과 오른쪽 끝점을 circles 배열에 저장
            circles[2 * i] = new Circle(x - r, i);  // 왼쪽 끝점 저장
            circles[2 * i + 1] = new Circle(x + r, i);  // 오른쪽 끝점 저장
        }
        
        // 원들을 오른쪽 끝점을 기준으로 정렬
        Arrays.sort(circles);
        
        // 모든 원이 서로 겹치지 않는지 확인하여 출력
        if (areCirclesNonIntersecting(circles)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    // 모든 원이 서로 겹치지 않는지 확인하는 메서드
    private static boolean areCirclesNonIntersecting(Circle[] circles) {
        // 겹치지 않는 왼쪽 끝점들을 저장할 스택
        Stack<Circle> stack = new Stack<>();
        
        // 모든 원들에 대해 반복하여 확인
        for (Circle circle : circles) {
            if (!stack.isEmpty() && stack.peek().index == circle.index) {
            // 스택이 비어있지 않고, 스택의 가장 위에 있는 원의 인덱스가 현재 원의 인덱스와 같다면
                stack.pop();  // 스택에서 원을 빼서 짝이 맞는지 확인
            } else {
            // 아니라면 
                stack.push(circle);  // 현재 원을 스택에 추가
            }
        }
        
        // 모든 원을 확인한 후에 스택이 비어있으면 모든 원이 서로 겹치지 않음
        return stack.isEmpty();
    }
}
