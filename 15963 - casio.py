import sys
inputdata = sys.stdin.readline


def checkBatteries(n, m):
    if n == m:
        return 1
    else:
        return 0

if __name__ == "__main__":
    n, m = map(int, inputdata().split())
    
    result = checkBatteries(n, m)
    
    print(result)
