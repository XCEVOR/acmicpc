import sys
inputdata = sys.stdin.readline


def fnWhichBookSoldTheMost():
    if len(book_ls) == 1:
        print(book_ls[0])
        
    else:
        book_ls.sort()
        # print(book_ls)          # TEST PRINT
        
        count = 1
        max_count = 1
        best_book = book_ls[0]
        for i in range(1, len(book_ls)):
            if book_ls[i - 1] == book_ls[i]:
                count += 1
            elif book_ls[i - 1] != book_ls[i]:
                count = 1
            
            if max_count < count:
                max_count = count
                best_book = book_ls[i]
            temp = book_ls[i]
        
        # print(max_count)            # TEST PRINT
        print(best_book)


if __name__ == "__main__":
    n = int(inputdata().strip())
    
    book_ls = []
    for _ in range(n):
        book_ls.append(str(inputdata().strip()))
    # print(book_ls)          # TEST PRINT
    
    fnWhichBookSoldTheMost()
