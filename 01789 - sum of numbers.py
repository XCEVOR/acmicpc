import sys
inputdata = sys.stdin.readline


def fnMaxN(S):
    N = 0
    i = 1
    while True:
        S = S - i
        if S < 0:
            break
        N += 1
        i += 1
    
    print(N)


if __name__ == "__main__":
    S = int(inputdata().strip())
    
    fnMaxN(S)
