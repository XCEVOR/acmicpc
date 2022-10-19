import sys
inputdata = sys.stdin.readline

def fnFactorMuliple(a, b):
    if a < b and b % a == 0:
        return "factor"
    elif a > b and a % b == 0:
        return "multiple"
    else:
        return "neither"


if __name__ == "__main__":
    while True:
        a, b = map(int, inputdata().split())
        
        if a == 0 and b == 0:
            break
        
        result = fnFactorMuliple(a, b)
        print(result)
