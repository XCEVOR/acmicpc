import sys
inputdata = sys.stdin.readline
sys.setrecursionlimit(10000)

def fnDFS(x, y):
    dx = [0, 0, -1, 1]
    dy = [1, -1, 0, 0]
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        
        if (0 <= nx < M) and (0 <= ny < N):
            if matrix[ny][nx] == 1:
                matrix[ny][nx] = -1
                fnDFS(nx, ny)


if __name__ == "__main__":
    T = int(inputdata().strip())
    for _ in range(T):
        M, N, K = map(int, inputdata().split())
        matrix = [[0] * M for _ in range(N)]
        cnt = 0
        
        for _ in range(K):
            m, n = map(int, inputdata().split())
            matrix[n][m] = 1
        # print(matrix)           # test print
            
        for i in range(M):
            for j in range(N):
                if matrix[j][i] == 1:
                    fnDFS(i, j)
                    cnt += 1
        
        print(cnt)
