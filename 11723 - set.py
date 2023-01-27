import sys
inputdata = sys.stdin.readline


def fnAdd(x):
    s_ls[x] = 1

def fnRemove(x):
    s_ls[x] = 0

def fnCheck(x):
    if s_ls[x] == 1:
        print(1)
    elif s_ls[x] == 0:
        print(0)

def fnToggle(x):
    if s_ls[x] == 1:
        s_ls[x] = 0
    elif s_ls[x] == 0:
        s_ls[x] = 1

def fnAll():
    for i in range(21):
        s_ls[i] = 1

def fnEmpty():
    for i in range(21):
        s_ls[i] = 0


if __name__ == "__main__":
    s_ls = [0] * 21
    
    testCase = int(inputdata().strip())
    
    while testCase > 0:
        command_ls = list(map(str, inputdata().split()))
        
        if len(command_ls) == 2:
            command = command_ls[0]
            x = int(command_ls[1])
            if command == "add":
                fnAdd(x)
            elif command == "remove":
                fnRemove(x)
            elif command == "check":
                fnCheck(x)
            elif command == "toggle":
                fnToggle(x)
                
        elif len(command_ls) == 1:
            command = command_ls[0]
            if command == "all":
                fnAll()
            elif command == "empty":
                fnEmpty()
        
        testCase -= 1
        # print(s_ls)
