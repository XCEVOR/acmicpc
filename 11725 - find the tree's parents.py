import sys
inputdata = sys.stdin.readline
from collections import deque

def fnBFS(graph, v, visited):
    que = deque([v])
    
    visited[v] = True
    while que:
        x = que.popleft()
        for i in graph[x]:
            if not visited[i]:
                result[i] = x
                que.append(i)
                visited[i] = True
        # print(f'que: {que}')          # test print
        # print(f'visited: {visited}')          # test print
        # print(f'result: {result}')           # test print
        # print(' ')          # test print


if __name__ == "__main__":
    N = int(inputdata().strip())
    graph = [[] for _ in range(N + 1)]
    for i in range(N - 1):
        a, b = map(int, inputdata().split())
        graph[a].append(b)
        graph[b].append(a)
    # print(f'graph: {graph}')            # test print
    
    visited = [False] * (N + 1)
    result = [0] * (N + 1)
    
    fnBFS(graph, 1, visited)
    
    for i in range(2, N + 1):
        print(result[i])
