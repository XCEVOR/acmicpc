import sys
inputdata = sys.stdin.readline

def fnDateCalc(E, S, M):
    year = 1
    a, b, c = 1, 1, 1
    while True:
        if (a == E and b == S and c == M):
            print(year)
            break
        else:
            year += 1
            a += 1
            b += 1
            c += 1
            
            if a == 15 + 1:
                a = 1
            if b == 28 + 1:
                b = 1
            if c == 19 + 1:
                c = 1
        # print(a, b, c)          # test print


if __name__ == "__main__":
    E, S, M = map(int, inputdata().split())
    
    fnDateCalc(E, S, M)
