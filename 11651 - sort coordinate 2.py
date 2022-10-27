import sys
inputdata = sys.stdin.readline

def fnSort(coordinate_ls):
    coordinate_ls.sort(key=lambda x: (x[1], x[0]))
    # print(coordinate_ls)            # test print
    
    for coor in coordinate_ls:
        print(*coor)


if __name__ == "__main__":
    N = int(inputdata().strip())
    coordinate_ls = [list(map(int, inputdata().split())) for _ in range(N)]
    # print(coordinate_ls)            # test print
    
    fnSort(coordinate_ls)
