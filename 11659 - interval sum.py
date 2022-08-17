import sys
N, M = map(int, sys.stdin.readline().strip().split())

numbers_ls = list(map(int, sys.stdin.readline().strip().split()))
sum = 0
hitherto_sum = [0]

print(numbers_ls)

for n in numbers_ls:
    sum += n
    hitherto_sum.append(sum)
    
for _ in range(M):
    start, finish = map(int, sys.stdin.readline().strip().split())
    interval_sum = hitherto_sum[finish] - hitherto_sum[start - 1]
    print(interval_sum)



# 5 3
# 5 4 3 2 1
# 1 3
# 2 4
# 5 5

# [5, 4, 3, 2, 1]
# 12
# 9
# 1