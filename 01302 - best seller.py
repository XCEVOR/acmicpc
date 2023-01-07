import sys
inputdata = sys.stdin.readline


def fnWhichBookSoldTheMost():
    if len(book_ls) == 1:                       ## 책이 하나일 경우 바로 출력.
        print(book_ls[0])
        
    else:
        book_ls.sort()                          ## 알파벳 순으로 책 정렬 및 동일한 개수 일때를 대비.
        # print(book_ls)          # TEST PRINT
        
        count = 1
        max_count = 1
        best_book = book_ls[0]                  ## 알파벳이 제일 빠른 책으로 초기화.
        for i in range(1, len(book_ls)):
            if book_ls[i - 1] == book_ls[i]:    ## 동일한 책이 연속이라면 카운트 +1.
                count += 1
            elif book_ls[i - 1] != book_ls[i]:  ## 동일한 책 연속이 끊겼다면 카운트 초기화.
                count = 1
            
            if max_count < count:               ## 최대 개수가 신기록을 새웠다면 이를 max_count 에 저장.
                max_count = count
                best_book = book_ls[i]          ## 동일한 최대 개수를 대비하여 알파벳이 제일 빠른 책 저장.
        
        # print(max_count)            # TEST PRINT
        print(best_book)


if __name__ == "__main__":
    n = int(inputdata().strip())
    
    book_ls = []
    for _ in range(n):
        book_ls.append(str(inputdata().strip()))
    # print(book_ls)          # TEST PRINT
    
    fnWhichBookSoldTheMost()
