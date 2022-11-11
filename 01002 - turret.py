import sys
inputdata = sys.stdin.readline

def fnNumberOfExistence(T):
    for _ in range(T):
        x1, y1, r1, x2, y2, r2 = map(int, inputdata().split())
        if x1 == x2 and y1 == y2 and r1 == r2:
            print(-1)
        elif fnDistanceFromTurret(x1, x2, y1, y2) == (r1-r2)**2 or fnDistanceFromTurret(x1, x2, y1, y2) == (r1+r2)**2:
            print(1)
        elif (r1-r2)**2 < fnDistanceFromTurret(x1, x2, y1, y2) < (r1+r2)**2:
            print(2)
        else:
            print(0)
 
def fnDistanceFromTurret(x1, x2, y1, y2):
    squaredDistance = (x2 - x1) ** 2 + (y2 - y1) ** 2
    return squaredDistance
 
 
if __name__ == "__main__":
    T = int(inputdata().strip())
    
    fnNumberOfExistence(T)




# 3


# 0 0 13 40 0 37
# 2

# 0 0 3 0 7 4
# 1

# 1 1 1 1 1 5
# 0
