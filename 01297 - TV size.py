import sys
inputdata = sys.stdin.readline
import math


def fnHeightWidth(D, H, W):
    multiplier = (D**2 / (H**2 + W**2)) ** (1/2)
    
    height = multiplier * H
    # print(height)           # test print
    
    width = multiplier * W
    # print(width)            # test print
    
    print(math.floor(height), math.floor(width))


if __name__ == "__main__":
    D, H, W = map(int, inputdata().split())
    
    fnHeightWidth(D, H, W)
