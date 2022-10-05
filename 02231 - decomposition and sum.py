import sys
inputdata = sys.stdin.readline

N = int(inputdata().strip())

for M in range(1, N + 1):
    N_check = M + sum(map(int, str(M)))
    
    if N_check == N:
        print(M)
        break
    if M == N:
        print(0)



# 1026

# 999
