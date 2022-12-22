import sys
inputdata = sys.stdin.readline


def fnContainedRain(h, w):
    h_max = max(block_ls)
    
    count = 0
    for _ in range(h_max):
        wall = 1
        count_temp = 0
        for i in range(1, w):
            if block_ls[i] != block_ls[i - 1] and block_ls[i] == 0:
                wall = 0
            elif block_ls[i] != block_ls[i - 1] and block_ls[i] != 0:
                wall = 1
                count += count_temp
                count_temp = 0
                
            if block_ls[i] == 0 and wall == 0:
                count_temp += 1
                
            # print(f'i: {i}')            # test print
            # print(f'count_temp: {count_temp}')          # test print
                
        for j in range(len(block_ls)):
            if block_ls[j] != 0:
                block_ls[j] = block_ls[j] - 1
            
    print(count)


if __name__ == "__main__":
    h, w = map(int, inputdata().split())
    block_ls = list(map(int, inputdata().split()))
    # print(block_ls)         # test print
    
    fnContainedRain(h, w)
