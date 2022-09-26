# 총 N개의 문자열로 이루어진 집합 S가 주어진다.

# 입력으로 주어지는 M개의 문자열 중에서 집합 S에 포함되어 있는 것이 
# 총 몇 개인지 구하는 프로그램을 작성하시오.

import sys
inputdata = sys.stdin.readline

N, M = map(int, inputdata().split())
S = []

for _ in range(N):
    source = inputdata().strip()
    S.append(source)

count = 0
for _ in range(M):
    check_word = inputdata().strip()
    if check_word in S:
        count += 1

print(count)



# 5 11
# baekjoononlinejudge
# startlink
# codeplus
# sundaycoding
# codingsh
# baekjoon
# codeplus
# codeminus
# startlink
# starlink
# sundaycoding
# codingsh
# codinghs
# sondaycoding
# startrink
# icerink

# 4
