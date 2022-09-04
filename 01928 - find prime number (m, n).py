import sys

def fnPrimeNumber(x):
    if x == 1:
        return False
    for i in range(2, int(x**0.5 + 1)):
        if x % i == 0:
            return False
    return True

M, N = map(int, sys.stdin.readline().split())

for x in range(M, N + 1):
    if fnPrimeNumber(x) == True:
        print(x)



# 3 16

# 3
# 5
# 7
# 11
# 13
