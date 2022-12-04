# PyPy3 제출

import sys
inputdata = sys.stdin.readline

def fnFromToSum():
    ## 누적 합을 저장할 변수 지정. i, j, x, y 를 입력 받음.
    total_sum = 0
    i, j, x, y = map(int, inputdata().split())
    
    ## i, j, x, y 의 범위는 1 부터 시작하기 때문에 리스트 index 를 맞추기 위해 i-1, j-1 부터 시작.
    for dx in range(i - 1, x):
        for dy in range(j - 1, y):
            ## 리스트 안의 정해진 범위를 모두 돌며 그 value 를 하나하나 누적하여 더함.
            total_sum += num_ls[dx][dy]
    
    print(total_sum)


if __name__ == "__main__":
    ## 입력에서 제시한 배열을 저장.
    N, M = map(int, inputdata().split())
    num_ls = [list(map(int, inputdata().split())) for _ in range(N)]
    # print(num_ls)           # test print
    
    ## 테스트 개수 K 를 입력 받음.
    K = int(inputdata().strip())
    
    ## K 번 반복하여 정해진 구간 안의 합을 구하는 함수 실행.
    for _ in range(K):
        fnFromToSum()
