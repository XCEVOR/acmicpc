# 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

import sys
import math

A, B, V = map(int, sys.stdin.readline().split())

days = (V - B) / (A - B)
days = math.ceil(days)

print(days)



# 100 99 1000000000

# 999999901