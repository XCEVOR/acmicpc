import sys
inputdata = sys.stdin.readline


def fnFlip(i, j):
    for x in range(i, i + 3):
        for y in range(j, j + 3):
            matrix_A[x][y] = 1- matrix_A[x][y]

def fnMinConversion(N, M):
    opertaion_count = 0
    for i in range(N-2):
        for j in range(M-2):
            if matrix_A[i][j] != matrix_B[i][j]:
                fnFlip(i, j)
                opertaion_count += 1
    
    if matrix_A != matrix_B:
        print(-1)
    else:
        print(opertaion_count)


if __name__ == "__main__":
    N, M = map(int, inputdata().split())
    matrix_A = [list(map(int, inputdata().strip())) for _ in range(N)]
    matrix_B = [list(map(int, inputdata().strip())) for _ in range(N)]
    
    fnMinConversion(N, M)
