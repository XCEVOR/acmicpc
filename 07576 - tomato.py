import sys
inputdata = sys.stdin.readline
from collections import deque

def fnWhereIsTomato(N, M, matrix):
    for i in range(N):
        for j in range(M):
            if matrix[i][j] == 1:
                que.append([i, j])

def fnBFS():
    while que:
        # print(que)          # print test
        # print(matrix)           # print test
        x, y = que.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < N and 0 <= ny < M and matrix[nx][ny] == 0:
                matrix[nx][ny] = matrix[x][y] + 1
                que.append([nx, ny])


if __name__ == "__main__":
    M, N = map(int, inputdata().split())
    matrix = [list(map(int, inputdata().split())) for _ in range(N)]
    
    que = deque([])
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    
    fnWhereIsTomato(N, M, matrix)
    
    fnBFS()
    
    result = max(map(max, matrix)) - 1
    for row in matrix:
        for tom in row:
            if tom == 0:
                result = -1
    
    print(result)
