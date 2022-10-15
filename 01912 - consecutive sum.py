import sys
inputdata = sys.stdin.readline

def fnMaximumSum(num_sequence, sum_array):
    for i in range(len(num_sequence)):
        if i == 0:
            sum_array[0] = num_sequence[0]
        elif sum_array[i - 1] < 0:
            sum_array[i] = num_sequence[i]
        else:
            sum_array[i] = sum_array[i - 1] + num_sequence[i]
    print(f'sum_array: {sum_array}')            # test print
    return max(sum_array)


if __name__ == "__main__":
    n = int(inputdata().strip())
    num_sequence = list(map(int, inputdata().split()))
    print(f'num_sequence: {num_sequence}')         # test print
    
    sum_array = [None] * n
    result = fnMaximumSum(num_sequence, sum_array)
    
    print(result)



# 10
# 10 -4 3 1 5 6 -35 12 21 -1

# num_sequence: [10, -4, 3, 1, 5, 6, -35, 12, 21, -1]
# sum_array: [10, 6, 9, 10, 15, 21, -14, 12, 33, 32]

# 33
