import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // DNA의 수 N과 문자열의 길이 M 입력
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // N개의 DNA를 저장할 배열
        String[] dnaArray = new String[N];
        
        // DNA 입력
        for (int i = 0; i < N; i++) {
            dnaArray[i] = sc.next();
        }
        
        // Hamming Distance의 합이 가장 작은 DNA 찾기
        String resultDNA = findMinimumHammingDistanceDNA(dnaArray, M);
        
        // 결과 출력
        System.out.println(resultDNA);
        System.out.println(calculateTotalHammingDistance(resultDNA, dnaArray));
    }
    
    // Hamming Distance의 합이 가장 작은 DNA 찾기
    private static String findMinimumHammingDistanceDNA(String[] dnaArray, int M) {
        StringBuilder resultDNA = new StringBuilder();
        
        // 각 위치에서 가장 많이 등장한 뉴클레오티드 선택
        for (int i = 0; i < M; i++) {
            // A, C, G, T 각 뉴클레오티드의 등장 횟수를 저장하는 배열
            int[] nucleotideCount = new int[26];
            
            // 현재 위치에서 각 뉴클레오티드의 등장 횟수 세기
            for (String dna : dnaArray) {
                char currentNucleotide = dna.charAt(i);
                // ASCII 코드 값으로 index 번호를 얻음
                nucleotideCount[currentNucleotide - 'A']++;
            }
            
            // 가장 많이 등장한 뉴클레오티드 선택
            int maxCountIndex = 0;
            for (int j = 1; j < nucleotideCount.length; j++) {
                if (nucleotideCount[j] > nucleotideCount[maxCountIndex]) {
                    maxCountIndex = j;
                }
            }
            
            // 결과 DNA에 추가
            // ASCII 코드를 활용하여 뉴클레오티드 문자를 얻음
            resultDNA.append((char) ('A' + maxCountIndex));
        }
        
        return resultDNA.toString();
    }
    
    // Hamming Distance의 합 계산
    private static int calculateTotalHammingDistance(String resultDNA, String[] dnaArray) {
        int totalDistance = 0;
        for (String dna : dnaArray) {
            totalDistance += hammingDistance(resultDNA, dna);
        }
        return totalDistance;
    }
    
    // Hamming Distance 계산
    private static int hammingDistance(String dna1, String dna2) {
        int distance = 0;
        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }
    
}
