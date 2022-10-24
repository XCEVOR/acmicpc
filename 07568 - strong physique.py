import sys
inputdata = sys.stdin.readline

def fnStrongPhysique(person_ls):
    ranking_ls = [None] * N
    for i in range(len(person_ls)):
        ranking = 1
        for j in range(len(person_ls)):
            if person_ls[i][0] < person_ls[j][0] and person_ls[i][1] < person_ls[j][1]:
                ranking += 1;
                
        ranking_ls[i] = ranking
    
    return ranking_ls


if __name__ == "__main__":
    N = int(inputdata().strip())
    person_ls = [list(map(int, inputdata().split())) for _ in range(N)]
    
    # print(person_ls)            # test print
    
    result = fnStrongPhysique(person_ls)
    print(*result)
