import sys
inputdata = sys.stdin.readline
sys.setrecursionlimit(10_001)

def fnRGB_DFS(x, y):
    rgb_visited[x][y] = 1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < N and 0 <= ny < N:
            if color_matrix[nx][ny] == color_matrix[x][y] and rgb_visited[nx][ny] == 0:
                fnRGB_DFS(nx, ny)

def fnGGB_DFS(x, y):
    ggb_visited[x][y] = 1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < N and 0 <= ny < N:
            if color_matrix[nx][ny] == color_matrix[x][y] and ggb_visited[nx][ny] == 0:
                fnGGB_DFS(nx, ny)


if __name__ == "__main__":
    N = int(inputdata().strip())
    color_matrix = [list(map(str, inputdata().strip())) for _ in range(N)]
    # print(color_matrix)         # test print
    
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    
    rgb_visited = [[0] * N for _ in range(N)]
    rgb_visited_count = 0
    for i in range(N):
        for j in range(N):
            if rgb_visited[i][j] == 0:
                fnRGB_DFS(i, j)
                rgb_visited_count += 1
    
    for i in range(N):
        for j in range(N):
            if color_matrix[i][j] == 'R':
                color_matrix[i][j] = 'G'
    ggb_visited = [[0] * N for _ in range(N)]
    ggb_visited_count = 0
    for i in range(N):
        for j in range(N):
            if ggb_visited[i][j] == 0:
                fnGGB_DFS(i, j)
                ggb_visited_count += 1
                
                
    print(rgb_visited_count, ggb_visited_count)
