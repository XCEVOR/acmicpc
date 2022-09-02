# 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

# 산술평균 : N개의 수들의 합을 N으로 나눈 값
# 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
# 최빈값 : N개의 수들 중 가장 많이 나타나는 값
# 범위 : N개의 수들 중 최댓값과 최솟값의 차이

# N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

import sys
from collections import Counter                        

numbers = []

N = int(sys.stdin.readline())

for _ in range(N):
    numbers.append(int(sys.stdin.readline().strip()))

print(numbers) 
numbers.sort()

def fnCountMode(numbers):
    count_mode = Counter(numbers).most_common()
    if len(count_mode) > 1:
        if count_mode[0][1] == count_mode [1][1]:
            return count_mode[1][0]
        else :
            return count_mode[0][0]
    return count_mode[0][0]

q1_average = round(sum(numbers) / N)
q2_median = numbers[N//2]
q3_mode = fnCountMode(numbers)
q4_range = max(numbers) - min(numbers)

print(q1_average)
print(q2_median)
print(q3_mode)
print(q4_range)



# 5
# -1
# -2
# -3
# -1
# -2

# [-1, -2, -3, -1, -2]

# -2
# -2
# -1
# 2