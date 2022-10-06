import sys
inputdata = sys.stdin.readline

N, K = map(int, inputdata().split())
coins_ls = []

for _ in range(N):
    coin = int(inputdata().strip())
    coins_ls.append(coin)

print(coins_ls)         #

count = 0
while K > 0:
    if K < coins_ls[-1]:
        coins_ls.pop()
        print(f'coins_ls: {coins_ls}')          #
    else:
        count += K // coins_ls[-1]
        K %= coins_ls[-1]
    print(f'K: {K}')            #

print(count)
