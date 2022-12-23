import sys
inputdata = sys.stdin.readline


def fnChange(c):
    c25 = c // 25
    c = c % 25
    c10 = c // 10
    c = c % 10
    c05 = c // 5
    c01 = c % 5
    
    print(c25, c10, c05, c01)


if __name__ == "__main__":
    t = int(inputdata().strip())
    for _ in range(t):
        c = int(inputdata().strip())
        
        fnChange(c)
