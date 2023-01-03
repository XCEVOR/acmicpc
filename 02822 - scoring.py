import sys
inputdata = sys.stdin.readline


def fnTotalScore():
    sorted_score_ls = sorted(score_ls, reverse=True)
    # print(sorted_score_ls)          # TEST PRINT
    sorted_score_ls = sorted_score_ls[:5]
    # print(sorted_score_ls)          # TEST PRINT
    
    totalScore = 0
    result_ls = []
    for i in range (1, len(score_ls)):
        if score_ls[i] in sorted_score_ls:
            totalScore += score_ls[i]
            result_ls.append(i)
    print(totalScore)
    print(*result_ls)


if __name__ == "__main__":
    score_ls = [0]
    for _ in range(8):
        score_ls.append(int(inputdata().strip()))
    # print(score_ls)                 # TEST PRINT
    
    fnTotalScore()
