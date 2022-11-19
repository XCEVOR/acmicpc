import sys
inputdata = sys.stdin.readline

def fnSortWords(word_ls):\
    ## 중복 제거
    word_ls = list(set(word_ls))
    # print(word_ls)          # test print
    
    ## 알파벳 순으로 정렬
    word_ls.sort()
    # print(word_ls)          # test print
    
    ## 문자 길이 순으로 정렬
    word_ls.sort(key = len)
    # print(word_ls)          # test print
    
    return word_ls


if __name__ == "__main__":
    N = int(inputdata().strip())
    word_ls = [str(inputdata().strip()) for _ in range(N)]
    # print(word_ls)          # test print
    
    ## return 받은 결과를 세로로 출력
    result = fnSortWords(word_ls)
    for r in result:
        print(r)
