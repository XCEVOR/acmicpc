import sys
inputdata = sys.stdin.readline


def fnIsKeepInNegotiation():
    score_ls.sort()
    # print(score_ls)  ## TEST PRINT.
    
    if (score_ls[3] - score_ls[1] >= 4):
        print("KIN")
    else:
        print(score_ls[3] + score_ls[2] + score_ls[1])


if __name__ == "__main__":
    tCase = int(inputdata().strip())
    
    for _ in range (tCase):
        score_ls = list(map(int, inputdata().split()))
        
        fnIsKeepInNegotiation()
