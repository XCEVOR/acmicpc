# 자연수 \(N\)과 정수 \(K\)가 주어졌을 때 이항 계수 
# \(\binom{N}{K}\)를 10,007로 나눈 나머지를 구하는 프로그램을 작성하시오.

import sys

N, K = map(int, sys.stdin.readline().split())

def fnFactorial(n):
    if n == 0:
        return 1
    else:
        element = 1
        for i in range(2, n+1):
            element *= i
        return element

def fnBinomialCoefficient(n, k):
    return fnFactorial(n) // fnFactorial(k) // fnFactorial(n-k)         # "/"는 이미 계산이 float로 이루어진 뒤에 int로 변환하기 때문에 float로 나온 결과에서 발생한 오차는 복구되지 않습니다. "//"는 항상 정확하게 몫을 구하는 연산을 수행합니다.
    
result_BC = fnBinomialCoefficient(N, K)

print(result_BC)
print(result_BC % 10_007)



# 1000 500

# 270288240945436569515614693625975275496152008446548287007392875106625428705522193898612483924502370165362606085021546104802209750050679917549894219699518475423665484263751733356162464079737887344364574161119497604571044985756287880514600994219426752366915856603136862602484428109296905863799821216320
# 5418