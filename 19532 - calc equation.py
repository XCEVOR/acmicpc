import sys
inputdata = sys.stdin.readline

# 연립 방정식을 계산하는 함수 정의
def calcEquation(a, b, c, d, e, f):
    # x와 y 값을 계산
    x = (c * e - b * f) / (a * e - b * d)  # x = (ce - bf) / (ae - bd)의 해
    y = (a * f - c * d) / (a * e - b * d)  # y = (af - cd) / (ae - bd)의 해
    return int(x), int(y)  # 계산한 결과를 정수로 변환하여 반환

if __name__ == "__main__":
    # 입력값을 읽어와 변수에 저장
    a, b, c, d, e, f = map(int, inputdata().split())
    
    # calcEquation 함수를 호출하여 결과를 계산
    result = calcEquation(a, b, c, d, e, f)
    
    # 결과를 출력
    print(*result)  # *result를 사용하여 결과를 공백으로 구분하여 출력
