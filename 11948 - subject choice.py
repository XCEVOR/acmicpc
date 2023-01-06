import sys
inputdata = sys.stdin.readline


def fnMaxSum():
    first_group.sort()
    first_group_slicing = first_group[-3:]
    
    second_group.sort()
    second_group_slicing = second_group[-1:]
    
    print(sum(first_group_slicing) + sum(second_group_slicing))


if __name__ == "__main__":
    first_group = []
    second_group = []
    for _ in range(4):
        first_group.append(int(inputdata().strip()))
    for _ in range(2):
        second_group.append(int(inputdata().strip()))
    
    fnMaxSum()
