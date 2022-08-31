# 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

import sys

N = int(sys.stdin.readline().strip())

def fnFactorial(N):
    result = 1
    if N > 0:
        result = N * fnFactorial(N-1)
    return result

if N == 0:
    print(1)
else:
    print(fnFactorial(N))



# 10

# 3628800