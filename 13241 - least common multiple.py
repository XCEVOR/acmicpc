import sys
inputdata = sys.stdin.readline
 
# 두 수의 최대 공약수를 계산하는 함수
def greatestCommonDivisor(num1, num2):
    while num2:
        num1, num2 = num2, num1 % num2
    return num1
 
# 두 수의 최소 공배수를 계산하는 함수
def leastCommonMultiple(num1, num2):
    return num1 * num2 // greatestCommonDivisor(num1, num2)
 
if __name__ == "__main__":
    # 한 줄에서 두 개의 정수를 읽어와서 num1, num2 변수에 할당
    num1, num2 = map(int, inputdata().split())
    
    # 두 수의 최소 공배수를 계산하여 result 변수에 할당
    result = leastCommonMultiple(num1, num2)
    
    # 결과를 출력
    print(result)
