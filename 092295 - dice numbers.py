import sys
inputdata = sys.stdin.readline


def sumDiceNumbers(testNum):
    a, b = map(int, inputdata().split())
    return a + b
 
 
if __name__ == "__main__":
    testCase = int(inputdata())
    
    for t in range(1, testCase + 1):
        result = sumDiceNumbers(t)
        print("Case {}: {}".format(t, result))
