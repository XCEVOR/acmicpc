import sys
inputdata = sys.stdin.readline


def fnMaxLengthSnake(L):
    fruit_ls.sort()
    
    for f in fruit_ls:
        if L >= f:
            L += 1
        else:
            break
    print(L)


if __name__ == "__main__":
    N, L = map(int, inputdata().split())
    fruit_ls = list(map(int, inputdata().split()))
    
    fnMaxLengthSnake(L)
