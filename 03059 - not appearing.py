import sys
inputdata = sys.stdin.readline


def fnNotAppearing(text):
    alphabet_check = [0] * 26
    for i in range (26):
        alphabet_check[i] = 65 + i
    # print(alphabet_check)  ## TEST PRINT.
    
    for t in text:
        aCode = ord(t)
        alphabet_check[aCode - 65] = 0
    # print(alphabet_check)  ## TEST PRINT.
    
    print(sum(alphabet_check))


if __name__ == "__main__":
    testCase = int(inputdata().strip())
    
    for _ in range (testCase):
        text = str(inputdata().strip())
        # print(text)  ## TEST PRINT.
        
        fnNotAppearing(text)
