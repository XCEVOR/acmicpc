import sys
inputdata = sys.stdin.readline

arithmetic_str = str(inputdata().strip())
arithmetic_ls = arithmetic_str.split('-')

# print(arithmetic_ls)            #

total_sum = 0
for i in range(len(arithmetic_ls)):
    ari_temp_ls = list(map(int, arithmetic_ls[i].split('+')))
    
    # print(ari_temp_ls)          #
    
    if i == 0:
        total_sum = sum(ari_temp_ls)
    else:
        total_sum -= sum(ari_temp_ls)

print(total_sum)
