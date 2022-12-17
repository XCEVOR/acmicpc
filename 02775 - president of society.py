import sys
inputdata = sys.stdin.readline


def fnHowManyPeopleLive(k, n):
    apartment = [[0] * (n + 1) for _ in range(k + 1)]
    for i in range(n + 1):
        apartment[0][i] = i
    
    for floor in range(1, k + 1):
        for room in range(1, n + 1):
            apartment[floor][room] = apartment[floor][room - 1] + apartment[floor - 1][room]
    
    # print(apartment)            # test print
    print(apartment[k][n])


if __name__ == "__main__":
    T = int(inputdata().strip())
    for _ in range(T):
        k = int(inputdata().strip())
        n = int(inputdata().strip())
        
        fnHowManyPeopleLive(k, n)
