import sys
inputdata = sys.stdin.readline

def fnOneTwoThree(T, nsum_ls):
    nsum_ls[1] = 1
    nsum_ls[2] = 2
    nsum_ls[3] = 4
    
    for i in range(4, 11):
        nsum_ls[i] = nsum_ls[i - 3] + nsum_ls[i - 2] + nsum_ls[i - 1]
        nsum_ls[i] = sum(nsum_ls[i-3 : i])
        
    return nsum_ls


if __name__ == "__main__":
    T = int(inputdata().strip())
    nsum_ls = [None] * 11
    # print(nsum_ls)         # test print
    
    nsum_ls = fnOneTwoThree(T, nsum_ls)
    # print(nsum_ls)         # test print
    
    for _ in range(T):
        n = int(inputdata().strip())
        print(nsum_ls[n])
