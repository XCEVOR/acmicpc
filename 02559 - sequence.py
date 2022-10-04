import time
import sys
inputdata = sys.stdin.readline

N, K = map(int, inputdata().split())
days_temp_ls = list(map(int, inputdata().split()))

start = time.time()         # START TIME

sum_ls = []
sum_ls.append(sum(days_temp_ls[ : K]))

# print(sum_ls)           #

for t in range(N - K):
    sum_ls.append(sum_ls[t] - days_temp_ls[t] + days_temp_ls[K + t])

# print(sum_ls)           #

print(max(sum_ls))

end = time.time()           # END TIME
# print(f"EXECUTED in: {end - start: .10f} sec")
