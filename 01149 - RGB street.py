import sys
inputdata = sys.stdin.readline

def fnDPMinimumBudget(N, house_ls):
    for i in range(1, N):
        # 빨강
        house_ls[i][0] = min(house_ls[i-1][1], house_ls[i-1][2]) + house_ls[i][0]
        # 초록
        house_ls[i][1] = min(house_ls[i-1][0], house_ls[i-1][2]) + house_ls[i][1]
        # 파랑
        house_ls[i][2] = min(house_ls[i-1][0], house_ls[i-1][1]) + house_ls[i][2]
        # print(f'house_ls in fn: {house_ls}')            # test print
    return min(house_ls[-1])


if __name__ == "__main__":
    N = int(inputdata().strip())
    house_ls = [list(map(int, inputdata().split())) for _ in range(N)]
    # print(f'house_ls: {house_ls}')          # test print
    
    result = fnDPMinimumBudget(N, house_ls)
    print(result)
