# 정수를 저장하는 덱(Deque)를 구현한 다음, 
# 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

# 명령은 총 여덟 가지이다.

# push_front X: 정수 X를 덱의 앞에 넣는다.
# push_back X: 정수 X를 덱의 뒤에 넣는다.
# pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# size: 덱에 들어있는 정수의 개수를 출력한다.
# empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
# front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import sys
inputdata = sys.stdin.readline

from collections import deque

N = int(inputdata().strip())
dq = deque()

for _ in range(N):
    command = list(map(str, inputdata().split()))
    
    print(dq)                                   #
    if command[0] == 'push_front':
        print('command: push_front')            #
        print(f'input: {command[1]}')           #
        dq.append(command[1])
    elif command[0] == 'push_back':
        print('command: push_back')             #
        print(f'input: {command[1]}')           #
        dq.appendleft(command[1])
    elif command[0] == 'pop_front':
        print('command: pop_front')             #
        if len(dq) == 0:
            print(-1)
        else:
            print(dq.pop())
    elif command[0] == 'pop_back':
        print('command: pop_back')              #
        if len(dq) == 0:
            print(-1)
        else:
            print(dq.popleft())
    elif command[0] == 'size':
        print('command: size')                  #
        print(len(dq))
    elif command[0] == 'empty':
        print('command: empty')                 #
        if len(dq) == 0:
            print(1)
        else:
            print(0)
    elif command[0] == 'front':
        print('command: front')                 #
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[-1])
    elif command[0] == 'back':
        print('command: back')                  #
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[0])
    print(' ')                                  #


# 22
# front
# back
# pop_front
# pop_back
# push_front 1
# front
# pop_back
# push_back 2
# back
# pop_front
# push_front 10
# push_front 333
# front
# back
# pop_back
# pop_back
# push_back 20
# push_back 1234
# front
# back
# pop_back
# pop_back

# -1
# -1
# -1
# -1
# 1
# 1
# 2
# 2
# 333
# 10
# 10
# 333
# 20
# 1234
# 1234
# 20



# deque([])
# command: front
# -1
 
# deque([])
# command: back
# -1
 
# deque([])
# command: pop_front
# -1
 
# deque([])
# command: pop_back
# -1
 
# deque([])
# command: push_front
# input: 1
 
# deque(['1'])
# command: front
# 1
 
# deque(['1'])
# command: pop_back
# 1
 
# deque([])
# command: push_back
# input: 2
 
# deque(['2'])
# command: back
# 2
 
# deque(['2'])
# command: pop_front
# 2
 
# deque([])
# command: push_front
# input: 10
 
# deque(['10'])
# command: push_front
# input: 333
 
# deque(['10', '333'])
# command: front
# 333
 
# deque(['10', '333'])
# command: back
# 10
 
# deque(['10', '333'])
# command: pop_back
# 10
 
# deque(['333'])
# command: pop_back
# 333
 
# deque([])
# command: push_back
# input: 20
 
# deque(['20'])
# command: push_back
# input: 1234
 
# deque(['1234', '20'])
# command: front
# 20
 
# deque(['1234', '20'])
# command: back
# 1234
 
# deque(['1234', '20'])
# command: pop_back
# 1234
 
# deque(['20'])
# command: pop_back
# 20
