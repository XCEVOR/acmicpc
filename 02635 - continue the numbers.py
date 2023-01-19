import sys
inputdata = sys.stdin.readline


def fnContinueTheNumbers(num):
    max_count = 0
    max_num_ls = []
    
    for n in range (num, -1, -1): # 주어진 수보다 작은 경우에 대해 모든 경우를 대입.
        num_ls = [num, n, num - 1] # 기준이 될 세 값을 초기화.
        count = 1
        temp_num_ls = [num, n] # 최대 개수를 찾기 위한 임시 리스트.
        
        while (n >= 0): # 입력된 값에서 부터 -1 스텝으로 음수가 되기 전까지 반복.
            if num < 0: # 제일 마지막으로 뺀 결과가 음수가 나오면 loop 탈출.
                break
            
            num_ls[2] = num_ls[0] - num_ls[1]
            num_ls[0] = num_ls[1]
            num_ls[1] = num_ls[2]
            n = num_ls[1]
            
            temp_num_ls.append(n) # 첫째수에서 둘째수를 뺀 결과를 리스트에 계속 저장.
            count += 1
            
            if max_count < count: # 최대 카운트가 되었을 경우 그 카운트와 숫자열을 각각 저장.
                max_count = count
                max_num_ls = temp_num_ls[:-1]
        
    print(max_count)
    print(*max_num_ls)


if __name__ == "__main__":
    num = int(inputdata().strip())
    
    fnContinueTheNumbers(num)



'''
100

8
100 62 38 24 14 10 4 6


1

4
1 1 0 1


3

6
3 2 1 1 0 1
'''
