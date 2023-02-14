import sys
inputdata = sys.stdin.readline


def fnFlipFishBread():
    flip_line = ""
    for _ in range (len(lined_bread_ls)):
        shape = lined_bread_ls.pop()
        flip_line += shape
    
    print(flip_line)


if __name__ == "__main__":
    n, m = map(int, inputdata().split())
    
    for _ in range (n):
        lined_bread_ls = list(map(str, inputdata().strip()))
        # print(lined_bread_ls)
        
        fnFlipFishBread()
