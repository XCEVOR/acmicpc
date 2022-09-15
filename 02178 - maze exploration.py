# 미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다. 
# 이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 
# 최소의 칸 수를 구하는 프로그램을 작성하시오.

import sys
inputdata = sys.stdin.readline
from collections import deque

def fnBFS(x, y, graph):
    
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]
    
    queue = deque()
    queue.append((x, y))
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            elif graph[nx][ny] == 1:
                graph[nx][ny] += graph[x][y]
                queue.append((nx, ny))



n, m = map(int, inputdata().split())
graph = []

for _ in range(n):
    graph.append(list(map(int, input())))
    
fnBFS(0, 0, graph)
print(graph[n-1][m-1])



# 7 7
# 1011111
# 1110001
# 1000001
# 1000001
# 1000001
# 1000001
# 1111111

# 13
