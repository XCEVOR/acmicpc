import sys
inputdata = sys.stdin.readline


def fnCutPaper(w, h):
    cutting_ls.sort(key = lambda x :( x[0], x[1]))
    # print(f'cutting_ls sorted: {cutting_ls}') # TEST PRINT
    
    height_ls = []
    width_ls = []
    for i in range(1, len(cutting_ls)):
        if cutting_ls[i][0] == 0:
            h_diff = cutting_ls[i][1] - cutting_ls[i - 1][1]
            height_ls.append(h_diff)
        elif cutting_ls[i][0] == 1:
            w_diff = cutting_ls[i][1] - cutting_ls[i - 1][1]
            width_ls.append(w_diff)
    # print(f'height_ls: {height_ls}') # TEST PRINT
    # print(f'width_ls: {width_ls}') # TEST PRINT
    
    print(max(height_ls) * max(width_ls))


if __name__ == "__main__":
    w, h = map(int, inputdata().split())
    n = int(inputdata().strip())
    
    cutting_ls = [[0, 0], [0, h], [1, 0], [1, w]]
    
    for _ in range(n):
        cutting_ls.append(list(map(int, inputdata().split())))
    # print(f'cutting_ls default: {cutting_ls}') # TEST PRINT
    
    fnCutPaper(w, h)
