import sys
inputdata = sys.stdin.readline


def fnFlip():
    if s[0] == s[-1]:
        check = abs(s[0] - 1)
        # print(check)            # test print
        count = 0
    elif s[0] != s[-1]:
        check = abs(s[0] - 1)
        # print(check)            # test print
        count = 1
    
    
    temp = s[0]
    for i in range(1, len(s)):
        if s[i - 1] != s[i]:
            temp = s[i]
            if check != s[i]:
                count += 1
    
    print(count)


if __name__ == "__main__":
    s = list(map(int, inputdata().strip()))
    # print(s)            # test print
    
    fnFlip()
