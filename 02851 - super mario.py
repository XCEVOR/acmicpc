import sys
inputdata = sys.stdin.readline


if __name__ == "__main__":
    running_total_ls = [0] * 10
    
    running_total_ls[0] = int(inputdata().strip())
    for i in range(1, 10):
        running_total_ls[i] = running_total_ls[i - 1] + int(inputdata().strip())
        if running_total_ls[i] >= 100:
            if (running_total_ls[i] - 100) <= (100 - running_total_ls[i - 1]):
                print(running_total_ls[i])
            elif (running_total_ls[i] - 100) > (100 - running_total_ls[i - 1]):
                print(running_total_ls[i - 1])
            break
        if i == 9 and running_total_ls[9] < 100:
            print(running_total_ls[9])
    # print(running_total_ls)         # TEST PRINT
