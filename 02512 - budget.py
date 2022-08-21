import sys

N = int(sys.stdin.readline())
local_budget_ls = list(map(int, sys.stdin.readline().split()))
budget = int(sys.stdin.readline())

local_budget_ls.sort()
low, high = 0, local_budget_ls[-1]

print(local_budget_ls)              # del print

while low <= high:
    mid = (low + high) // 2
    num = 0
    
    print(f'low= {low}')            # del print
    print(f'mid== {mid}')           # del print
    print(f'high=== {high}')        # del print
    print(f'num {num}\n')           # del print
    
    for lb in local_budget_ls:
        if lb >= mid:
            num += mid
        else:
            num += lb
    if num <= budget:
        low = mid + 1
    else:
        high = mid - 1
print(high)



# 8
# 110 150 74 112 54 144 56 112
# 480
# [54, 56, 74, 110, 112, 112, 144, 150]
# low= 0
# mid== 75
# high=== 150
# num 0

# low= 0
# mid== 37
# high=== 74
# num 0

# low= 38
# mid== 56
# high=== 74
# num 0

# low= 57
# mid== 65
# high=== 74
# num 0

# low= 57
# mid== 60
# high=== 64
# num 0

# low= 61
# mid== 62
# high=== 64
# num 0

# low= 61
# mid== 61
# high=== 61
# num 0

# 61



# 4
# 1 1 3 7
# 11
# 6

# 4
# 1 1 4 7
# 11
# 5

# 4
# 1 1 5 7
# 11
# 4

# 4
# 1 1 6 7
# 11

# 8
# 110 150 74 112 54 144 56 112
# 480
# 답: 61

# 6
# 77 89 61 118 91 142
# 120
# 답: 20

