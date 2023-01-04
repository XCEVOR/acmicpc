import sys
inputdata = sys.stdin.readline


def fnChessOnWhite():
    count = 0
    for i in range(len(chess_ls)):
        if i % 2 == 0 and chess_ls[i] == 'F':
            count += 1
    print(count)


if __name__ == "__main__":
    chess_ls = []
    for _ in range(8):
        ch_ls = list(map(str, inputdata().strip()))
        chess_ls.extend(ch_ls)
        chess_ls.extend('0')
    # print(chess_ls)         # TEST PRINT
    
    fnChessOnWhite()
