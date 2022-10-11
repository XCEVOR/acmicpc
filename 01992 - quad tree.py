import sys
inputdata = sys.stdin.readline

def fnCompressor(x, y, N):
    wb_check = wbscreen_ls[x][y]
    for i in range(x, x + N):
        for j in range(y, y + N):
            if wb_check != wbscreen_ls[i][j]:
                print("(", end='')
                fnCompressor(x, y, N//2)
                fnCompressor(x, y + N//2, N//2)
                fnCompressor(x + N//2, y, N//2)
                fnCompressor(x + N//2, y + N//2, N//2)
                print(")", end='')
                return

    if wb_check == 0:
        print(0, end='')
    if wb_check == 1:
        print(1, end='')


if __name__ == "__main__":
    N = int(inputdata().strip())
    wbscreen_ls = [list(map(int, inputdata().strip())) for _ in range(N)]
    
    # print(wbscreen_ls)
    
    fnCompressor(0, 0, N)
