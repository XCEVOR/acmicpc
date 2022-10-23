import sys
inputdata = sys.stdin.readline

def fnSortCoordinates(coordinate_ls):
    coordinate_ls.sort(key=lambda x: (x[0], x[1]))
    print(coordinate_ls)            # test print
    
    return coordinate_ls

if __name__ == "__main__":
    N = int(inputdata().strip())
    coordinate_ls = [list(map(int, inputdata().split())) for _ in range(N)]
    print(coordinate_ls)            # test print
    
    result = fnSortCoordinates(coordinate_ls)
    
    for res in result:
        print(*res)



# 5
# 3 4
# 1 1
# 1 -1
# 2 2
# 3 3

# [[3, 4], [1, 1], [1, -1], [2, 2], [3, 3]]
# [[1, -1], [1, 1], [2, 2], [3, 3], [3, 4]]

# 1 -1
# 1 1
# 2 2
# 3 3
# 3 4
