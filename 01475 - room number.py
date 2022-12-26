import sys
inputdata = sys.stdin.readline


def fnNumberOfSets():
    sign_ls = [0] * 9
    for i in range(len(n_ls)):
        if n_ls[i] == 9:
            n_ls[i] = 6
        sign_ls[n_ls[i]] += 1
    # print(f'n_ls: {n_ls}')          # test print
    # print(f'sign_ls: {sign_ls}')            # test print
    
    sign_ls[6] = (sign_ls[6] + 1) // 2
    # print(f'sign_ls: {sign_ls}')            # test print
    
    print(max(sign_ls))



if __name__ == "__main__":
    n_ls = list(map(int, inputdata().strip()))
    # print(f'n_ls: {n_ls}')          # test print
    
    fnNumberOfSets()
