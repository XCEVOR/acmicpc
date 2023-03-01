import sys
inputdata = sys.stdin.readline


def fnVerticalReading():
    result = ""
    
    for i in range(15):
        if len(line_1) >= i + 1:
            result += line_1[i]
        if len(line_2) >= i + 1:
            result += line_2[i]
        if len(line_3) >= i + 1:
            result += line_3[i]
        if len(line_4) >= i + 1:
            result += line_4[i]
        if len(line_5) >= i + 1:
            result += line_5[i]
    
    print(result)


if __name__ == "__main__":
    for i in range(1, 6):
        globals()['line_' + str(i)] = list(map(str, inputdata().strip()))
        
    fnVerticalReading()
