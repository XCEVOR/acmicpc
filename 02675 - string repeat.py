import sys
inputdata = sys.stdin.readline

def fnStringRepeat(R, S):
    SR = []
    for _s in S:
        for _ in range(int(R)):
            SR.append(_s)
    return "".join(SR)


if __name__ == "__main__":
    T = int(inputdata().strip())
    for _ in range(T):
        R, S = map(str, inputdata().split())
        
        result = fnStringRepeat(R,S)
        print(result)
