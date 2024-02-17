#include <iostream> // 표준 입력 및 출력을 위한 헤더 파일
#include <string>   // 문자열 처리를 위한 헤더 파일
#include <algorithm> // reverse 함수를 사용하기 위한 헤더 파일

using namespace std;

// 두 큰 수를 더하는 함수
string add(string a, string b) {
    string result; // 결과를 저장할 문자열
    int carry = 0; // 올림을 저장할 변수
    int i = a.length() - 1; // 문자열 a의 마지막 인덱스
    int j = b.length() - 1; // 문자열 b의 마지막 인덱스

    // 두 수를 더하고 올림이 있는 경우를 처리하는 반복문
    while (i >= 0 || j >= 0 || carry) {
        int sum = carry; // 현재 자리의 합에 올림을 더함
        if (i >= 0)
            sum += a[i--] - '0'; // 문자를 숫자로 변환하여 합에 더함
        if (j >= 0)
            sum += b[j--] - '0'; // 문자를 숫자로 변환하여 합에 더함
        carry = sum / 10; // 올림 계산
        sum %= 10; // 현재 자리의 결과 계산
        result.push_back(sum + '0'); // 결과 문자열에 결과를 추가
    }

    reverse(result.begin(), result.end()); // 결과 문자열을 뒤집어줌

    return result; // 결과 반환
}

int main() {
    string A, B; // 입력 받을 두 문자열 변수
    cin >> A >> B; // 두 문자열 입력 받음

    string result = add(A, B); // 두 수를 더한 결과를 계산
    cout << result << endl; // 결과 출력

    return 0; // 프로그램 종료
}
