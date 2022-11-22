import sys
inputdata = sys.stdin.readline

def fnEmployment(T):
    for _ in range(T):
        applicant_num = int(inputdata().strip())
        appl_ls = [list(map(int, inputdata().split())) for _ in range(applicant_num)]
        
        sorted_rank = sorted(appl_ls, key=lambda x: (x[0], x[1]))
        # print(sorted_rank)          # test print
        
        above = 0
        hired = 1
        for i in range(1, len(sorted_rank)):
            if sorted_rank[i][1] < sorted_rank[above][1]:
                above = i
                hired += 1
        print(hired)


if __name__ == "__main__":
    T = int(inputdata().strip())
    
    fnEmployment(T)
