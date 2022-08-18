import sys
N = list(str(sys.stdin.readline().strip()))

if len(N) == 1:
    N.insert(0, '0')
print(N)

start_num = N
cycle = 0
while True:
    cycle += 1
    
    sum_digit_temp = str((int(start_num[0])+int(start_num[1])) % 10)
    new_num = list(str(start_num[1] + sum_digit_temp))
    print(new_num)
    
    if new_num == N:
        print(cycle)
        break
    else:
        start_num = new_num
        print(f'=== {start_num}')



# 26

# ['2', '6']
# ['6', '8']
# === ['6', '8']
# ['8', '4']
# === ['8', '4']
# ['4', '2']
# === ['4', '2']
# ['2', '6']
# 4