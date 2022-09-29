import sys
inputdata = sys.stdin.readline

def fnW (a, b, c):
    if a <= 0 or b <= 0 or c <= 0:
        return 1
    elif a > 20 or b > 20 or c > 20:
        return fnW(20, 20, 20)
        
    if dp[a][b][c]:
        return dp[a][b][c]
    
    if a < b  < c:
        dp[a][b][c] = fnW(a, b, c-1) + fnW(a, b-1, c-1) - fnW(a, b-1, c)
    else:
        dp[a][b][c] = fnW(a-1, b, c) + fnW(a-1, b-1, c) + fnW(a-1, b, c-1) - fnW(a-1, b-1, c-1)
    return dp[a][b][c]


max_dp = 21
dp = [[[None for _ in range(max_dp)] for _ in range(max_dp)] for _ in range(max_dp)]

while True:
    a, b, c = map(int, inputdata().split())
    
    if a == -1 and b == -1 and c == -1:
        break
    
    result = fnW(a, b, c)
    print(f'w({a}, {b}, {c}) = {result}')

    # print(dp)



# 1 1 1
# 2 2 2
# 10 4 6
# 50 50 50
# -1 7 18
# -1 -1 -1

# w(1, 1, 1) = 2
# w(2, 2, 2) = 4
# w(10, 4, 6) = 523
# w(50, 50, 50) = 1048576
# w(-1, 7, 18) = 1
