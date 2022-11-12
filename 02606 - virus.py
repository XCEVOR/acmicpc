import sys
inputdata = sys.stdin.readline

def dfs(V):
    visited_dfs[V] = 1
    # print(V, end = ' ')
    
    for i in range(1, computer + 1):
        if(visited_dfs[i] == 0 and matrix[V][i] == 1):
            dfs(i)
    

if __name__ == "__main__":
    computer = int(inputdata().strip())
    linked = int(inputdata().strip())
    matrix = [[0] * (computer + 1) for _ in range(computer + 1)]
    visited_dfs = [0] * (computer + 1)
    for i in range(linked):
        a, b = map(int, inputdata().split())
        matrix[a][b] = matrix[b][a] = 1

    dfs(1)
    # print(matrix)
    print(visited_dfs.count(1) - 1)
