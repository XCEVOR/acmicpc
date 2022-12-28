import sys
inputdata = sys.stdin.readline


def fnNumberOfRejections():
    count = 0
    computer_ls = [0] * 101
    for _ in range(len(customer_ls)):
        temp = customer_ls.pop()
        if computer_ls[temp] == 0:
            computer_ls[temp] = 1
        elif computer_ls[temp] == 1:
            count += 1
    
    print(count)


if __name__ == "__main__":
    n = int(inputdata().strip())
    customer_ls = list(map(int, inputdata().split()))
    
    fnNumberOfRejections()
