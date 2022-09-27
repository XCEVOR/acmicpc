# 오늘도 서준이는 동적 프로그래밍 수업 조교를 하고 있다. 
# 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

# 오늘은 n의 피보나치 수를 재귀호출과 동적 프로그래밍으로 구하는 알고리즘을 배웠다. 
# 재귀호출에 비해 동적 프로그래밍이 얼마나 빠른지 확인해 보자. 
# 아래 의사 코드를 이용하여 n의 피보나치 수를 구할 경우 코드1 코드2 실행 횟수를 출력하자.

import sys
inputdata = sys.stdin.readline

def fnFibonacciByRecursion(num):
    global count_rec
    
    count_rec += 1                  # 다음에 나올 fnFibonacciByRecursion 를 위한 카운트.
    
    if num == 1 or num == 2:
        count_rec -= 1              # 다음에 fnFibonacciByRecursion 가 실행 되지 않기 때문에 빼줌.
        return 1
    else:
        num = fnFibonacciByRecursion(num - 1) + fnFibonacciByRecursion(num - 2)
        return num

def fnFibonacciByDynamic(num):
    global count_dyn
    
    fib_ls[1], fib_ls[2] = 1, 1
    
    for i in range(3, num + 1):
        count_dyn += 1              # for 문에 의한 반복 수행만 코드 실행 횟수로 본다.
        fib_ls[i] = fib_ls[i - 1] + fib_ls[i - 2]
    return fib_ls[num]


num = int(inputdata().strip())
fib_ls = [None for _ in range(num + 1)]
count_rec, count_dyn = 0, 0

fnFibonacciByRecursion(num)
fnFibonacciByDynamic(num)

print(count_rec + 1, count_dyn)     # fnFibonacciByRecursion(num) 실행시 처음 함수 시작으로 인한 횟수 1 더함.

count_rec, count_dyn = 0, 0
print(fnFibonacciByRecursion(num), fnFibonacciByDynamic(num))



# 30

# 832040 28
