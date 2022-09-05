# N장의 카드에 써져 있는 숫자가 주어졌을 때, 
# M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

import sys

N, M = map(int, sys.stdin.readline().split())
card_ls = list(map(int, sys.stdin.readline().split()))

result = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            if card_ls[i] + card_ls[j] + card_ls[k] <= M :
                result = max(result, card_ls[i] + card_ls[j] + card_ls[k])
                
print(result)



# 10 500
# 93 181 245 214 315 36 185 138 216 295

# 497