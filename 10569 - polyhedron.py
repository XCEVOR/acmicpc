import sys
inputdata = sys.stdin.readline

def fnNumberOfPlanes(V, E):
    NoP = 2 - V + E
    print(NoP)


if __name__ == "__main__":
    T = int(inputdata().strip())
    
    for _ in range(T):
        V, E = map(int, inputdata().split())
        fnNumberOfPlanes(V, E)
