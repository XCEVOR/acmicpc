# N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
# 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

import sys

N = int(input())

number_counts_ls = [0] * 10_001

for _ in range(N) :
    number_counts_ls[int(sys.stdin.readline())] += 1
    
for num in range(10_001) :
    if number_counts_ls[num] != 0 :
        for _ in range(number_counts_ls[num]) :
            print(num)



# 10
# 5
# 2
# 3
# 1
# 4
# 2
# 3
# 5
# 1
# 7

# 1
# 1
# 2
# 2
# 3
# 3
# 4
# 5
# 5
# 7