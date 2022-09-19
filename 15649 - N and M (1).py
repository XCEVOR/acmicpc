# 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

# 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

import sys
inputdata = sys.stdin.readline

N, M = map(int, inputdata().split())

num_sequence = []

def fnDFS():
    if len(num_sequence) == M:
        print(*num_sequence)
        return
    
    for i in range(1, N + 1):
        if i not in num_sequence:
            num_sequence.append(i)
            fnDFS()
            num_sequence.pop()
            
fnDFS()



# 4 4

# 1 2 3 4
# 1 2 4 3
# 1 3 2 4
# 1 3 4 2
# 1 4 2 3
# 1 4 3 2
# 2 1 3 4
# 2 1 4 3
# 2 3 1 4
# 2 3 4 1
# 2 4 1 3
# 2 4 3 1
# 3 1 2 4
# 3 1 4 2
# 3 2 1 4
# 3 2 4 1
# 3 4 1 2
# 3 4 2 1
# 4 1 2 3
# 4 1 3 2
# 4 2 1 3
# 4 2 3 1
# 4 3 1 2
# 4 3 2 1
