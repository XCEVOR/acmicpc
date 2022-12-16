import sys
inputdata = sys.stdin.readline
from collections import deque


def fnMinimumLog(N):
    log_ls.sort()
    # print(log_ls)           # test print
    
    new_log_ls = deque()
    for i in range(N):
        if i % 2 == 0:
            new_log_ls.append(log_ls[i])
        elif i % 2 == 1:
            new_log_ls.appendleft(log_ls[i])
    # print(new_log_ls)           # test print

    minimum = abs(new_log_ls[-1] - new_log_ls[0])           # 리스트 처음과 끝 값의 차를 초기값으로 지정.
    for i in range(N - 1):
        diff = abs(new_log_ls[i + 1] - new_log_ls[i])
        if minimum < diff:
            minimum = diff
    
    print(minimum)


if __name__ == "__main__":
    T = int(inputdata().strip())
    
    for _ in range(T):
        N = int(inputdata().strip())
        log_ls = list(map(int, inputdata().split()))
        
        fnMinimumLog(N)
