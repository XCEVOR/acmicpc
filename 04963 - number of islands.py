import sys
inputdata = sys.stdin.readline
from collections import deque

def fnBFS(a, b):
    dx = [-1, 1, 0, 0, -1, 1, -1, 1]
    dy = [0, 0, -1, 1, -1, -1, 1, 1]
    
    queue = deque([(a, b)])
    matrix[a][b] = 2            # 2로 방문 처리    
    
    while queue:
        x, y = queue.popleft()
        
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0 <= nx < h and 0 <= ny < w and matrix[nx][ny] == 1:
                matrix[nx][ny] = 2          # 2로 방문 처리
                queue.append([nx, ny])


if __name__ == "__main__":
    while True:
        w, h = map(int, inputdata().split())
        
        if (w, h) == (0, 0):
            break
        else:
            matrix = [list(map(int, inputdata().split())) for _ in range(h)]
            # print(matrix)           # test print
            
            count = 0
            for i in range(h):
                for j in range(w):
                    if matrix[i][j] == 1:           # 1로 시작하는 부분을 찾아 fnBFS 진입
                        fnBFS(i, j)
                        count += 1
            # print(matrix)           # test print
        print(count)
