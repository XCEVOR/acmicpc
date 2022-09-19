# 요세푸스 문제는 다음과 같다.
# 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 
# 이제 순서대로 K번째 사람을 제거한다. 
# 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
# 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
# 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
# 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

# N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

import sys
inputdata = sys.stdin.readline

from collections import deque

N, K = map(int, inputdata().split())

nums_seq = deque([i for i in range(1, N + 1)])
josephus_seq = deque()

print(f'initial sequence: {nums_seq}')      #

def fnRule():
    for i in range(1, K + 1):
        if i != K:
            move_num = nums_seq.popleft()
            nums_seq.append(move_num)
            print(nums_seq)                 #
        elif i == K:
            save_num = nums_seq.popleft()
            josephus_seq.append(save_num)
            print(nums_seq)                 #
        print(i)                            #

while len(nums_seq) > 0:
    fnRule()

# To match the output answer format
print('<', end='')
for j in josephus_seq:
    if j != josephus_seq[-1]:
        print(j, end='')
        print(', ', end='')
    elif j == josephus_seq[-1]:
        print(j, end='')
print('>')



# 7 3

# initial sequence: deque([1, 2, 3, 4, 5, 6, 7])
# deque([2, 3, 4, 5, 6, 7, 1])
# 1
# deque([3, 4, 5, 6, 7, 1, 2])
# 2
# deque([4, 5, 6, 7, 1, 2])
# 3
# deque([5, 6, 7, 1, 2, 4])
# 1
# deque([6, 7, 1, 2, 4, 5])
# 2
# deque([7, 1, 2, 4, 5])
# 3
# deque([1, 2, 4, 5, 7])
# 1
# deque([2, 4, 5, 7, 1])
# 2
# deque([4, 5, 7, 1])
# 3
# deque([5, 7, 1, 4])
# 1
# deque([7, 1, 4, 5])
# 2
# deque([1, 4, 5])
# 3
# deque([4, 5, 1])
# 1
# deque([5, 1, 4])
# 2
# deque([1, 4])
# 3
# deque([4, 1])
# 1
# deque([1, 4])
# 2
# deque([4])
# 3
# deque([4])
# 1
# deque([4])
# 2
# deque([])
# 3
# <3, 6, 2, 7, 5, 1, 4>
