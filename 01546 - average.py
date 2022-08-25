import sys

n = int(sys.stdin.readline())
score_ls = list(map(int, sys.stdin.readline().split()))

max_score = max(score_ls)
sum_score = 0

for i in range(n):
    score_ls[i] = score_ls[i] / max_score * 100
    sum_score = sum_score + score_ls[i]

ave_score = sum_score / n
print(ave_score)



# 9
# 10 20 30 40 50 60 70 80 90

# 55.55555555555556