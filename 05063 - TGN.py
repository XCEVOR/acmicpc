import sys
inputdata = sys.stdin.readline

def fnMakeADecision(r, e, c):
    if r < (e - c):
        print("advertise")
    elif r > (e - c):
        print("do not advertise")
    elif r == (e - c):
        print("does not matter")


if __name__ == "__main__":
    N = int(inputdata().strip())
    
    for _ in range(N):
        r, e, c = map(int, inputdata().split())
        fnMakeADecision(r, e, c)
