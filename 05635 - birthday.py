import sys
inputdata = sys.stdin.readline
from collections import deque


def fnRearrange():
    restdt_info = []
    
    if len(stdt_info[2]) == 1:
        stdt_info[2] = '0' + stdt_info[2]
    if len(stdt_info[1]) == 1:
        stdt_info[1] = '0' + stdt_info[1]
        
    restdt_info.append(stdt_info[3] + stdt_info[2] + stdt_info[1])
    restdt_info.append(stdt_info[0])
    # print(restdt_info)          # test print
    
    student_ls.append(restdt_info)

def fnBirthday():
    student_ls.sort()
    # print(student_ls)           # test print
    
    print(student_ls[-1][1])
    print(student_ls[0][1])


if __name__ == "__main__":
    n = int(inputdata().strip())
    student_ls = []
    for _ in range(n):
        stdt_info = list(map(str, inputdata().split()))
        # print(stdt_info)            # test print
        fnRearrange()
    
    fnBirthday()
