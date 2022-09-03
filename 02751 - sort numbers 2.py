# N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

import sys

N = int(input())
numbers = []

for _ in range(N) :
    numbers.append(int(sys.stdin.readline()))
    
numbers.sort()

for n in numbers :
    print(n)
    
    
    
# 5
# 5
# 4
# 3
# 2
# 1

# 1
# 2
# 3
# 4
# 5