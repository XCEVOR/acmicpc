import sys
inputdata = sys.stdin.readline

def fnBlackArea(point_ls):
    paper = [[0] * 101 for _ in range(101)]
    
    for xy in point_ls:
        for i in range(10):
            for j in range(10):
                paper[xy[0] + i][xy[1] + j] = 1
                
    # for p in paper:         # test print
    #     print(p)
    
    totalsum = 0
    for p in paper:
        totalsum += sum(p)
    
    return totalsum


if __name__ == "__main__":
    N = int(inputdata().strip())
    point_ls = [list(map(int, inputdata().split())) for _ in range(N)]
    
    # print(point_ls)         # test print
    
    result = fnBlackArea(point_ls)
    print(result)
