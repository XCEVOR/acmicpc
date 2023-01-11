import sys
inputdata = sys.stdin.readline


def fnFibonacci(n):
    fibo_ls = [0] * (n + 1)
    fibo_ls[0] = 0 
    fibo_ls[1] = 1
    
    for i in range (2, n + 1):
        fibo_ls[i] = fibo_ls[i - 1] + fibo_ls[i - 2]
    # print(fibo_ls)          # TEST PRINT
    print(fibo_ls[- 1])


if __name__ == "__main__":
    n = int(inputdata().strip())
    
    fnFibonacci(n)
