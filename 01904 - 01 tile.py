import sys
inputdata = sys.stdin.readline

N = int(inputdata().strip())
dp_ls = [None] * 1_000_001

dp_ls[1] = 1
dp_ls[2] = 2

for i in range(3, N + 1):
    dp_ls[i] = (dp_ls[i - 2] + dp_ls[i - 1]) % 15746
    
result = dp_ls[N]
print(result)



# 999999

# 15745
