import sys
inputdata = sys.stdin.readline
from collections import deque


def fnIsPalindrome(num_ls):
    if len(num_ls) == 1:
        print("yes")
    else:
        while 0 <= len(num_ls):
            left = num_ls.popleft()
            right = num_ls.pop()
            if left != right:
                print("no")
                break
            elif left == right and (len(num_ls) <= 1):
                print("yes")
                break
    

if __name__ == "__main__":
    while True:
        num_ls = deque(map(int, inputdata().strip()))
        # print(num_ls)           # test print
        
        if num_ls[0] == 0:
            break
        else:
            fnIsPalindrome(num_ls)
