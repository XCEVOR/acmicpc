import sys
inputdata = sys.stdin.readline

def fnBinarySearch(m, NN_ls, left, right):
    if left > right:
        return 0
    
    mid = (left + right) // 2
    
    if m == NN_ls[mid]:
        return 1
    elif m < NN_ls[mid]:
        return fnBinarySearch(m, NN_ls, left, mid - 1)
    elif m > NN_ls[mid]:
        return fnBinarySearch(m, NN_ls, mid + 1, right)


if __name__ == "__main__":
    N = int(inputdata().strip())
    NN_ls = sorted(list(map(int, inputdata().split())))
    M = int(inputdata().strip())
    MM_ls = list(map(int, inputdata().split()))
    
    print(NN_ls)          #
    print(MM_ls)          #

    for m in MM_ls:
        left = 0
        right = len(NN_ls) - 1
        result = fnBinarySearch(m, NN_ls, left, right)
        print(result)



# 5
# 4 1 5 2 3
# 5
# 1 3 7 9 5

# [1, 2, 3, 4, 5]
# [1, 3, 7, 9, 5]
# 1
# 1
# 0
# 0
# 1
