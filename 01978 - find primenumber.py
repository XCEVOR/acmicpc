import sys

N = int(sys.stdin.readline().strip())
numbers_ls = list(map(int, sys.stdin.readline().split()))

def fnPrimeNumber(x):
    if x == 1:
        return False
    for i in range(2, int(x**0.5 + 1)):
        if x % i == 0:
            return False
    return True

count = 0
for num in numbers_ls:
    # print(f'num: {num}')                    # temp
    if fnPrimeNumber(num) == True:
        count += 1
        # print(num)                          # temp
        
print(count)



# 20
# 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

# 8