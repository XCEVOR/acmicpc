import sys
inputdata = sys.stdin.readline

def fnCcwCw(point_ls):
    vector1 = [point_ls[1][0] - point_ls[0][0], point_ls[1][1] - point_ls[0][1]]
    vector2 = [point_ls[2][0] - point_ls[1][0], point_ls[2][1] - point_ls[1][1]]
    func = (vector1[0] * vector2[1] - vector1[1] * vector2[0])
    
    if func > 0:
        print(1)
    elif func == 0:
        print(0)
    elif func < 0:
        print(-1)


if __name__ == "__main__":
    point_ls = [list(map(int, inputdata().split())) for _ in range(3)]
    # print(point_ls)
    
    fnCcwCw(point_ls)
