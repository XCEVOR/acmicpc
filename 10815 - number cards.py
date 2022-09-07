# 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 
# 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.

# @@ 포인트
# list에서 in을 수행하면 모든 요소를 처음부터 검사하면서 찾고자 하는 원소가 있는지 확인하지만, 
# set은 해시로 구현되어 있으므로 x in set이 x in list보다 일반적으로 더 빨리 동작하게 됩니다.

import sys

N = int(sys.stdin.readline().strip())
mycards_ls = set(map(int, sys.stdin.readline().split()))            # @@ List 사용하여 시간초과, set 사용.
M = int(sys.stdin.readline().strip())
checkcards_ls = list(map(int, sys.stdin.readline().split()))
oxcard_ls = [None] * M

print(mycards_ls)               #
print(checkcards_ls)            #

i = 0
for m in checkcards_ls:
    print(f'm: {m}')            #
    if m in mycards_ls:
        oxcard_ls[i] = 1
    elif m not in mycards_ls:
        oxcard_ls[i] = 0
        
    i += 1
            
print(*oxcard_ls)



# 5
# 6 3 2 10 -10
# 8
# 10 9 -5 2 3 4 5 -10

# {2, 3, 6, 10, -10}
# [10, 9, -5, 2, 3, 4, 5, -10]
# m: 10
# m: 9
# m: -5
# m: 2
# m: 3
# m: 4
# m: 5
# m: -10

# 1 0 0 1 1 0 0 1