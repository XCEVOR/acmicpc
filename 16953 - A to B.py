import sys
inputdata = sys.stdin.readline


def fnConversion(A, B):
    count = 0
    while True:
        count += 1
        if B == A:
            print(count)
            break
        elif B < A or (B % 2 == 1 and B % 10 != 1):
            print(-1)
            break
        elif B % 2 == 0:
            B = B / 2
        elif B % 10 == 1:
            B = B // 10


if __name__ == "__main__":
    A, B = map(int, inputdata().split())
    
    fnConversion(A, B)
