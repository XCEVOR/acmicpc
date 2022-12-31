import sys
inputdata = sys.stdin.readline


def fnExtendList():
    A_ls.extend(B_ls)
    A_ls.sort()
    
    print(*A_ls)


if __name__ == "__main__":
    n, m = map(int, inputdata().split())
    A_ls = list(map(int, inputdata().split()))
    B_ls = list(map(int, inputdata().split()))
    
    fnExtendList()
