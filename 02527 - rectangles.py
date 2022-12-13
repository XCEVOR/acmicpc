import sys
inputdata = sys.stdin.readline


def fnTwoRectangles():
    rectangle_ls.sort()
    # print(rectangle_ls)         # test print
    
    x1 ,y1, p1, q1 = rectangle_ls[0]
    x2, y2, p2, q2 = rectangle_ls[1]
    
    if p1 < x2 or p2 < x1 or q2 < y1 or q1 < y2:
        print("d")
    elif x1 == p2 or p1 == x2:
        if y1 == q2 or y2 == q1:
            print("c")
        else:
            print("b")
    elif y2 == q1 or q2 == y1:
        print("b")
    else:
        print("a")


if __name__ == "__main__":
    for _ in range(4):
        a, b, c, d, e, f, g, h = map(int, inputdata().split())
        rectangle_ls = [[a, b, c, d], [e, f, g, h]]
        
        fnTwoRectangles()
