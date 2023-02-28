import sys
inputdata = sys.stdin.readline


def fnOneTwoTwoThreeThreeThree():
    selected_num = 1
    count_down = 1
    for i in range (2_000):
        if count_down == 0:
            selected_num += 1
            count_down = selected_num
            continue
        else:
            num_ls.append(selected_num)
            count_down -= 1
    # print(num_ls)  ## TEST PRINT.

def fnSumBetween(a, b):
    total_sum = 0
    for i in range (a, b  + 1):
        total_sum += num_ls[i]
    print(total_sum)


if __name__ == "__main__":
    a, b = map(int, inputdata().split())
    num_ls = [0]
    
    fnOneTwoTwoThreeThreeThree()
    
    fnSumBetween(a, b)
