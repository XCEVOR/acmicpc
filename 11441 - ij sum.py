import sys
inputdata = sys.stdin.readline


def fnSumList():
    sum_to = 0
    # sum_ls = [0]
    for n in num_ls:
        sum_to += n
        sum_ls.append(sum_to)
    # print(sum_ls)           # TEST PRINT

def fnSumFromIToJ(i, j):
    sumFromIToJ = sum_ls[j] - sum_ls[i - 1]
    # print(f'sumFromIToJ: {sumFromIToJ}')            # TEST PRINT
    print(sumFromIToJ)


if __name__ == "__main__":
    n = int(inputdata().strip())
    num_ls = list(map(int, inputdata().split()))
    
    sum_ls = [0]
    fnSumList()
    
    m = int(inputdata().strip())
    for _ in range(m):
        i, j = map(int, inputdata().split())
        
        fnSumFromIToJ(i, j)
