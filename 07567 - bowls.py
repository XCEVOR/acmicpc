import sys
inputdata = sys.stdin.readline


def fnBowlsHeight(bowls):
    bHeight = 10
    for i in range (len(bowls) - 1):
        if bowls[i] == bowls[i + 1]:
            bHeight += 5
        elif bowls[i] != bowls[i + 1]:
            bHeight += 10
    
    print(bHeight)


if __name__ == "__main__":
    bowls = list(map(str, inputdata().strip()))
    
    fnBowlsHeight(bowls)
