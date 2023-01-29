import sys
inputdata = sys.stdin.readline


def fnGetInLine():
    studentNum = 1
    for t in ticket_ls:
        student_ls.insert(studentNum - t, studentNum)
        studentNum += 1
    
    student_ls.pop(0)
    print(*student_ls)


if __name__ == "__main__":
    n = int(inputdata().strip())
    
    student_ls = [0]
    ticket_ls = list(map(int, inputdata().split()))
    
    fnGetInLine()
