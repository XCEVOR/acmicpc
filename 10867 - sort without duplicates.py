import sys
inputdata = sys.stdin.readline


def fnSortAscending():
    set_num_ls = set(num_ls)
    list_set_num_ls = list(set_num_ls)
    list_set_num_ls.sort()
    print(*list_set_num_ls)


if __name__ == "__main__":
    n = int(inputdata().strip())
    num_ls = list(map(int, inputdata().split()))
    
    fnSortAscending()
