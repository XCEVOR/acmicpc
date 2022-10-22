import sys
inputdata = sys.stdin.readline

from collections import deque

def fnNumberOfMelons(K, fence_ls):
    # 동서남북 index 가 ABABCD 형태로 반복 규칙이 일어날때까지 while 돌리기.
    while True:
        if fence_ls[0][0] == fence_ls[2][0] and fence_ls[1][0] == fence_ls[3][0]:
            break
        pop_fence = fence_ls.popleft()
        fence_ls.append(pop_fence)
        print(f'deque fence_ls: {fence_ls}')            # test print

    whole_area = fence_ls[4][1] * fence_ls[5][1]
    removed_area = fence_ls[1][1] * fence_ls[2][1]
    
    return K * (whole_area - removed_area)    
    

if __name__ == "__main__":
    fence_ls = deque()
    K = int(inputdata().strip())
    for _ in range(6):
        fence_ls.append(list(map(int, inputdata().split())))
    print(f'input fence_ls: {fence_ls}')        # test print

    result = fnNumberOfMelons(K, fence_ls)
    print(result)



# 7
# 1 60
# 3 20
# 1 100
# 4 50
# 2 160
# 3 30

# input fence_ls: deque([[1, 60], [3, 20], [1, 100], [4, 50], [2, 160], [3, 30]])
# deque fence_ls: deque([[3, 20], [1, 100], [4, 50], [2, 160], [3, 30], [1, 60]])
# deque fence_ls: deque([[1, 100], [4, 50], [2, 160], [3, 30], [1, 60], [3, 20]])
# deque fence_ls: deque([[4, 50], [2, 160], [3, 30], [1, 60], [3, 20], [1, 100]])
# deque fence_ls: deque([[2, 160], [3, 30], [1, 60], [3, 20], [1, 100], [4, 50]])
# deque fence_ls: deque([[3, 30], [1, 60], [3, 20], [1, 100], [4, 50], [2, 160]])

# 47600
