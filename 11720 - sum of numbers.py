# N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

import sys

N = int(sys.stdin.readline().strip())
numbers_ls = list(str(sys.stdin.readline().strip()))

total_sum = 0
for sing_num in numbers_ls :
    total_sum += int(sing_num)
    
print(total_sum)



# 11
# 10987654321

# 46