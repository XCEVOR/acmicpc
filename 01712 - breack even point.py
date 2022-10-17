import sys
inputdata = sys.stdin.readline

import math

def fnBreakEvenPoint(A, B, C):
    if C - B <= 0:
        return -1
    else:
        BEP = math.floor(A / (C - B) + 1)
        return BEP
    

A, B, C = map(int, inputdata().split())
result = fnBreakEvenPoint(A, B, C)
print(result)
