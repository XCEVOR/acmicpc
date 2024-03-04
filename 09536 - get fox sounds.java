import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수 입력
        int T = sc.nextInt();
        sc.nextLine();
        
        // 각 테스트 케이스에 대해 반복
        for (int i = 0; i < T; i++) {
            // 동물 소리 객체와 여우 소리 객체 생성
            AnimalSounds animalSounds = new AnimalSounds();
            FoxSounds foxSounds = new FoxSounds();
            
            // 녹음된 소리 입력 및 처리
            String[] recordedSounds = sc.nextLine().split(" ");
            while (true) {
                // 울음 소리 입력
                String input = sc.nextLine();
                // 여우 소리 확인 여부 체크
                if (input.equals("what does the fox say?")) {
                    break;
                }
                // 입력 받은 울음 소리 처리
                String[] tokens = input.split(" ");
                animalSounds.addSound(tokens[0], tokens[2]);
            }
            
            // 여우 소리 입력 및 처리
            for (String sound : recordedSounds) {
                foxSounds.addRecordedSound(sound);
            }
            
            // 여우 소리 출력
            ArrayList<String> result = foxSounds.getFoxSounds(animalSounds);
            for (String sound : result) {
                System.out.print(sound + " ");
            }
            System.out.println();
        }
    }
}

// 동물 소리 클래스
class AnimalSounds {
    private HashMap<String, String> animalSounds;
    
    // constructor
    public AnimalSounds() {
        this.animalSounds = new HashMap<>();
    }
    
    // 동물 소리 추가 메서드
    public void addSound(String name, String sound) {
        animalSounds.put(name, sound);
    }
    
    // 소리 포함 여부 확인 메서드
    public boolean hasSound(String sound) {
        return animalSounds.containsValue(sound);
    }
}

// 여우 소리 클래스
class FoxSounds {
    private ArrayList<String> recordedSounds;
    
    // constructor
    public FoxSounds() {
        this.recordedSounds = new ArrayList<>();
    }
    
    // 여우 소리 추가 메서드
    public void addRecordedSound(String sound) {
        recordedSounds.add(sound);
    }
    
    // 여우 소리 추출 메서드
    public ArrayList<String> getFoxSounds(AnimalSounds animalSounds) {
        ArrayList<String> foxSounds = new ArrayList<>();
        for (String sound : recordedSounds) {
            if (!animalSounds.hasSound(sound)) {
                foxSounds.add(sound);
            }
        }
        return foxSounds;
    }
}
