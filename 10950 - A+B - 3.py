import sys
inputdata = sys.stdin.readline

T = int(inputdata().strip())

for _ in range(T):
    A, B = map(int, inputdata().split())
    print(A + B)
