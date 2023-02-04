import sys
inputdata = sys.stdin.readline


def fnFindSquare(n, m):
    max_area = 1;
    
    for i in range(n):
        for j in range(m):
            vertex = rectangle_ls[i][j]
            for k in range(j, m):
                if k != j and vertex == rectangle_ls[i][k]:
                    
                    if i + (k - j) <= n - 1 and vertex == rectangle_ls[i + (k - j)][j]:
                        if vertex == rectangle_ls[i + k - j][k]:
                            
                            # print(i, j)             # TEST PRINT, POINT 1
                            # print(i, k)             # TEST PRINT, POINT 2
                            # print(i + k - j, j)     # TEST PRINT, POINT 3
                            # print(i + k - j, k)     # TEST PRINT, POINT 4
                            
                            area = (k - j + 1) ** 2
                            # print(area)             # TEST PRINT
                            
                            if max_area < area:
                                max_area = area
    
    return max_area


if __name__ == "__main__":
    n, m = map(int, inputdata().split())
    
    rectangle_ls = []
    
    for _ in range(n):
        rectangle_ls.append(list(map(int, inputdata().strip())))
    
    # print(rectangle_ls)             # TEST PRINT
    
    result = fnFindSquare(n, m)
    print(result)
