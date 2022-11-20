import sys
inputdata = sys.stdin.readline

def fnFindUpper(names_ls):
    for name in names_ls:
        if name.isupper() == True:
            print(name, end="")


if __name__ == "__main__":
    names_ls = list(str(inputdata().strip()))
    # print(names_ls)         # test print
    
    fnFindUpper(names_ls)
