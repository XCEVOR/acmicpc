import sys
import math

testsite_N = int(sys.stdin.readline())
students_ls_A = list(map(int, sys.stdin.readline().split()))
mproctor_B, proctor_C = map(int, sys.stdin.readline().split())

total_protor = 0

for stdt in students_ls_A:
    if stdt < mproctor_B:
        total_protor += 1
        
    else:
        stdt -= mproctor_B
        total_protor += 1 + math.ceil(stdt / proctor_C)
        print(f'type 1: {total_protor}')                        # check printer
        
print(total_protor)



# 8
# 5 10 30 235 1 23 24 101
# 10 3
# type 1: 2
# type 1: 10
# type 1: 86
# type 1: 93
# type 1: 99
# type 1: 131
# 131