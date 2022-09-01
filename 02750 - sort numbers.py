# N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

import sys

N = int(sys.stdin.readline().strip())
numbers_ls = [None] * N

for i in range(N):
    numbers_ls[i] = int(sys.stdin.readline().strip())
    
numbers_ls.sort()

print(*numbers_ls, sep='\n')



# 5
# 5
# 2
# 3
# 4
# 1

# 1
# 2
# 3
# 4
# 5