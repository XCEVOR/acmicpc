import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;


// 숫자 정보 클래스
class NumberInfo {
    int number;
    int firstAppearanceIndex;
    int frequency;
    
    public NumberInfo(int number, int index) {
        this.number = number;
        this.firstAppearanceIndex = index;
        this.frequency = 1;
    }
}

// 빈도수에 따라 정렬하기 위한 Comparator 클래스
class FrequencyComparator implements Comparator<NumberInfo> {
    @Override
    public int compare(NumberInfo a, NumberInfo b) {
        if (a.frequency != b.frequency) {
            // 빈도수가 다르면 빈도수에 따라 정렬
            return b.frequency - a.frequency;
        } else {
            // 빈도수가 같으면 먼저 등장한 순서에 따라 정렬
            return a.firstAppearanceIndex - b.firstAppearanceIndex;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 메시지의 길이
        int C = sc.nextInt(); // 최대 값
        
        // 숫자 정보 리스트
        List<NumberInfo> numberInfoList = new ArrayList<>();
        // 숫자 맵
        Map<Integer, NumberInfo> numberMap = new HashMap<>();
        
        // 메시지 수열 처리
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            
            if (!numberMap.containsKey(num)) {
                // 숫자가 맵에 없는 경우
                NumberInfo info = new NumberInfo(num, i);
                numberMap.put(num, info); // 맵에 추가
                numberInfoList.add(info); // 리스트에 추가
            } else {
                // 숫자가 이미 맵에 있는 경우
                NumberInfo info = numberMap.get(num);
                info.frequency++; // 빈도수 증가
            }
        }
        
        // 빈도수에 따라 리스트 정렬
        Collections.sort(numberInfoList, new FrequencyComparator());
        
        // 결과 출력
        for (NumberInfo info : numberInfoList) {
            for (int i = 0; i < info.frequency; i++) {
                System.out.print(info.number + " ");
            }
        }
    }
}
