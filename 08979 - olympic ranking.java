import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// 각 나라의 정보를 저장하는 클래스
class Country {
    int number; // 나라 번호
    int gold;   // 금메달 수
    int silver; // 은메달 수
    int bronze; // 동메달 수
    int rank;   // 등수

    // constructor
    public Country(int number, int gold, int silver, int bronze) {
        this.number = number;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.rank = 1; // 초기 등수를 1로 설정
    }
}

// 메인 클래스
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 국가의 수와 등수를 알고 싶은 국가 입력
        int N = sc.nextInt(); // 국가의 수
        int K = sc.nextInt(); // 등수를 알고 싶은 국가
        
        // 각 국가의 정보를 입력 받아 리스트에 저장
        List<Country> countries = inputCountries(N, sc);
        
        // 국가들의 등수 계산
        calculateRanks(countries);
        
        // 입력으로 주어진 국가의 등수 출력
        printRankOfCountry(K, countries);
    }
    
    // 국가 정보를 입력 받는 메서드
    private static List<Country> inputCountries(int N, Scanner sc) {
        List<Country> countries = new ArrayList<>();
        
        // 각 국가의 정보 입력 받기
        for (int i = 1; i <= N; i++) {
            int gold = sc.nextInt();   // 금메달 수 입력
            int silver = sc.nextInt(); // 은메달 수 입력
            int bronze = sc.nextInt(); // 동메달 수 입력
            
            // 각 국가의 정보를 constructor를 통해 객체로 만들고 리스트에 추가
            countries.add(new Country(i, gold, silver, bronze));
        }
        
        return countries; // 국가 정보가 담긴 리스트 반환
    }

    // 국가들의 등수를 계산하는 메서드
    private static void calculateRanks(List<Country> countries) {
        for (Country country : countries) {
            for (Country opponent : countries) {
                // 자기 자신과의 비교는 스킵
                if (country == opponent)
                    continue;
                    
                // 국가 간 메달 수를 비교하여 등수 결정
                if (country.gold < opponent.gold ||
                    (country.gold == opponent.gold && country.silver < opponent.silver) ||
                    (country.gold == opponent.gold && country.silver == opponent.silver && country.bronze < opponent.bronze)) {
                    country.rank++; // 등수 증가
                }
            }
        }
    }

    // 입력으로 주어진 국가의 등수를 출력하는 메서드
    private static void printRankOfCountry(int K, List<Country> countries) {
        // 주어진 국가 번호에 해당하는 국가를 찾아서 등수 출력
        for (Country country : countries) {
            if (country.number == K) {
                System.out.println(country.rank); // 국가의 등수 출력
                break; // 등수를 찾았으면 반복문 종료
            }
        }
    }
}
