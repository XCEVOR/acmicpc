# 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
# abc..z 순차적으로 대입되는 각각의 알파벳에 대해서, 
# 단어에 포함되는 경우에는 처음 등장하는 index 위치를, 
# 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

import sys

S = list(str(sys.stdin.readline().strip()))
alphabet = 'abcdefghijklmnopqrstuvwxyz'
result = []

for alph in alphabet :
    if alph in S :
        result.append(str(S.index(alph)))
    if alph not in S:
        result.append('-1')

print(' '.join(result))



# baekjoon

# 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1