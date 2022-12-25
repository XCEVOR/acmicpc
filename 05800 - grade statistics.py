import sys
inputdata = sys.stdin.readline
from collections import deque


def fnGradeStatistics(class_x):
    class_dq.popleft()
    class_ls = list(class_dq)
    class_ls.sort(reverse = True)
    # print(class_ls)         # test print
    
    largestgap = 0
    for i in range(len(class_ls) - 1):
        gap = abs(class_ls[i] - class_ls[i + 1])
        if largestgap < gap:
            largestgap = gap
    # print(largestgap)           # test print
    
    print(f'Class {class_x}')
    print(f'Max {class_ls[0]}, Min {class_ls[-1]}, Largest gap {largestgap}')
    

if __name__ == "__main__":
    k = int(inputdata().strip())
    class_x = 0
    for _ in range(k):
        class_x += 1
        class_dq = deque(map(int, inputdata().split()))
        # print(class_dq)         # test print
        
        fnGradeStatistics(class_x)
