import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Stack;

class Circle implements Comparable<Circle> {
    int position;
    int index;
    
    Circle(int position, int index) {
        this.position = position;
        this.index = index;
    }
    
    @Override
    public int compareTo(Circle other) {
        return Integer.compare(this.position, other.position);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        Circle[] circles = new Circle[2 * N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            
            circles[2 * i] = new Circle(x - r, i);
            circles[2 * i + 1] = new Circle(x + r, i);
        }
        
        Arrays.sort(circles);
        
        if (areCirclesNonIntersecting(circles)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    private static boolean areCirclesNonIntersecting(Circle[] circles) {
        Stack<Circle> stack = new Stack<>();
        
        for (Circle circle : circles) {
            if (!stack.isEmpty() && stack.peek().index == circle.index) {
                stack.pop();
            } else {
                stack.push(circle);
            }
        }
        
        return stack.isEmpty();
    }
}
