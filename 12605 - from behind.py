import sys
inputdata = sys.stdin.readline


def fnFromBehind(testNum, text_ls):
    result = "Case #"
    result += str(testNum) + ": "
    for _ in range (len(text_ls)):
        result += text_ls.pop() + " "
    
    print(result)


if __name__ == "__main__":
    testCase = int(inputdata().strip())
    for t in range (testCase):
        text_ls = list(map(str, inputdata().split()))
        # print(text_ls)  ## TEST PRINT.
        
        fnFromBehind(t + 1, text_ls)
        
