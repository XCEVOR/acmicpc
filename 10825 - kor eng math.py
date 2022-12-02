import sys
inputdata = sys.stdin.readline

def fnSortGrades():
    grade_ls.sort(key = lambda x: str(x[0]))
    # print(grade_ls)         # test print
    grade_ls.sort(key = lambda x: int(x[3]), reverse = True)
    # print(grade_ls)         # test print
    grade_ls.sort(key = lambda x: int(x[2]))
    # print(grade_ls)         # test print
    grade_ls.sort(key = lambda x: int(x[1]), reverse = True)
    # print(grade_ls)         # test print
    
    return grade_ls


if __name__ == "__main__":
    N = int(inputdata().strip())
    grade_ls = [list(map(str, inputdata().split())) for _ in range(N)]
    # print(grade_ls)         # test print
    
    result = fnSortGrades()
    
    for res in result:
        print(res[0])
