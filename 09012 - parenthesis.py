# 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 
# 그 결과를 YES 와 NO 로 나타내어야 한다.

import sys
inputdata = sys.stdin.readline

T = int(inputdata())

for _ in range(T):
    VPS_check = list(str(inputdata().strip()))
    
    count = 0
    for _ in range(len(VPS_check)):
        parenthesis = VPS_check.pop()
        if count == 0 and parenthesis == '(':
            count = 999
            break
        elif parenthesis == ')':
            count += 1
        elif parenthesis == '(':
            count -= 1
        
    if count == 0:
        print('YES')
    else:
        print('NO')



# 6
# (())())
# (((()())()
# (()())((()))
# ((()()(()))(((())))()
# ()()()()(()()())()
# (()((())()(
    
# NO
# NO
# YES
# NO
# YES
# NO


# 3
# ((
# ))
# ())(()

# NO
# NO
# NO
