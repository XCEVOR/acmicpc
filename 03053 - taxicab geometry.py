import sys
inputdata = sys.stdin.readline

import math


def fnEuclideanGeometry(r):
    # pi = 3.141592653589793
    # pi = math.acos(-1)
    EG_area = math.pi * r ** 2
    return round(EG_area, 6)

def fnTaxicabGeometry(r):
    TG_area = ((2 * r) ** 2) / 2
    return round(TG_area, 6)


if __name__ == "__main__":
    r = int(inputdata().strip())
    
    EG_area = fnEuclideanGeometry(r)
    print(EG_area)
    
    TG_area = fnTaxicabGeometry(r)
    print(TG_area)
