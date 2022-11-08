import sys
inputdata = sys.stdin.readline
from collections import deque

def fnCommandMachine(characters_ls):
    M = int(inputdata().strip())
    chars_left = characters_ls
    char_temp = ''
    chars_right = deque()
    for i in range(M):
        command = list(map(str, inputdata().split()))
        # print(command)
        if command[0] == 'L' and len(chars_left) != 0:
            char_temp = chars_left.pop()
            chars_right.appendleft(char_temp)
            # print(f'[P] chars_left:  {chars_left}')             # test print
            # print(f'[P] chars_right: {chars_right}')            # test print
        elif command[0] == 'D' and len(chars_right) != 0:
            char_temp = chars_right.popleft()
            chars_left.append(char_temp)
            # print(f'[P] chars_left:  {chars_left}')             # test print
            # print(f'[P] chars_right: {chars_right}')            # test print
        elif command[0] == 'B' and len(chars_left) != 0:
            chars_left.pop()
            # print(f'[P] chars_left:  {chars_left}')             # test print
            # print(f'[P] chars_right: {chars_right}')            # test print
        elif command[0] == 'P':
            chars_left.append(command[1])
            # print(f'[P] chars_left:  {chars_left}')             # test print
            # print(f'[P] chars_right: {chars_right}')            # test print
        # print(' ')          # test print
        
    # print(f'chars_left:  {chars_left}')             # test print
    # print(f'chars_right: {chars_right}')            # test print

    for c in chars_left:
      print(c, end='')
    for c in chars_right:
      print(c, end='')


if __name__ == "__main__":
    characters_ls = deque(map(str, inputdata().strip()))
    # print(characters_ls)            # test print
    
    fnCommandMachine(characters_ls)
