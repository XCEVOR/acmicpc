import sys
inputdata = sys.stdin.readline

def fnDFS(N, x, y):
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        
        if (0 <= nx < N) and (0 <= ny < N):
            if town_map[nx][ny] == '1':
                town_map[nx][ny] = ' '
                global house_count
                house_count += 1
                fnDFS(N, nx, ny)                


if __name__ == "__main__":
    N = int(inputdata().strip())
    town_map_input = [list(map(str, inputdata().split())) for _ in range(N)]
    # print(town_map_input)            # test print
    town_map = []
    for i in range(N):
        town_sum = []
        for town in town_map_input[i]:
            town_sum += town
        # print(town_sum)            # test print
        town_map.append(town_sum)
    # print(town_map)            # test print
    
    town_count = 0
    house_count_ls = []
    for i in range(N):
        for j in range(N):
            if town_map[i][j] == '1':
                town_count += 1
                town_map[i][j] = ' '
                house_count = 1
                fnDFS(N, i, j)
                house_count_ls.append(house_count)
                # print(house_count_ls)
    # print(town_map)            # test print
    print(town_count)
    # print(house_count_ls)            # test print

    house_count_ls.sort()
    for h in house_count_ls:
        print(h)
