import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 9명의 난쟁이 키를 저장할 배열 생성
        int[] dwarfs = new int[9];
        
        // 사용자로부터 9명의 난쟁이 키 입력
        for (int i = 0; i < 9; i++) {
            dwarfs[i] = sc.nextInt();
        }
        
        // DwarfFinder 객체 생성 및 올바른 난쟁이들을 찾음
        DwarfFinder finder = new DwarfFinder(dwarfs);
        TreeSet<Integer> correctDwarfs = finder.findCorrectDwarfs();
        
        // 올바른 난쟁이들의 키 출력
        for (int height : correctDwarfs) {
            System.out.println(height);
        }
    }
}

class DwarfFinder {
    // 난쟁이들의 키 배열
    private int[] dwarfs;
    // 올바른 난쟁이들의 키를 저장할 TreeSet
    private TreeSet<Integer> correctDwarfs;
    
    public DwarfFinder(int[] dwarfs) {
        this.dwarfs = dwarfs;
        this.correctDwarfs = new TreeSet<>();
    }

    public TreeSet<Integer> findCorrectDwarfs() {
        // 난쟁이들의 키 합 계산
        int dwarfsSum = calculateSum();
        
        // 두 명의 난쟁이를 제외한 나머지 일곱 명의 키 합이 100인 경우 찾기
        for (int i = 0; i < dwarfs.length - 1; i++) {
            for (int j = i + 1; j < dwarfs.length; j++) {
                if (dwarfsSum - dwarfs[i] - dwarfs[j] == 100) {
                    addCorrectDwarfs(i, j); // 올바른 난쟁이들의 키 추가
                    return correctDwarfs;
                }
            }
        }
        return correctDwarfs;
    }
    
    // 모든 난쟁이들의 키 합 계산 메서드
    private int calculateSum() {
        int dwarfsSum = 0;
        for (int height : dwarfs) {
            dwarfsSum += height;
        }
        return dwarfsSum;
    }
    
    // 올바른 난쟁이들의 키 추가
    private void addCorrectDwarfs(int i, int j) {
        for (int k = 0; k < dwarfs.length; k++) {
            if (k != i && k != j) {  // 100을 만드는데 해당하지 않는 키 제외
                correctDwarfs.add(dwarfs[k]);
            }
        }
    }
}
