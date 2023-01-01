import sys
inputdata = sys.stdin.readline


def fnSumOfNum(serial):
    sNum = 0
    sNum_serial = []
    for s in serial:
        if s.isdigit():
            sNum += int(s)
    sNum_serial.append(sNum)
    sNum_serial.append(serial)
    return sNum_serial
    

def fnSortAndPrint(serialLen_ls):
    for i in range(len(serialLen_ls)):
        if serialLen_ls[i] != 0:
            serialLen_ls[i].sort(key = lambda x : (x[0], x[1]))
            # print(serialLen_ls[i])          # TEST PRINT
            
            for j in range(len(serialLen_ls[i])):
                print(serialLen_ls[i][j][1])


if __name__ == "__main__":
    n = int(inputdata().strip())
    
    serialLen_ls = [[] for _ in range(51)]
    # print(serialLen_ls)                     # TEST PRINT
    for _ in range(n):
        serial = str(inputdata().strip())
        serialLen = len(serial)
        sNum_serial = fnSumOfNum(serial)
        serialLen_ls[serialLen].append(sNum_serial)
    # print(serialLen_ls)                     # TEST PRINT
    fnSortAndPrint(serialLen_ls)
