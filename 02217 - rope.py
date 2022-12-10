import sys
inputdata = sys.stdin.readline


def fnMaxWeight(N):
    max_weight = 0
    rope_ls.sort(reverse = True)
    # print(rope_ls)          # test print
    
    for _ in range(N):
        rope_temp = rope_ls.pop()
        weight = rope_temp * (len(rope_ls) + 1)
        if max_weight <= weight:
            max_weight = weight
            
    print(max_weight)


if __name__ == "__main__":
    N = int(inputdata().strip())
    rope_ls = []
    for _ in range(N):
        rope_ls.append(int(inputdata().strip()))
    # print(rope_ls)          # test print
    
    fnMaxWeight(N)
