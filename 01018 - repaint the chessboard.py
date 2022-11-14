import sys
inputdata = sys.stdin.readline

def fnRepaint(N, M, board):
    painted = []
    for area_N in range(N - 7):
        for area_M in range(M - 7):
            start_white = 0
            start_black = 0
            
            for selected_A in range(area_N, area_N+8):
                for selected_B in range(area_M, area_M+8):
                    if (selected_A + selected_B) % 2 == 0:
                        if board[selected_A][selected_B] != 'W':
                            start_white += 1
                        if board[selected_A][selected_B] != 'B':
                            start_black += 1
                    elif (selected_A + selected_B) % 2 == 1:
                        if board[selected_A][selected_B] != 'B':
                            start_white += 1
                        if board[selected_A][selected_B] != 'W':
                            start_black += 1
            painted.append(start_white)
            painted.append(start_black)
            
    return min(painted)


if __name__ == "__main__":
    N, M = map(int, inputdata().split())
    board = [list(str(inputdata().strip())) for _ in range(N)]
    # print(board)            # test print

    result = fnRepaint(N, M, board)
    print(result)
