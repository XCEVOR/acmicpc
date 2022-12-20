import sys
inputdata = sys.stdin.readline


def fnSuffixArray(s):
    s_ls = [s]
    
    for _ in range(len(s) - 1):
        s = s[1:]           ## 맨 왼쪽 문자 하나 제거 후 저장.
        s_ls.append(s)
    
    # print(s_ls)         # test print
    
    s_ls.sort()
    
    for x in s_ls:
        print(x)


if __name__ == "__main__":
    s = str(inputdata().strip())
    # print(s)            # test print
    
    fnSuffixArray(s)
