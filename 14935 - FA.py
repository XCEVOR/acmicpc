import sys
inputdata = sys.stdin.readline

def fnFXFunction(x):
    x_ls = [int(i) for i in str(x)]
    # print(x_ls)         # test print
    
    fx = x_ls[0] * len(x_ls)
    # print(fx)           # test print
    
    if x != fx:
        fnFXFunction(fx)
    elif x == fx:
        print("FA")


if __name__ == "__main__":
    x = int(inputdata().strip())
    
    fnFXFunction(x)
