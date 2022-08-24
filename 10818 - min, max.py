import sys

N = int(sys.stdin.readline())

numbers = list(map(int, sys.stdin.readline().split()))

print(f'{min(numbers)} {max(numbers)}')                                  # temp


        
# 5
# 20 10 35 30 7
# 7 35