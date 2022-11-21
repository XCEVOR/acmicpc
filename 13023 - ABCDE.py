import sys
inputdata = sys.stdin.readline

## 사람 x 에 대해 관계의 수 depth 를 fnDFS 에서 받음.
def fnDFS(depth, x):
    global result
    ## 5명이 4번의 관계 이상을 갖는다면 result = True 표시하고 탈출.
    if depth == 4:
        result = True
        return
    
    ## 한 사람(노드)을 선택하여 그 사람과 관계가 있는 모두를 탐색.
    for i in relationships[x]:
        ## 방문하지 않았으면 방문표시를 하고 depth + 1, 다음 i 에 대해 fnDFS 진입. 그리고 현재 방문 위치는 초기화.
        if not visited[i]:
            visited[i] = True
            fnDFS(depth + 1, i)
            visited[i] = False


if __name__ == "__main__":
    ## N, M 입력.
    N, M = map(int, inputdata().split())
    
    ## 친구 관계를 저장할 relationships, 방문을 표시할 visited 그리고 결과를 False 로 초기화.
    relationships = [[] for _ in range(N)]
    visited = [False] * N
    result = False
    
    ## 친구 관계를 relationships 에 index 에 맞게 서로 저장
    for _ in range(M):
        a, b = map(int, inputdata().split())
        relationships[a].append(b)
        relationships[b].append(a)
    # print(relationships)           # test print
    
    
    ## 입력 받은 데이터를 가지고 관계의 수만큼 반복문을 돌린다.
    for x in range(N):
        ## 방문 표시를 하고 fnDFS 를 진입.
        visited[x] = True
        fnDFS(0, x)
        ## 방문 표시를 초기화하여 다음 사람(노드)를 준비. 만약 result == True 면 break.
        visited[x] = False
        if result:
            break
    
    if result:
        print(1)
    else:
        print(0)
