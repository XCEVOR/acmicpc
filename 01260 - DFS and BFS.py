# 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
# 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
# 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 
# 정점 번호는 1번부터 N번까지이다.

def fnDFS(v):
    print(v, end=' ')
    visited[v] = 1
    
    for i in range(1, n + 1):
        if visited[i] == 0 and s[v][i] == 1:
            fnDFS(i)
            
def fnBFS(v):
    queue = [v]
    visited[v] = 0
    
    while(queue):
        v = queue[0]
        print(v, end=' ')
        del queue[0]
        
        for i in range(1, n + 1):
            if visited[i] == 1 and s[v][i] == 1:
                queue.append(i)
                visited[i] = 0


n, m, v = map(int, input().split())
s = [[0] * (n + 1) for i in range(n + 1)]
visited = [0 for i in range(n + 1)]

for i in range(m):
    x, y = map(int, input().split())
    s[x][y] = 1
    s[y][x] = 1
    
fnDFS(v)
print()
fnBFS(v)



# 4 5 1
# 1 2
# 1 3
# 1 4
# 2 4
# 3 4

# 1 2 4 3
# 1 2 3 4
