import sys
inputdata = sys.stdin.readline

def fnCutColorpaper (x, y, N):
    global white_count, blue_count
    color_check = colorpaper_ls[x][y]
    
    for i in range(x, x + N):
        for j in range(y, y + N):
            if color_check != colorpaper_ls[i][j]:
                fnCutColorpaper(x, y, N//2)
                fnCutColorpaper(x, y + N//2, N//2)
                fnCutColorpaper(x + N//2, y, N // 2)
                fnCutColorpaper(x + N//2, y + N//2, N // 2)
                return

    if color_check == 0:
        white_count += 1
    if color_check == 1:
        blue_count += 1

if __name__ == "__main__":
    N = int(inputdata().strip())
    colorpaper_ls = [list(map(int, inputdata().split())) for _ in range(N)]
    white_count, blue_count = 0, 0
    
    fnCutColorpaper(0, 0, N)
    
    print(white_count)
    print(blue_count)
