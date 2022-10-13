import sys
inputdata = sys.stdin.readline

def fnBinaryCardSearch(n, Ncard_ls, left, right):
    if left > right:
        return 0
    
    mid = (left + right) // 2
    
    if n == Ncard_ls[mid]:
        return Ncard_ls[left:right + 1].count(n)
    elif n < Ncard_ls[mid]:
        return fnBinaryCardSearch(n, Ncard_ls, left, mid - 1)
    elif Ncard_ls[mid] < n:
        return fnBinaryCardSearch(n, Ncard_ls, mid + 1, right)
    

if __name__ == "__main__":
    N = int(inputdata().strip())
    Ncard_ls = sorted(list(map(int, inputdata().split())))
    M = int(inputdata().strip())
    M_ls = list(map(int, inputdata().split()))
    
    print(f'sorted Ncard_ls: {Ncard_ls}')         # test print
    print(f'M_ls: {M_ls}')         # test print
    
    n_dic = {}
    for n in Ncard_ls:
        left = 0
        right = len(Ncard_ls) - 1
        if n not in n_dic:
            n_dic[n] = fnBinaryCardSearch(n, Ncard_ls, left, right)
            
    print(f'n_dict: {n_dic}')           # test print
    print(' '.join(str(n_dic[x]) if x in n_dic else '0' for x in M_ls ))



# 10
# 6 3 2 10 10 10 -10 -10 7 3
# 8
# 10 9 -5 2 3 4 5 -10

# sorted Ncard_ls: [-10, -10, 2, 3, 3, 6, 7, 10, 10, 10]
# M_ls: [10, 9, -5, 2, 3, 4, 5, -10]
# n_dict: {-10: 2, 2: 1, 3: 2, 6: 1, 7: 1, 10: 3}
# 3 0 0 1 2 0 0 2
