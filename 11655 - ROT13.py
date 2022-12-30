import sys
inputdata = sys.stdin.readline


def fnROT13():
    new_s_ls = []
    for s in s_ls:
        if s.isupper() == True and 65 <= ord(s) <= 90:
            c = ord(s)
            c = ((c - 65) + 13) % 26 + 65
            new_s_ls.append(chr(c))
        elif s.islower() == True and 97 <= ord(s) <= 122:
            c = ord(s)
            c = ((c - 97) + 13) % 26 + 97
            new_s_ls.append(chr(c))
        else:
            new_s_ls.append(s)
    new_s_ls.pop()              # 이 악물고 readline 쓰겠다는 뻘짓의 결과.
    # print(new_s_ls)     # TEST PRINT
    print("".join(new_s_ls))


if __name__ == "__main__":
    # s_ls = list(map(str, inputdata().strip()))            # 제출 "출력 형식이 잘못되었습니다"
    s_ls = list(inputdata())    # 이 악물고 readline 쓰겠다는 뻘짓의 결과.
    # s_ls = input()            # input() 쓰면 앞뒤 공백 입력받는것 쉽게 해결됨.
    # print(s_ls)         # TEST PRINT
    
    fnROT13()
