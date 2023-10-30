import sys
inputdata = sys.stdin.readline

def countMaxMovements(a, b, c):
    countLeft = b - a - 1
    countRight = c - b - 1
    return max(countLeft, countRight)

if __name__ == "__main__":
    a, b, c = map(int, inputdata().split())
    
    result = countMaxMovements(a, b, c)
    
    print(result)
