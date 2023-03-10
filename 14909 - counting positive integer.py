import sys
inputdata = sys.stdin.readline


def fnIsPositiveInteger():
    count = 0
    for n in num_ls:
        if n > 0:
            count += 1
    
    print(count)


if __name__ == "__main__":
    num_ls = list(map(int, inputdata().split()))
    
    fnIsPositiveInteger()
