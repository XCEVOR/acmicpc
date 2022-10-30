import sys
inputdata = sys.stdin.readline

def fnOXquiz(N):
    for _ in range(N):
        ox_ls = list(map(str, inputdata().strip()))
        # print(ox_ls)            # test print
        
        point = 0
        sum_points = 0
        for ox in ox_ls:
            if ox == "O" and point == 0:
                point = 1
                sum_points += point
            elif ox == "O" and 0 < point:
                point += 1
                sum_points += point
            elif ox == "X":
                point = 0
        print(sum_points)


if __name__ == "__main__":
    N = int(inputdata().strip())
    
    fnOXquiz(N)
