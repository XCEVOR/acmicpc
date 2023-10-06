# 시스템 관련 작업을 수행하는데 사용되는 sys 모듈을 import.
import sys

# 표준 입력에서 한 줄을 읽어오는 함수를 inputdata에 할당.
# sys.stdin.readline 함수는 사용자 입력을 읽어오는 역할.
inputdata = sys.stdin.readline



# 정수 n을 입력받아서 변의 길이가 n인 정사각형의 둘레를 계산하는 함수를 정의.
def calcPerimeter(n):
    # 정사각형의 둘레를 계산. 정사각형의 각 변의 길이는 n이므로 4 * n을 반환.
    return 4 * n

# 프로그램이 직접 실행될 때 아래 코드 블록을 실행.
if __name__ == "__main__":
    # 사용자로부터 정수 n을 입력.
    n = int(inputdata())
    
    # calcPerimeter 함수를 호출하여 정사각형의 둘레를 계산하고 그 값을 result 변수에 저장.
    result = calcPerimeter(n)
    
    # 계산된 둘레 값을 출력.
    print(result)
