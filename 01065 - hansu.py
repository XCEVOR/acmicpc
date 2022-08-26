N = int(input())
nums_ls = list(range(1, N+1))
hansu_ls = []

def hansu(num) :
    unit_ls = []
    
    for i in str(num) :
        unit_ls.append(int(i))
        
    if 1 <= num < 10 :
        hansu_ls.append(unit_ls)
        
    if 10 <= num < 100 :
        hansu_ls.append(unit_ls)
        
    if 100 <= num < 1000 and unit_ls[0] - unit_ls[1] == unit_ls[1] - unit_ls[2] :
        hansu_ls.append(unit_ls)
        
    return hansu_ls

for num in range(1, N+1) :
    hansu(num)

print(len(hansu_ls))



# 110

# 99