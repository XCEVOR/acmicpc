import sys
inputdata = sys.stdin.readline


def fnNumberOfElements(b_cnt):
    ab = a_ls - b_ls
    ba = b_ls - a_ls
    print(len(ab | ba))


if __name__ == "__main__":
    a_cnt, b_cnt = map(int, inputdata().split())
    a_ls = set(map(int, inputdata().split()))
    b_ls = set(map(int, inputdata().split()))
    
    fnNumberOfElements(b_cnt)
