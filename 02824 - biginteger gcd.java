import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 배열의 크기 입력
        int n = sc.nextInt();
        // 첫 번째 배열 생성
        BigInteger[] a = new BigInteger[n];
        // 첫 번째 배열 값 입력
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextBigInteger();
        }
        
        // 두 번째 배열의 크기 입력
        int m = sc.nextInt();
        // 두 번째 배열 생성
        BigInteger[] b = new BigInteger[m];
        // 두 번째 배열 값 입력
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextBigInteger();
        }
        
        // 최대공약수 계산기 객체 생성
        GCDCalculator gcdCalculator = new GCDCalculator(a, b);
        // 최대공약수 계산
        String result = gcdCalculator.calculateGCD();
        
        // 결과 출력
        System.out.println(result);
    }
}

class GCDCalculator {
    // 첫 번째 배열
    private BigInteger[] a;
    // 두 번째 배열
    private BigInteger[] b;
    
    // constructor
    public GCDCalculator(BigInteger[] a, BigInteger[] b) {
        this.a = a;
        this.b = b;
    }
    
    // 9자리 조건의 최대공약수 계산 메서드
    public String calculateGCD() {
        // 첫 번째 배열의 곱
        BigInteger aProduct = getProduct(a);
        // 두 번째 배열의 곱
        BigInteger bProduct = getProduct(b);
        // 두 수의 최대공약수 계산
        BigInteger gcd = getGCD(aProduct, bProduct);
        // 마지막 9자리 출력
        return getLastNineDigits(gcd);
    }
    
    // 배열의 곱 구하기
    private BigInteger getProduct(BigInteger[] arr) {
        BigInteger product = BigInteger.ONE;
        for (BigInteger num : arr) {
            product = product.multiply(num);
        }
        return product;
    }
    
    // 최대공약수 구하기
    private BigInteger getGCD(BigInteger a, BigInteger b) {
        while (!b.equals(BigInteger.ZERO)) {
            BigInteger temp = a.mod(b);
            a = b;
            b = temp;
        }
        return a;
    }
    
    // 결과의 마지막 9자리 출력
    private String getLastNineDigits(BigInteger num) {
        String numStr = num.toString();
        if (numStr.length() <= 9) {
            return numStr;
        } else {
            return numStr.substring(numStr.length() - 9);
        }
    }
}



// BigInteger 클래스:
// 입력 값이 매우 큰 경우, long 타입의 범위를 넘어서는 경우가 있으므로 BigInteger 클래스를 사용하여 임의의 정밀도 정수를 처리할 수 있도록 함.
