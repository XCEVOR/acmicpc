public class Main {

    // 메인 함수
    public static void main(String[] args) {
        int start = 1000; // 주어진 범위의 시작값
        
        // 주어진 범위 내에서 싱기한 네자리 숫자 찾기
        while (start <= 9999) {
            if (isStrangeNumber(start)) {
                // 싱기한 네자리 숫자 출력
                System.out.println(start);
            }
            start++;
        }
    }
    
    // 싱기한 네자리 숫자 여부 확인하는 함수
    public static boolean isStrangeNumber(int number) {
        int base10Sum = sumOfDigits(number, 10);  // 10진수 자리수 합
        int base12Sum = sumOfDigits(number, 12);  // 12진수 자리수 합
        int base16Sum = sumOfDigits(number, 16);  // 16진수 자리수 합
        
        // 세 진법의 자리수 합이 모두 같은지 확인
        return (base10Sum == base12Sum && base12Sum == base16Sum);
    }
    
    // 각 진법별로 자리수 합을 계산하는 함수
    public static int sumOfDigits(int number, int base) {
        int sum = 0;
        while (number > 0) {
            sum += number % base; // 각 자리의 값을 더함
            number /= base; // 다음 자리로 이동
        }
        return sum;
    }

}



/*
2992
2993
2994
2995
2996
2997
2998
2999
4470
4471
4472
4473
4474
4475
4970
4971
4972
4973
4974
4975
5460
5461
5462
5463
5464
5465
5466
5467
5468
5469
5960
5961
5962
5963
6456
6457
6458
6459
7440
7441
7442
7443
7444
7445
7446
7447
7448
7449
7940
7941
7942
7943
8436
8437
8438
8439
9424
9425
9426
9427
9428
9429
9924
9925
9926
9927
9928
9929
*/
