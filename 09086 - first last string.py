import sys
inputdata = sys.stdin.readline


def fnFirstLast(text):
    result = text_ls[0] + text_ls[-1]
    print(result)
    

if __name__ == "__main__":
    t = int(inputdata().strip())
    
    for _ in range (t):
        text_ls = list(map(str, inputdata().strip()))
        # print(text_ls)  ## TEST PRINT.
        
        fnFirstLast(text_ls)
