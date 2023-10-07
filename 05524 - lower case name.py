import sys

# 표준 입력에서 한 줄씩 읽을 수 있는 inputdata 함수를 사용
inputdata = sys.stdin.readline

# 입력으로 받은 문자열을 소문자로 변환하여 출력하는 함수를 정의
def outputLowerCase(n):
    for i in range(0, n):
        # 입력에서 문자열을 읽고 앞뒤 공백과 줄바꿈 문자를 제거
        name = inputdata().strip()
        # 소문자로 변환한 후 출력
        print(name.lower())

if __name__ == "__main__":
    # 입력으로 몇 개의 문자열을 처리할지 정수로 받음
    n = int(inputdata())
    # outputLowerCase 함수를 호출하여 문자열을 처리하고 출력
    outputLowerCase(n)
