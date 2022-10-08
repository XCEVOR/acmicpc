import sys
inputdata = sys.stdin.readline

N = int(inputdata().strip())
time_ls = list(map(int, inputdata().split()))

# print(time_ls)          #
time_ls.sort()
# print(time_ls)          #

t_sum = 0
total_sum = 0
for t in time_ls:
    t_sum += t
    total_sum += t_sum

print(total_sum)
