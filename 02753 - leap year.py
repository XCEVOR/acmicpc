import sys
inputdata = sys.stdin.readline

year = int(inputdata().strip())

if (year % 4 == 0 and year % 100 != 0) or year % 400 == 0:
    print(1)
else:
    print(0)
