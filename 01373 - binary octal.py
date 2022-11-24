import sys
inputdata = sys.stdin.readline

def fnBinaryToOctalNumber(binary_number):
    b_len = len(binary_number)
    num_ls = [0] * (b_len + 3)
    
    i = b_len - 1
    for b in binary_number:
        num_ls[i] = b
        i -= 1
    # print(num_ls)           # test print
    
    
    if b_len % 3 == 0:
        floop = b_len // 3
    elif b_len % 3 != 0:
        floop = b_len // 3 + 1
    
    octal_ls = []
    for j in range (floop):
        o_sum, o8, o88, o888 = 0, 0, 0, 0
        o8 = 1 * int(num_ls[j * 3])
        o88 = 2 * int(num_ls[j * 3 + 1])
        o888 = 4 * int(num_ls[j * 3 + 2])
        o_sum = o8 + o88 + o888
        octal_ls.append(o_sum)
    # print(octal_ls)         # test print
    
    return octal_ls


if __name__ == "__main__":
    binary_number = str(inputdata().strip())
    # print(binary_number)            # test print
    
    result = fnBinaryToOctalNumber(binary_number)
    for i in range (len(result), 0, -1):
        print(result[i - 1], end='')
