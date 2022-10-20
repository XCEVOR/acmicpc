import sys
inputdata = sys.stdin.readline

def fnFindFromFactors(factors_ls):
    factors_ls.sort()
    # print(factors_ls)           # test print
    
    result = factors_ls[0] * factors_ls[-1]
    
    return result


if __name__ == "__main__":
    N = int(inputdata().strip())
    factors_ls = list(map(int, inputdata().split()))
    # print(factors_ls)           # test print
    
    result = fnFindFromFactors(factors_ls)
    
    print(result)
