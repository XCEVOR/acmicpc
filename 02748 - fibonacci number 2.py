import sys
inputdata = sys.stdin.readline


def fnFibonacci(n):
    num_ls = [0] * (n + 1)
    num_ls[0] = 0
    num_ls[1] = 1
    
    for i in range(2, n + 1):
        num_ls[i] = num_ls[i - 1] + num_ls[i - 2]
    
    print(num_ls[n])
    

if __name__ == "__main__":
    n = int(inputdata().strip())
    
    fnFibonacci(n)
