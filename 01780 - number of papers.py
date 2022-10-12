import sys
inputdata = sys.stdin.readline

def fnPaperDivider(x, y, N):
    global count_minusone
    global count_zero
    global count_plusone
    
    num_check = paper_ls[x][y]
    
    for i in range(x, x + N):
        for j in range(y, y + N):
            if num_check != paper_ls[i][j]:
                fnPaperDivider(x, y, N//3)
                fnPaperDivider(x, y + N//3*1, N//3)
                fnPaperDivider(x, y + N//3*2, N//3)
                fnPaperDivider(x + N//3*1, y, N//3)
                fnPaperDivider(x + N//3*2, y, N//3)
                fnPaperDivider(x + N//3*1, y + N//3*1, N//3)
                fnPaperDivider(x + N//3*1, y + N//3*2, N//3)
                fnPaperDivider(x + N//3*2, y + N//3*1, N//3)
                fnPaperDivider(x + N//3*2, y + N//3*2, N//3)
                return
    
    if num_check == -1:
        count_minusone += 1
    elif num_check == 0:
        count_zero += 1
    elif num_check == 1:
        count_plusone += 1


if __name__ == "__main__":
    N = int(inputdata().strip())
    paper_ls = [list(map(int, inputdata().split())) for _ in range(N)]
    
    # print(N)          #
    # print(paper_ls)           #
    
    count_minusone = 0
    count_zero = 0
    count_plusone = 0
    
    fnPaperDivider(0, 0, N)
    
    print(count_minusone)
    print(count_zero)
    print(count_plusone)
