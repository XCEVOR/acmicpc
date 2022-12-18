import sys
inputdata = sys.stdin.readline


def fnIsPlayerInTheRink(px, py):
    (W, H, X, Y, P) = rink_info
    
    if X > px:
        if (px - X)**2 + (py - (Y + H/2))**2 <= (H/2)**2:
            return 1
    elif X <= px <= X + W:
        if Y <= py <= (Y + H):
            return 1
    elif X + W < px:
        if (px - (X + W))**2 + (py - (Y+H/2))**2 <= (H/2)**2:
            return 1
    return 0
    

if __name__ == "__main__":
    rink_info = list(map(int, inputdata().split()))
    
    count = 0
    for _ in range(rink_info[4]):
        px, py = map(int, inputdata().split())
        count += fnIsPlayerInTheRink(px, py)
    
    print(count)
