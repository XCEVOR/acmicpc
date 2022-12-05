import sys
inputdata = sys.stdin.readline

def fnMinimumS():
    A_ls.sort(reverse = True)
    B_ls.sort(reverse = False)
    
    total_sum = 0
    for i in range(N):
        total_sum += A_ls[i] * B_ls[i]
    
    return total_sum


if __name__ == "__main__":
    N = int(inputdata().strip())
    A_ls = list(map(int, inputdata().split()))
    B_ls = list(map(int, inputdata().split()))
    
    result = fnMinimumS()
    
    print(result)
