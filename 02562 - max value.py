import sys
inputdata = sys.stdin.readline


def fnWhereIsTheMaxValue():
    max_value = 0
    for n in num_ls:
        if max_value < n:
            max_value = n
    for i in range(len(num_ls)):
        if max_value == num_ls[i]:
            print(max_value)
            print(i + 1)


if __name__ == "__main__":
    num_ls = []
    for _ in range(9):
        num_ls.append(int(inputdata().strip()))
    # print(num_ls)           # TEST PRINT
    
    fnWhereIsTheMaxValue()

    
    
    
# ----------------------------------

# import sys
# inputdata = sys.stdin.readline


# def fnWhereIsTheMaxValue():
#     max_value = max(num_ls)
#     print(max_value)
#     print(num_ls.index(max_value) + 1)


# if __name__ == "__main__":
#     num_ls = []
#     for _ in range(9):
#         num_ls.append(int(inputdata().strip()))
#     # print(num_ls)           # TEST PRINT
    
#     fnWhereIsTheMaxValue()
