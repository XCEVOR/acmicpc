import sys
inputdata = sys.stdin.readline


def fnMakeACall(text):
    total_sec = 0
    for t in text:
        if t == 'A' or t == 'B' or t == 'C':
            total_sec += 3
        elif t == 'D' or t == 'E' or t == 'F':
            total_sec += 4
        elif t == 'G' or t == 'H' or t == 'I':
            total_sec += 5
        elif t == 'J' or t == 'K' or t == 'L':
            total_sec += 6
        elif t == 'M' or t == 'N' or t == 'O':
            total_sec += 7
        elif t == 'P' or t == 'Q' or t == 'R' or t == 'S':
            total_sec += 8
        elif t == 'T' or t == 'U' or t == 'V':
            total_sec += 9
        elif t == 'W' or t == 'X' or t == 'Y' or t == 'Z':
            total_sec += 10
    
    return total_sec


if __name__ == "__main__":
    text = str(inputdata().strip())
    
    result = fnMakeACall(text)
    print(result)
