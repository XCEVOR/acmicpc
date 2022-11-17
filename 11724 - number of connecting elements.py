import sys
inputdata = sys.stdin.readline
sys.setrecursionlimit(10_000)

def fnDFS(v):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            fnDFS(i)


if __name__ == "__main__":
    N, M = map(int, inputdata().split())
    uv_ls = [list(map(int, inputdata().split())) for _ in range(M)]
    # print(uv_ls)            # test print
    
    graph = [[] for _ in range(N + 1)]
    # print(graph)            # test print
    for uv in uv_ls:
        # print(uv)           # test print
        graph[uv[0]].append(uv[1])
        graph[uv[1]].append(uv[0])
    # print(graph)            # test print
    
    visited = [False] * (N + 1)
    countOfConnectedBundles = 0
    for i in range(1, N+1):
        if not visited[i]:
            fnDFS(i)
            countOfConnectedBundles += 1
    
    print(countOfConnectedBundles)
