import sys
inputdata = sys.stdin.readline


if __name__ == "__main__":
    max_passengers_ls = []
    passengers = 0
    for _ in range(4):
        get_off, get_on = map(int, inputdata().split())
        passengers = passengers - get_off + get_on
        max_passengers_ls.append(passengers)
    
    print(max(max_passengers_ls))
